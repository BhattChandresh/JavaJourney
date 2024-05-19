/**
 *  Couertsy : From Scaler Academy.
 */
package main.java.com.practice.java.designpattern.factory;

public class Email implements Notification{
    @Override
    public void userNotification() {
        System.out.println("Email Notification sent.....");
    }
}
