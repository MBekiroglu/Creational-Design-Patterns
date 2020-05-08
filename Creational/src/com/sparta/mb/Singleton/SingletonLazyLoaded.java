package com.sparta.mb.Singleton;

public class SingletonLazyLoaded {
    //If instantiated at top it's eagerly loaded
    //By doing this, the object it only instantiated once called upon
    private static SingletonLazyLoaded instance = null;

    private SingletonLazyLoaded() {
    }

    //Instantiating it within the method makes it
    // Lazy Loaded and increase performance
    public static SingletonLazyLoaded getInstance(){
        if(instance == null){
            instance = new SingletonLazyLoaded();
        }
        return instance;
    }
}
