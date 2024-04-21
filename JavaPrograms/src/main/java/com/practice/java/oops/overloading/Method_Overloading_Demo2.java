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

public class Method_Overloading_Demo2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.demoDisplay();
        derived.demoDisplay(10);
        derived.demoDisplay("Demo");
        System.out.println("------------------------------------------");
        // Reference Base can see only base class overloaded methods.
        Base base = new Derived();
        base.demoDisplay();

    }
}

class Base {
    public void demoDisplay() {
        System.out.println("Base class demoDisplay() method");
    }

    public String demoDisplay(String s) {
        System.out.println("Base class demoDisplay(String) method");
        return "";
    }

}

class Derived extends Base {
    public int demoDisplay(int n) {
        System.out.println("Derived class demoDisplay() method");
        return n;
    }
}
