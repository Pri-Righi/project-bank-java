package com.bank.model;

public class ContaPoupanca extends Conta {
    private static final String TIPO_CONTA = "Conta poupança";

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
    }

    @Override
    public String getTipoConta() {

        return TIPO_CONTA;
    }
}
