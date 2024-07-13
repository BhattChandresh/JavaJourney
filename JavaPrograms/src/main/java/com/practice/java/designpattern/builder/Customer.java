package main.java.com.practice.java.designpattern.builder;

public class Customer {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String seconadryEmail;
    private final String primaryMobileNumber;
    private final String secondaryMobileNumber;

    public Customer(CustomerBuilder customerBuilder) {
        firstName = customerBuilder.getFirstName();
        middleName = customerBuilder.getMiddleName();
        lastName = customerBuilder.getLastName();
        primaryEmail = customerBuilder.getPrimaryEmail();
        seconadryEmail = customerBuilder.getSeconadryEmail();
        primaryMobileNumber = customerBuilder.getPrimaryMobileNumber();
        secondaryMobileNumber = customerBuilder.getSecondaryMobileNumber();
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

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", seconadryEmail='" + seconadryEmail + '\'' +
                ", primaryMobileNumber='" + primaryMobileNumber + '\'' +
                ", secondaryMobileNumber='" + secondaryMobileNumber + '\'' +
                '}';
    }
}
