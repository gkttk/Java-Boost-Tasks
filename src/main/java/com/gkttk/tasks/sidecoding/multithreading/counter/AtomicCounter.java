package com.gkttk.tasks.sidecoding.multithreading.counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter implements Runnable {
    private static AtomicInteger counter;
    private static final int limit = 100;
    private static final int threadPoolSize = 5;

    public static void main(String[] args) {
        counter = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
        for (int i = 0; i < threadPoolSize; i++) {
            executorService.submit(new SynchronizedCounter());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
        while (counter.get() < limit) {
            System.out.println(Thread.currentThread().getName() + " : " + counter.getAndIncrement());
        }
    }


}
