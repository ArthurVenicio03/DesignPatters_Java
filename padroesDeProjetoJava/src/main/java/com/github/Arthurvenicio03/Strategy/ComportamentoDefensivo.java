package com.github.Arthurvenicio03.Strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void Mover() {
        System.out.println("Robo esta movendo-se Defensivamente...");
    }
}
