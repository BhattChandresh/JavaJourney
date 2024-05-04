/**
 * Definition:
 * The Singleton Pattern ensures a class has only one
 * instance, and provides a global point of access to it.
 * <p>
 * Advantage: Singleton design pattern reduces memory usage by sharing a single instance across the application.
 * <p>
 * Use cases:
 * You need to control concurrent access to a shared resource.
 * Only one instance of the object is sufficient throughout the context of the application.
 * More than one independent parts of the application require access to the resource.
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

        System.out.println("------------------------------------------------------------------");

        while (true) {
            SingleTonEagarInitialization singleTonEagarInitialization = SingleTonEagarInitialization.getUniqueInstance();
            TimeUnit.SECONDS.sleep(2);
            count += 1;
            if (count >= 5) {
                count = 0;
                break;
            }
        }

        System.out.println("------------------------------------------------------------------");

        while (true) {
            ThreadSafeSingleTon singleTon = ThreadSafeSingleTon.getUniqueInstance();
            TimeUnit.SECONDS.sleep(2);
            count += 1;
            if (count >= 5) {
                count = 0;
                break;
            }
        }

        System.out.println("------------------------------------------------------------------");

        while(true) {
            DoubleLockSingleTon singleTon = DoubleLockSingleTon.getUniqueInstance();
            TimeUnit.SECONDS.sleep(2);
            count += 1;
            if (count >= 5) {
                count = 0;
                break;
            }
        }

        System.out.println("------------------------------------------------------------------");

        SingelTonEnum singleTon = SingelTonEnum.UNIQUE_INSTANCE;
        System.out.println(singleTon.getValue());
        singleTon.setValue(2);
        System.out.println(singleTon.getValue());
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

class ThreadSafeSingleTon {
    private static ThreadSafeSingleTon uniqueInstance;

    private ThreadSafeSingleTon() {

    }

    public static synchronized ThreadSafeSingleTon getUniqueInstance() {
        if (uniqueInstance == null) {
            System.out.println("Thread Safe SingleTon Instance created");
            uniqueInstance = new ThreadSafeSingleTon();
        }
        System.out.println("Returning Thread-safe SingleTon Instance");
        return uniqueInstance;
    }
}

class DoubleLockSingleTon {
    private static volatile DoubleLockSingleTon uniqueInstance;

    private DoubleLockSingleTon() {

    }

    public static DoubleLockSingleTon getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleLockSingleTon.class) {
                if (uniqueInstance == null) {
                    System.out.println("Creating Double Lock SingleTon Instance");
                    uniqueInstance = new DoubleLockSingleTon();
                }
            }
        }
        System.out.println("Returning DoubleLock SingleTon Instance");
        return uniqueInstance;
    }
}

/*
we used a private constructor to create a singleton.
 But note that there are more than one ways to create an object.
 In Java, objects can also be created using other techniques like Reflection and Serialisation / Deserialisation.
 Both these methods will create new instances of the class even if the constructor in the class is private.

 If we happen to use ENUMs, we might be able to solve this problem.
 Enum field variable do not take participate in Serialization - Deserialization.
 Enums are thread safe by default.


 Internally Enums will be compiled as follows
 public final class SingelTonEnum {
    public final static SingelTonEnum INSTANCE = new SingelTonEnum();
    private SingelTonEnum() {}
}

 */

enum SingelTonEnum {
    UNIQUE_INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
