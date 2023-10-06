package com.github.Arthurvenicio03.subsistema2_cep;

public class cepAPI {
    private static cepAPI instancia = new cepAPI();

    private cepAPI(){
        super();
    }
    public static cepAPI getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Araraquara";
    } 
    public String recuperarEstadp(String cep){
        return "Maceió";
    } 
}
