package com.github.Arthurvenicio03.Singleton;

/**
 * SINGLETON PREGUIÇOSO
 * @author ARTHUR VENICIO
 */
public class singletonLazy {
    private static singletonLazy instancia;
    private singletonLazy() {
        super();
    }

    public static singletonLazy getInstance(){
        if (instancia == null){
            instancia = new singletonLazy();
        }
        return instancia;
    }
}
