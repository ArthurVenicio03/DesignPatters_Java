package com.github.Arthurvenicio03.Singleton;
/**
 * SINGLETON APRESSADO
 * @author ARTHUR VENICIO
 */


public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
