package com.parse.starter.util;

import java.util.HashMap;

public class ParseErros {

    private HashMap<Integer, String> erros;

    public ParseErros() {
        this.erros = new HashMap<>();
        this.erros.put(201, "A senha não foi preenchida!");
        this.erros.put(202, "Usuário já existe, escolha um outro nome de usuário!!");
    }

    public String getErro(int codErro){
        return this.erros.get( codErro );
    }

}
