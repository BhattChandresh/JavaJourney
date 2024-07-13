/**
 * Create a Customer Object with,
 * Mandatory attributes - firstName, lastName and
 * Optional attributes - middleName and age.
 * We create several overloaded constructors that calls the default constructor with default values for missing inputs.
 */


package main.java.com.practice.java.designpattern.builder;

public class CustomerWithoutBuilder {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;

    public CustomerWithoutBuilder(String firstName, String lastName, String middleName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public CustomerWithoutBuilder(String firstName, String lastName, String middleName) {
        this(firstName, lastName,middleName, -1);
    }

    public CustomerWithoutBuilder(String firstName, String lastName, int age) {
        this(firstName, lastName, null, age);
    }

    public CustomerWithoutBuilder(String firstName, String lastName) {
        this(firstName, lastName, null, -1);
    }
}
