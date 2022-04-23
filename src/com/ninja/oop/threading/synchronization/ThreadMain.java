package com.ninja.oop.threading.synchronization;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MultiplicationTable m = new MultiplicationTable();
//
//        Thread1 t1 = new Thread1(m);
//        Thread2 t2 = new Thread2(m);
//        Thread3 t3 = new Thread3(m);
//
//        t1.start();
//        t2.start();
//        t3.start();
        // For single thread
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // For multiple threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Thread1(m));
        executorService.execute(new Thread2(m));
        executorService.execute(new Thread3(m));
        executorService.shutdown();
    }
}
