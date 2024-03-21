package com.bank.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    //ATRIBUTOS
    private String numeroDaConta;
    private double saldo;
    private String cpf;

    public Conta () {

    }

    public Conta(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    //METODO
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