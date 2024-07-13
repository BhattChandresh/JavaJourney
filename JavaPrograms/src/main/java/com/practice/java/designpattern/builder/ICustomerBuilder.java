package main.java.com.practice.java.designpattern.builder;

public interface ICustomerBuilder {

    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder middleName(String middleName);
    ICustomerBuilder primaryEmail(String primaryEmail);
    ICustomerBuilder secondaryEmail(String seconadaryEmail);
    ICustomerBuilder primaryMobileNumber(String primaryMobileNumber);
    ICustomerBuilder secondaryMobileNumber(String secondaryMobileNumber);
}
