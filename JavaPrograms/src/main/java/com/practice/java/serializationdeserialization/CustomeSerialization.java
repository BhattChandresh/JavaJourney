package com.practice.java.serializationdeserialization;

import java.io.*;

public class CustomeSerialization {
    public static void main(String[] args) {
        Account accnt = new Account();
        CustomeSerialization custom = new CustomeSerialization();
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
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException io) {
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
            fis = new FileInputStream("account.ser");
            ois = new ObjectInputStream(fis);
            Account accnt = (Account) ois.readObject();
            System.out.println("After Deserialization : " + accnt.userName);
            System.out.println("After Deserialization : " + accnt.pwd);
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (IOException io) {
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