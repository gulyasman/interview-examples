package com.training.singleton;

public class SimpleLazySingleton {
    private static SimpleLazySingleton instance;

    private SimpleLazySingleton() {

    }

    public static SimpleLazySingleton getInstance(){
        if(instance == null){
            instance = new SimpleLazySingleton();
        }
        return instance;
    }
}
