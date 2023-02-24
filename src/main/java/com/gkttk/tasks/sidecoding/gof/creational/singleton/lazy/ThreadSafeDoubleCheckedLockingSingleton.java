package com.gkttk.tasks.sidecoding.gof.creational.singleton.lazy;

public class ThreadSafeDoubleCheckedLockingSingleton {

    private static ThreadSafeDoubleCheckedLockingSingleton instance;

    public static ThreadSafeDoubleCheckedLockingSingleton getInstanceUsingDoubleLocking() {

        if (instance == null) {
            synchronized (ThreadSafeDoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

}
