/**
 *  Couertsy : From Scaler Academy.
 */

package main.java.com.practice.java.designpattern.factory;

public class Sms implements Notification {
    @Override
    public void userNotification() {
        System.out.println("SMS Notification Sent.....");
    }
}
