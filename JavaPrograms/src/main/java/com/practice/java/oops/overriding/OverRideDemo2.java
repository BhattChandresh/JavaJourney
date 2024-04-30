/**
 * Overriding:
 * Method in a subclass must have the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class.
 *
 *
 * 1. Overriding and Access Modifiers:
 * The access modifier for an overriding method can allow more, but not less, access than the overridden method.
 * For example, a protected instance method in the superclass can be made public, but not private, in the subclass.
 * Doing so will generate a compile-time error.
 *
 * 2. Final methods can not be overridden
 *
 * 3. Static methods can not be overridden(Method Overriding vs Method Hiding): When you define a static method with the same signature as a static method in the base class, it is known as method hiding.
 *
 * 4. The overriding method must have the same return type (or subtype). From Java 5.0 onwards it is possible to have different return types for an overriding method in the child class,
 * but the child’s return type should be a sub-type of the parent’s return type.
 * This phenomenon is known as the covariant return type.
 *
 * 5. We can call the parent class method in the overriding method using the super keyword.
 *
 * 6. If the super-class overridden method does not throw an exception, the subclass overriding method can only throw the unchecked exception, throwing a checked exception will lead to a compile-time error.
 *
 *7. If the superclass overridden method does throw an exception, the subclass overriding method can only throw the same, subclass exception.
 *  Throwing parent exceptions in the Exception hierarchy will lead to compile time error.
 *  Also, there is no issue if the subclass overridden method is not throwing any exception.
 */
package main.java.com.practice.java.oops.overriding;

public class OverRideDemo2 {
    public static void main(String[] args) {
        Parent_2 p1 = new Parent_2();
        p1.m2();

        Parent_2 p2 = new Child_2();
        p2.m2();
    }
}

class Parent_2 {
    private void m1() {
        System.out.println("From parent class -> m1() method");
    }

    protected void m2() {
        System.out.println("From parent class -> m2() method");
    }
}

class Child_2 extends Parent_2 {

    private void m1() {
           System.out.println("From Child Class -> m1() method which is not overriding method");
       }

        @Override
        public void m2() {
        System.out.println("From Child class -> overriding m2() method");
    }
}
