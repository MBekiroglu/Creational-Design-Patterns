package com.sparta.mb.Singleton;

//SINGLETON THREAD SAFE AND LAZY LOADED
public class SingletonTSLL {

    //VOLATILE TO ENSURE ALL WHO ACCESS IT HAVE THE MOST CURRENT VERSION
    private static volatile SingletonTSLL instance = null;

    private SingletonTSLL() {
        if (instance != null) {
            //Somehow prevent reflection classes or something by doing this
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static SingletonTSLL getInstance() {
        if (null == instance) {
            //Checks that no other application is trying to do this at the same time
            synchronized (SingletonTSLL.class) {
                if (null == instance) {
                    instance = new SingletonTSLL();
                }
            }
        }
        return instance;
    }
}
