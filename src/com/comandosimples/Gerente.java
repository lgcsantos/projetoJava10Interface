package com.comandosimples;

public class Gerente extends Funcionario implements Usuario {

    private int tempoGerencia;

    public int getTempoGerencia() {
        return tempoGerencia;
    }

    public void setTempoGerencia(int tempoGerencia) {
        this.tempoGerencia = tempoGerencia;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(getMatricula());
    }


    public void getMatricula(String s) {
    }
}
