package com.practice.java.serializationdeserialization;

import com.practice.java.Author;

import java.io.*;

@Author("Chandresh Bhatt")
public class SerializationDeserializationDemo {
    public static void main(String[] args) {
        SerDe_1 serde = new SerDe_1();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        //SERIALIZATION
        try {
            System.out.println("Before Serialization i = " + serde.i);
            System.out.println("Before Serialization j = " + serde.j);
            fos = new FileOutputStream("SerDe_1.ser");
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
            fis = new FileInputStream("SerDe_1.ser");
            ois = new ObjectInputStream(fis);
            SerDe_1 serde_deser = (SerDe_1) ois.readObject();
            System.out.println("After Deserialization i = " + serde_deser.i);
            System.out.println("After Deserialization j = " + serde_deser.j);
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

class SerDe_1 implements Serializable {
    int i = 100;
    int j = 200;
}