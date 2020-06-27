/**
 * # When we serialize the object then set of all objects which are reachable from that object will be serialized automatically.
 * This group of object is nothing but the Object Graph.
 */
package com.practice.java.SerDe;

import com.practice.java.Author;
import java.io.*;

@Author("Chandresh Bhatt")
public class ObjectGraphDemo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        ObjectGraphDemo graph = new ObjectGraphDemo();
        System.out.println("Before Serialization : " +  lion.tiger.leopard.t);
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
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch(IOException io) {
            io.printStackTrace();
        } finally {
            try {
               fos.close();
               oos.close();
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
            System.out.println("After Serialization : " +  lion.tiger.leopard.t);
            System.out.println("After Serialization : " + lion.tiger.leopard.s);
        } catch(FileNotFoundException fe) {
            fe.printStackTrace();
        } catch(ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch(IOException io) {
            io.printStackTrace();
        } finally {
            try {
                fis.close();
                ois.close();
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