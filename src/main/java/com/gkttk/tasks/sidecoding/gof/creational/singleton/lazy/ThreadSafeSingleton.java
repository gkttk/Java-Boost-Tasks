package com.gkttk.tasks.sidecoding.gof.creational.singleton.lazy;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
