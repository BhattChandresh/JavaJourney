package com.practice.java.datastructure.lrucache;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {
    //Store keys of cache
    final private Deque<Integer> queue;
    //Store references of key  of cache
    final private HashSet<Integer> references;
    private final int CACHE_SIZE;

    public LRUCache(int capacity) {
        queue = new LinkedList<>();
        references = new HashSet<>();
        this.CACHE_SIZE = capacity;
    }

    public void refer(int page) {
        if (references.contains(page)) {
            queue.remove(page);
        } else {
            if (queue.size() == CACHE_SIZE) {
                int lastNode = queue.removeLast();
                references.remove(lastNode);
            }
        }
        queue.push(page);
        references.add(page);
    }

    public void display() {
        for (Integer integer : queue) {
            System.out.print(integer + "->");
        }
    }
}
