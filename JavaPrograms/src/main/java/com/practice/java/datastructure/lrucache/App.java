package com.practice.java.datastructure.lrucache;

public class App {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.display();
        System.out.println();
        cache.refer(2);
        cache.display();
        System.out.println();
        cache.refer(3);
        cache.display();
        System.out.println();
        cache.refer(1);
        cache.display();
        System.out.println();
        cache.refer(4);
        cache.display();
        System.out.println();
        cache.refer(5);
        cache.display();
        System.out.println();
        cache.refer(2);
        cache.display();
        System.out.println();
        cache.refer(2);
        cache.display();
        System.out.println();
        cache.refer(1);
        cache.display();
    }
}
