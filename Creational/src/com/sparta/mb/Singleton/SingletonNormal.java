package com.sparta.mb.Singleton;

public class SingletonNormal {
    //Make a private and static instance so that it already exists
    private static SingletonNormal instance = new SingletonNormal();
    //So it cannot be created outside the program
    private SingletonNormal() {
    }

    public static SingletonNormal getInstance(){
        return instance;
    }
}
