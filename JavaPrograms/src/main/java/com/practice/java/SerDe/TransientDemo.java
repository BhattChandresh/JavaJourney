package com.practice.java.SerDe;

import com.practice.java.Author;

import java.io.*;

@Author("Chandresh Bhatt")
public class TransientDemo {
    public static void main(String[] args) {
        SerDe_2 serde = new SerDe_2();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        //SERIALIZATION
        try {
            System.out.println("Before Serialization i = " + serde.i);
            System.out.println("Before Serialization j = " + serde.j);
            System.out.println("Before Serialization j = " + SerDe_2.k);
            System.out.println("Before Serialization j = " + serde.u);
            fos = new FileOutputStream("SerDe_2.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(serde);
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }

        //DESERIALIZATION
        try {
            fis = new FileInputStream("SerDe_2.ser");
            ois = new ObjectInputStream(fis);
            SerDe_2 serde_deser = (SerDe_2) ois.readObject();
            System.out.println("After Deserialization i = " + serde_deser.i);
            System.out.println("After Deserialization j = " + serde_deser.j);
            System.out.println("After Deserialization j = " + serde_deser.k);
            System.out.println("After Deserialization j = " + serde_deser.u);
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class SerDe_2 implements Serializable {
    int i = 100;
    transient int j = 200;
    static transient int k = 300;
    final transient int u = 999;
}