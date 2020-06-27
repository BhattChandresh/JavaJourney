package com.practice.java.conCurrentCollection;

import com.practice.java.Author;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
@Author("Chandresh Bhatt")
public class ConCurrentHashMap_CCMException {
    public static void main(String... args) {
        Map<Integer,String> map = new ConcurrentHashMap<Integer,String>();

        for(int i=0; i< 10000;i++) {
            map.put(i, ("AB" + i));
        }

        Runnable r = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("ChildThread adding the elements");
            map.put(11000,"HHH");
        };

        Thread t = new Thread(r, "ChildThread");
        t.start();

        Set set = map.keySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            int element = (int) itr.next();
            System.out.println("Main Thread is iterating over the ArrayList and current element is = " + element + "," + map.get(element));
            try{
                Thread.sleep(50);
            } catch (InterruptedException ie) {

            }
        }
    }
}
