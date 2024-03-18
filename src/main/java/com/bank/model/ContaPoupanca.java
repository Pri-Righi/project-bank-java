package com.bank.model;

public class ContaPoupanca extends Conta {
    private static final String TIPO_CONTA = "Conta poupança";
    @Override
    public String getTipoConta() {
        return TIPO_CONTA;
    }
}
