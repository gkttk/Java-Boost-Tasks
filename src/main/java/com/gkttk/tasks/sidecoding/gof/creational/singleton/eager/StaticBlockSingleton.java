package com.gkttk.tasks.sidecoding.gof.creational.singleton.eager;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {

        return instance;
    }

}
