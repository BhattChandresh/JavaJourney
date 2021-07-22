package com.practice.java.serializationdeserialization;

import com.practice.java.Author;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Author("")
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
            fis = new FileInputStream("SerDe_1.ser");
            ois = new ObjectInputStream(fis);
            SerDe_1 serde_deser = (SerDe_1) ois.readObject();
            System.out.println("After Deserialization i = " + serde_deser.i);
            System.out.println("After Deserialization j = " + serde_deser.j);
        } catch (IOException | ClassNotFoundException fe) {
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

class SerDe_1 implements Serializable {
    int i = 100;
    int j = 200;
}