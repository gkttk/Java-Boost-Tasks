package com.gkttk.tasks.sidecoding.multithreading.counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreCounter implements Runnable {

    private static final int limit = 100;
    private static final int threadPoolSize = 5;
    private static final Semaphore semaphore = new Semaphore(1);
    private static int counter = 0;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
        for (int i = 0; i < threadPoolSize; i++) {
            executorService.submit(new SemaphoreCounter());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {

        try {
            semaphore.acquire();
            while (counter < limit) {
                increaseCounter();
            }
        } catch (InterruptedException e) {
            System.out.println("The current thread was interrupted");
        } finally {
            semaphore.release();
        }

    }

    private void increaseCounter() {

        counter++;
        System.out.println(Thread.currentThread().getName() + " : " + counter);

    }

}
