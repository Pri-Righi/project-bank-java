package com.bank.model;

public class ContaCorrente extends Conta {
    private static final String TIPO_CONTA = "Conta corrente";

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
    }

    @Override
    public String getTipoConta() {
        return TIPO_CONTA;

    }
}
