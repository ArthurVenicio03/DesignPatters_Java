package com.github.Arthurvenicio03.Singleton;

/**
 * SINGLETON LazyHolder
 * @author ARTHUR VENICIO
 */
public class singletonLazyHolder {
    private static class InstanceHolder{
        public static singletonLazyHolder instancia = new singletonLazyHolder();
    }

    private singletonLazyHolder() {
        super();
    }

    public static singletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
