package main.java.com.practice.java.oops.overriding;

public class OverRideDemo1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        Parent c = new Child();
        c.show();
    }
}

class Parent {
    void show(){
        System.out.println("Parent's show() method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show() method");
    }
}

