package com.practice.java.interviewquestions.whatistheoutput;

public class PassObjRefToMethod {

    public void m1(MyDemo1 d) {
        d.x = 888;
        d.y = 999;
        System.out.println("Inside method m1() = " + d.x + ", " + d.y);
    }

    public static void main(String[] args) {
        MyDemo1 myDemo1 = new MyDemo1();
        myDemo1.x = 10;
        myDemo1.y = 20;
        PassObjRefToMethod p = new PassObjRefToMethod();
        p.m1(myDemo1);
        System.out.println("Inside main method m1() = " + myDemo1.x + ", " + myDemo1.y);
    }
}

class MyDemo1 {
    int x;
    int y;
}
