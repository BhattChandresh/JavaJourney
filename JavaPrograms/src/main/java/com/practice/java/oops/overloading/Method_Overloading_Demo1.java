/**
 * NOTES
 * Overloaded methods  MUST  change the argument list.
 * Overloaded methods  CAN change  return type.
 * Overloaded methods CAN change access modifier.
 * Overloaded methods CAN declare new or broader exceptions.
 *
 * Can we overload static methods?
 * The answer is ‘Yes’. We can have two or more static methods with the same name, but differences in input parameters.
 */


package main.java.com.practice.java.oops.overloading;


import java.io.IOException;

//Method Overloading means Method Signature should be different.
// Signature includes type of parameter, no. of parameter and order of parameter.
// Return type should not be considered in Method Overloading.
//Modifier can also be changed in overloaded method.
public class Method_Overloading_Demo1 {
    public static void main(String[] args) throws IOException { //use throws because of 3rd method.
        Method_Overloading_Demo1 demo1 = new Method_Overloading_Demo1();
        demo1.add(5, 10);
        demo1.add(5.0, 10.0);
        demo1.add(5);
    }

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Overloaded method without return type , " + sum);
    }

    public int add(double a, double b) {
        int sum = (int) (a + b);
        System.out.println("Overloaded method with return type , " + sum);
        return sum;
    }

    public String add(int a) throws IOException {
        int sum = a + 10;
        System.out.println("Overloaded method with return type , " + sum);
        return String.valueOf(sum);
    }
}
