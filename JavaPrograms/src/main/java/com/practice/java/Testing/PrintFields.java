package com.practice.java.Testing;



import java.lang.reflect.Field;

public class PrintFields {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test1 t1 = new Test1("a", "10");
        Test1 t2 = new Test1("b", "20");
        Object[] obj = new Object[]{t1,t2};
        try {
            printFields(obj);
        } catch (Exception e) {

        }
    }

    public static void printFields(Object[] objects) throws Exception{
        for(int i=0; i < objects.length;i++) {
            Field[] f = objects[i].getClass().getDeclaredFields();
            for(int j=0; j< f.length;j++) {
                System.out.println(f[j]);
                Object o = f[j].get(objects[i]);
                System.out.println(o);
            }
        }
    }
}

class Test1 {
    String name;
    String age;
    Test1(String n, String age) {
        this.name = n; this.age = age;
    }

    @Override
    public String toString() {
        return (" Name = " + this.name + ", Age = " + this.age);
    }
}

