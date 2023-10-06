package com.github.Arthurvenicio03;

import com.github.Arthurvenicio03.Singleton.SingletonEager;
import com.github.Arthurvenicio03.Singleton.singletonLazy;
import com.github.Arthurvenicio03.Singleton.singletonLazyHolder;
import com.github.Arthurvenicio03.Strategy.*;


public class Test {
    public static void main(String[] args) {
    /**SINGLETON*/
        System.out.println("Lazy_____________________");
        singletonLazy lazy = singletonLazy.getInstance();
        System.out.println(lazy);
        lazy = singletonLazy.getInstance();
        System.out.println(lazy);
        System.out.println("TEM QUE VOLTAR O MESMO ENDEREÇO DE MEMORIA");

        System.out.println("Eager ___________________");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
        System.out.println("TEM QUE VOLTAR O MESMO ENDEREÇO DE MEMORIA");

        System.out.println("LazyHolder___________________");
        singletonLazyHolder lazyHolder = singletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = singletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        System.out.println("TEM QUE VOLTAR O MESMO ENDEREÇO DE MEMORIA");
        System.out.println("____________________________________________________");
        /**STRATEGY*/
        System.out.println("UTILIZANDO STRATEGY: ");
        Comportamento Agressivo = new ComportamentoAgressivo();
        Comportamento Normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();

        //criando o robo e setando
        Robo robo = new Robo();
        robo.setComportamento(Normal);
        robo.mover();
        robo.mover();
        System.out.println("----------");
        

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        System.out.println("----------");
        robo.setComportamento(Agressivo);
        robo.mover();
        robo.mover();
    }
}
