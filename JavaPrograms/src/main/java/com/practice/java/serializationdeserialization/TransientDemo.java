package com.practice.java.serializationdeserialization;

import com.practice.java.Author;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Author("")
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
        } catch (IOException fe) {
            fe.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
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
            System.out.println("After Deserialization j = " + SerDe_2.k);
            System.out.println("After Deserialization j = " + serde_deser.u);
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