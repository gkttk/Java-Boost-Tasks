package com.gkttk.tasks.sidecoding.multithreading.counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter implements Runnable {

    private static final int limit = 100;
    private static final int threadPoolSize = 5;
    private static final Lock lock = new ReentrantLock(true);
    private static int counter = 0;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
        for (int i = 0; i < threadPoolSize; i++) {
            executorService.submit(new LockCounter());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {

        lock.lock();
        try {
            while (counter < limit) {
                increaseCounter();
            }
        } finally {
            lock.unlock();
        }

    }

    private void increaseCounter() {

        counter++;
        System.out.println(Thread.currentThread().getName() + " : " + counter);

    }

}
