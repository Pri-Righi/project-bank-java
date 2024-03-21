package com.bank.model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    //ATRIBUTOS
    private double rendaMensal;


    //CONSTRUTORES
    public Cliente(String nome) {
        super(nome);
    }
    public Cliente() {
    }

    //ENCAPSULAMENTOS
    public double getRendaMensal() {
        return rendaMensal;
    }
    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }



}
