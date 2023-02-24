package com.gkttk.tasks.sidecoding.gof.creational.singleton.eager;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializationSingleton() {

    }

    public static EagerInitializationSingleton getInstance() {

        return instance;
    }

}
