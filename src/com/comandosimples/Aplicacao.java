package com.comandosimples;

public class Aplicacao {

    public static void main(String[] args) {

        AutenticadorDeUsuario autenticadorDeUsuario = new AutenticadorDeUsuario();
        Gerente gerente = new Gerente();
        gerente.getMatricula("1254");

        autenticadorDeUsuario.autentica(gerente);

        Empresa empresa = new Empresa() ;
        empresa.setCnpj("12545");
        autenticadorDeUsuario.autentica(empresa);

    }

}
