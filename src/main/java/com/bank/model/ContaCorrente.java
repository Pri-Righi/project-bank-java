package com.bank.model;

public class ContaCorrente extends Conta {
    private static final String TIPO_CONTA = "Conta corrente";
    @Override
    public String getTipoConta() {
        return TIPO_CONTA;
    }
}