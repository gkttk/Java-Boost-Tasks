package com.gkttk.tasks.sidecoding.multithreading.counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SynchronizedCounter implements Runnable {

    private static final int limit = 100;
    private static final int threadPoolSize = 5;
    private static final Object lock = new Object();
    private static int counter = 0;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
        for (int i = 0; i < threadPoolSize; i++) {
            executorService.submit(new SynchronizedCounter());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {

        synchronized (lock) {
            while (counter < limit) {
                increaseCounter();
            }
        }
    }

    private void increaseCounter() {

        counter++;
        System.out.println(Thread.currentThread().getName() + " : " + counter);

    }
}