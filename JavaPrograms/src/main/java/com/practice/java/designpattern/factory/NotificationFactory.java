/**
 *  Couertsy : From Scaler Academy.
 *  The factory class in the factory design pattern is responsible for creating objects based on the request from the client.
 */
package main.java.com.practice.java.designpattern.factory;

public class NotificationFactory {

    public Notification createNotification(String notificationType) {

        if (notificationType == null || notificationType.isEmpty()) {
            return null;
        }

        if(notificationType.equals("SMS")) {
            return new Sms();
        } else if(notificationType.equals("Push")) {
            return new Push();
        } else if(notificationType.equals("Email")) {
            return new Email();
        } else {
            throw new IllegalArgumentException("Unknown Notification Type " + notificationType);
        }
    }
}
