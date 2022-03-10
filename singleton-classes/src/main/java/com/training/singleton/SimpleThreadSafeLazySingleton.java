package com.training.singleton;

public class SimpleThreadSafeLazySingleton {
    private static SimpleThreadSafeLazySingleton instance;

    private SimpleThreadSafeLazySingleton(){

    }

     public static synchronized SimpleThreadSafeLazySingleton getInstance() {
        if(instance == null){
            instance = new SimpleThreadSafeLazySingleton();
        }
        return instance;
    }
}
