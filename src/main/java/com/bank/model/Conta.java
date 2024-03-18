package com.bank.model;

public abstract class Conta {
    private String numeroDaConta;
    private double saldo;
    private String cpf;

    public abstract String getTipoConta();

    //ENCAPSULAMENTO get e set
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
