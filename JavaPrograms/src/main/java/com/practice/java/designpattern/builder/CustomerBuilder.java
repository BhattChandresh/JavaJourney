package main.java.com.practice.java.designpattern.builder;

public class CustomerBuilder implements ICustomerBuilder{

    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String seconadryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    @Override
    public CustomerBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public CustomerBuilder primaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder secondaryEmail(String seconadaryEmail) {
        this.seconadryEmail = seconadaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder primaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    @Override
    public CustomerBuilder secondaryMobileNumber(String secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
        return this;
    }

    public Customer build() {
        return new Customer(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSeconadryEmail() {
        return seconadryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }
}
