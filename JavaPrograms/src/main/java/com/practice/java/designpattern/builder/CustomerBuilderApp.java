package main.java.com.practice.java.designpattern.builder;

public class CustomerBuilderApp {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Chandresh")
                .lastName("Bhatt")
                .primaryEmail("cb@yahoo.com")
                .primaryMobileNumber("123456789")
                .build();

        System.out.println("Constructed Customer is : " + customer.toString());

    }
}
