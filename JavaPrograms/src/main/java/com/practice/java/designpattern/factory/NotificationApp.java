/**
 *  Couertsy : From Scaler Academy.
 */
package main.java.com.practice.java.designpattern.factory;

public class NotificationApp {

    private static final String SMS = "SMS";
    private static final String EMAIL = "Email";
    private static final String PUSH = "Push";

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
       Notification notification = notificationFactory.createNotification(PUSH);
       notification.userNotification();
    }
}
