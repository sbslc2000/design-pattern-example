package io.github.sbslc2000.singleton;

public class SingletonV2 {
    private static SingletonV2 uniqueInstance = null;

    private SingletonV2() {
    }

    public static synchronized SingletonV2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonV2();
        }
        return uniqueInstance;
    }
}
