/*
Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.

 */
package com.practice.java.interviewcoding.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyHashMap<K, V> {
    private List<HashNode<K, V>> bucket;
    private int numBucket;
    private int size;

    /* Initialize your data structure here. */
    public MyHashMap() {
        bucket = new ArrayList<>();
        numBucket = 10;
        size = 0;

        //create empty chain
        for (int index = 0; index < numBucket; index++) {
            bucket.add(null);
        }
    }

    /* value will always be non-negative. */
    public void put(K key, V value) {
        //Find head of chain for given key.
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucket.get(bucketIndex);

        //If key is already present
        while (head != null) {
            if (head.key.equals(key) && head.hashcode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = bucket.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucket.set(bucketIndex, newNode);
        size += 1;

        //If load factor goes beyond threshold, then
        //double hash table size.
        if ((1.0 * size) / numBucket >= 0.7) {
            List<HashNode<K, V>> temp = bucket;
            bucket = new ArrayList<>();
            numBucket *= 2;
            size = 0;
            for (int index = 0; index < numBucket; index++) {
                bucket.add(null);
            }

            int count = 0;
            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    bucket.set(count, headNode);
                    headNode = headNode.next;
                    count += 1;
                }
            }
        }
    }

    /* Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> headNode = bucket.get(bucketIndex);

        while (headNode != null) {
            if (headNode.key.equals(key) && headNode.hashcode == hashCode) {
                return headNode.value;
            }
            headNode = headNode.next;
        }
        //If key is not found then return null;
        return null;
    }

    /* Removes the mapping of the specified value key if this map contains a mapping for the key */
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> headNode = bucket.get(bucketIndex);

        //If key is not present.
        if (headNode == null) {
            return null;
        }

        HashNode<K, V> prevNode = null;
        while (headNode != null) {
            if (headNode.key.equals(key) && headNode.hashcode == hashCode) {
                break;
            }
            prevNode = headNode;
            headNode = headNode.next;
        }

        if (prevNode != null) {
            prevNode.next = headNode.next;
        } else {
            bucket.set(bucketIndex, headNode.next);
        }
        size -= 1;
        return headNode.value;
    }

    protected int getSize() {
        return size;
    }

    protected int getBucketIndex(K key) {
        int myHashCode = hashCode(key);
        int index = myHashCode % numBucket;
        index = index < 0 ? (index * -1) : index;
        return index;
    }

    protected final int hashCode(K key) {
        return Objects.hashCode(key);
    }
}

