package io.github.sbslc2000.singleton;

public class SingletonV4 {
    private static volatile SingletonV4 uniqueInstance = null;

    private SingletonV4() {
    }

    public static SingletonV4 getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonV4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonV4();
                }
            }
        }
        return uniqueInstance;
    }
}
