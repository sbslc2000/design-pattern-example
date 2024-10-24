package io.github.sbslc2000.singleton;

public class SingletonV3 {
    private static SingletonV3 uniqueInstance = new SingletonV3();

    private SingletonV3() {
    }

    public static SingletonV3 getInstance() {
        return uniqueInstance;
    }
}
