package com.practice.java.interviewcoding.hashmap;

public class HashNode<K, V> {
    K key;
    V value;
    int hashcode;
    HashNode<K, V> next;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashcode = hashCode;
    }
}
