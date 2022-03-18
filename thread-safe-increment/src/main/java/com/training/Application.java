package com.training;

import java.util.List;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Application application = new Application();
        application.runNotThreadSafeIncrementing();
        application.runThreadSafeIncrementing();
    }

    private void runNotThreadSafeIncrementing() throws InterruptedException {
        NotThreadSafeRunnable notThreadSafeRunnable = new NotThreadSafeRunnable();
        List<Thread> threads = List.of(
                new Thread(notThreadSafeRunnable),
                new Thread(notThreadSafeRunnable),
                new Thread(notThreadSafeRunnable),
                new Thread(notThreadSafeRunnable)
        );
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Not threadsafe incrementing: " + notThreadSafeRunnable.getSharedResource());
    }

    private void runThreadSafeIncrementing() throws InterruptedException {
        ThreadSafeRunnable threadSafeRunnable = new ThreadSafeRunnable();
        List<Thread> threads = List.of(
                new Thread(threadSafeRunnable),
                new Thread(threadSafeRunnable),
                new Thread(threadSafeRunnable),
                new Thread(threadSafeRunnable)
        );
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Threadsafe incrementing: " + threadSafeRunnable.getSharedResource());
    }
}
