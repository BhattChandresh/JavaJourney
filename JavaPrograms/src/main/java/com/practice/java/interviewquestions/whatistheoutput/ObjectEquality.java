package com.practice.java.interviewquestions.whatistheoutput;

public class ObjectEquality {
    public static void main(String[] args) {
        ObjectEquality object1 = new ObjectEquality();
        ObjectEquality object2 = new ObjectEquality();
        ObjectEquality object3 = object1;

        if(!object1.equals(object2)) {
            System.out.println("they are not equal");
        }

        if(object1 instanceof Object) {
            System.out.println("object1 is an Object");
        }

        if(object1.equals(object3)) {
            System.out.println("they are equal");
        }

    }
}
