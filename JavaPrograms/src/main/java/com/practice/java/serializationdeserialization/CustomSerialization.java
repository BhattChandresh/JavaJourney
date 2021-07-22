package com.practice.java.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerialization {
    public static void main(String[] args) {
        Account accnt = new Account();
        CustomSerialization custom = new CustomSerialization();
        custom.serialization(accnt);
        custom.deserialization();
    }

    void serialization(Object object) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("account.ser");
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
            fis = new FileInputStream("account.ser");
            ois = new ObjectInputStream(fis);
            Account accnt = (Account) ois.readObject();
            System.out.println("After Deserialization : " + accnt.userName);
            System.out.println("After Deserialization : " + accnt.pwd);
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


class Account implements Serializable {
    String userName = "Chandresh";
    transient String pwd = "password";

    private void writeObject(ObjectOutputStream os) throws Exception {
        System.out.println("Customer Serialization");
        os.defaultWriteObject();
        String ePwd = "123" + pwd;
        os.writeObject(ePwd);
    }

    private void readObject(ObjectInputStream oi) throws Exception {
        System.out.println("Customer De-Serialization");
        oi.defaultReadObject();
        System.out.println("Reading default Object : " + userName);
        System.out.println("Reading default Object : " + pwd);
        String epwd = (String) oi.readObject();
        pwd = epwd.substring(3);
    }
}