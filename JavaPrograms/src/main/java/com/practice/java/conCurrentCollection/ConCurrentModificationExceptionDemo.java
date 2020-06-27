package com.practice.java.conCurrentCollection;

import com.practice.java.Author;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
@Author("Chandresh Bhatt")
public class ConCurrentModificationExceptionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i< 10000;i++) {
            list.add(i);
        }

        Runnable r = () -> {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ie) {
               ie.printStackTrace();
           }
           list.remove(50);
        };

        Thread t = new Thread(r, "ChildThread");
        t.start();

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            int element = (int) itr.next();
            System.out.println("Main Thread is iterating over the ArrayList and current element is = " + element);
            try{
                Thread.sleep(50);
            } catch (InterruptedException ie) {

            }
        }
    }
}
