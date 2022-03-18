package com.training;

public class NotThreadSafeRunnable implements Runnable{
    private int sharedResource = 0;

    @Override
    public void run() {
        for(int i = 0; i < 1_000; i++){
            increment();
        }
    }

    public int getSharedResource(){
        return sharedResource;
    }

    private void increment(){
        sharedResource++;
    }
}
