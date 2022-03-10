package com.training.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){

    }

    public EagerSingleton getInstance(){
        return INSTANCE;
    }
}
