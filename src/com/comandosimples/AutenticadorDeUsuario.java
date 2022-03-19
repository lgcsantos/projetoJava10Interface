package com.comandosimples;

public class AutenticadorDeUsuario {

    public boolean autentica(Usuario usuario){
        System.out.println("Autenticando usuario com código: "  + usuario.getCodigo());
        return false;
    }
}
