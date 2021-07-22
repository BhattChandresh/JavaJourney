/*
 * # When we serialize the object then set of all objects which are reachable from that object will be serialized automatically.
 * This group of object is nothing but the Object Graph.
 */
package com.practice.java.serializationdeserialization;

import com.practice.java.Author;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Author("")
public class ObjectGraphDemo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        ObjectGraphDemo graph = new ObjectGraphDemo();
        System.out.println("Before Serialization : " + lion.tiger.leopard.t);
        System.out.println("Before Serialization : " + lion.tiger.leopard.s);
        //SERIALIZATION
        graph.serialization(lion);
        //DESERIALIZATION
        graph.deserialization();
    }

    void serialization(Object object) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("objectgraph.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
        } catch (IOException fe) {
            fe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }

    void deserialization() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("objectgraph.ser");
            ois = new ObjectInputStream(fis);
            Lion lion = (Lion) ois.readObject();
            System.out.println("After Serialization : " + lion.tiger.leopard.t);
            System.out.println("After Serialization : " + lion.tiger.leopard.s);
        } catch (ClassNotFoundException | IOException fe) {
            fe.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }
}


class Lion implements Serializable {
    Tiger tiger = new Tiger();
}

class Tiger implements Serializable {
    Leopard leopard = new Leopard();
}

class Leopard implements Serializable {
    int t = 888;
    int s = 999;
}