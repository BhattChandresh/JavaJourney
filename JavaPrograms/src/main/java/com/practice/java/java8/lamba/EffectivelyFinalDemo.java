package com.practice.java.java8.lamba;

public class EffectivelyFinalDemo {
    int x = 15;
    public void m2() {
        int y = 25;
        Interface i = () -> {
            System.out.println("x = " + x);
            // NOTE : Any local variable ( y in our case) which is referenced by Lambda expression is known as Effectively final or final.
            // One can't change the value of variable y.
            System.out.println("y = " + y);
       };
        // Now if we try to change the value of y then it generate the compile time error.

        x = 50;
        // Compile Time Error :
        //java: local variables referenced from a lambda expression must be final or effectively final
        //y = 30;

        i.m1();
    }
    public static void main(String[] args) {
        EffectivelyFinalDemo e = new EffectivelyFinalDemo();
        e.m2();
    }
}

interface Interface {
    public void m1();
}
