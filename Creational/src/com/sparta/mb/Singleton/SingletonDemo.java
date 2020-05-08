package com.sparta.mb.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        //Only allows the creation of the same instance

        SingletonTSLL instance = SingletonTSLL.getInstance();

        SingletonTSLL anotherInstance = SingletonTSLL.getInstance();

        System.out.println(instance);

        //They will equal the same object address
        if (instance == anotherInstance){
            System.out.println(true);
        }
    }
}
