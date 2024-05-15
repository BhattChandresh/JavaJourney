package main.java.com.practice.java.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

    //HashMap to store the cache data.
    Map<Integer, String> data = new HashMap<>();

    //Store the order of the cache access.
    LinkedList<Integer> order = new LinkedList<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        lruCache.display();
        System.out.println("Cache is full and add more data to it");
        lruCache.put(4, "D");
        lruCache.display();
        System.out.println("Cache is full and we access the existing data");
        lruCache.get(2);
        lruCache.display();
    }

    void put(int key, String value) {
        //If the cache is full then first remove the item (order) at tail and then add the cache data.
        if (order.size() >= capacity) {
            int lastIndex = order.removeLast();
            data.remove(lastIndex);
        }

        // If the HashMap (which stores the cache data) has space then add the data into HashMap
        //and, put order of this data at the begining of the list.
        order.addFirst(key);
        data.put(key, value);
    }

    String get(int key) {
        String value = data.get(key);
        if (value != null) {
            // If the value is present then first remove that data and add the data at the head of the node.
            order.remove(key);
            order.addFirst(key);

        } else {
            //If the value is not present then it is a cache miss and null will be returned.
            value = null;
        }

        return value;
    }

    void display() {
        for (int r = 0; r < order.size(); r++) {
            int key = order.get(r);
            System.out.println(key + " --> " + data.get(key));
        }
    }
}
