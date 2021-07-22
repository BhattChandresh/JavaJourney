package com.practice.java.serializationdeserialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {
    public static void main(String... args) {
        ExternalSerDeser e = new ExternalSerDeser(100, 200, "Serialization-Deserialization");
        ExternalizationDemo t = new ExternalizationDemo();
        t.serialization(e);
        t.deserialization();
    }

    void serialization(Object object) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("external.ser");
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
            fis = new FileInputStream("external.ser");
            ois = new ObjectInputStream(fis);
            ExternalSerDeser e = (ExternalSerDeser) ois.readObject();
            System.out.println("After Deserialization m =" + e.m);
            System.out.println("After Deserialization n =" + e.n);
            System.out.println("After Deserialization str =" + e.str);
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


class ExternalSerDeser implements Externalizable {

    int m;
    int n;
    String str;

    public ExternalSerDeser() {
        System.out.println("No args constructor");
    }

    public ExternalSerDeser(int m, int n, String str) {
        this.m = m;
        this.n = n;
        this.str = str;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal Method call");
        out.writeInt(m);
        out.writeObject(str);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal Method call");
        m = in.readInt();
        str = (String) in.readObject();
    }
}