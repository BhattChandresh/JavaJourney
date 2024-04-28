/**
 * Definition:
 * The Singleton Pattern ensures a class has only one
 * instance, and provides a global point of access to it.
 */

package main.java.com.practice.java.designpattern;

import java.util.concurrent.TimeUnit;

public class SingleTon {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;

        while (true) {
            SingleTonLazyInitialization singleTonLazyInitialization = SingleTonLazyInitialization.getUniqueInstance();
            TimeUnit.SECONDS.sleep(2);
            count += 1;
            if (count >= 5) {
                count = 0;
                break;
            }
        }


        while (true) {
            SingleTonEagarInitialization singleTonEagarInitialization = SingleTonEagarInitialization.getUniqueInstance();
            TimeUnit.SECONDS.sleep(2);
            count += 1;
            if (count >= 5) {
                count = 0;
                break;
            }
        }
    }
}


class SingleTonLazyInitialization {
    private static SingleTonLazyInitialization uniqueInstance;

    private SingleTonLazyInitialization() {

    }

    public static SingleTonLazyInitialization getUniqueInstance() {
        if (uniqueInstance == null) {
            System.out.println("SingleTon Instance created lazily");
            uniqueInstance = new SingleTonLazyInitialization();
        }
        System.out.println("Returning the Lazily created Singleton Instance");
        return uniqueInstance;
    }
}


class SingleTonEagarInitialization {
    private static final SingleTonEagarInitialization uniqueInstance = new SingleTonEagarInitialization();

    private SingleTonEagarInitialization() {
    }

    public static SingleTonEagarInitialization getUniqueInstance() {
        System.out.println("Returning Eagrly created singleton instances");
        return uniqueInstance;
    }
}
