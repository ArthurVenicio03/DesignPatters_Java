package com.github.Arthurvenicio03.Facade;

import com.github.Arthurvenicio03.subsistema2_cep.CrmService;
import com.github.Arthurvenicio03.subsistema2_cep.cepAPI;

public class facade {

    public void migrarCliente(String nome, String cep){
        String Cidade = cepAPI.getInstancia().recuperarCidade(cep);
        String estado = cepAPI.getInstancia().recuperarEstadp(cep);

        CrmService.gravarCliente(nome, cep, Cidade, estado);
    }
}
