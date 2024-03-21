package com.bank.aulas;

import com.bank.model.*;
import com.bank.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MainContaPessoa {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        System.out.println(conta.getTipoConta());
        Conta conta1 = new ContaPoupanca();
        System.out.println(conta1.getTipoConta());

//        Pessoa pessoa = new Cliente();
//        if (pessoa instanceof Cliente) {
//            System.out.println("essa pessoa é cliente");
//        } else if (pessoa instanceof Funcionario) {
//            System.out.println("essa pessoa é funcionario");
//        }

        Cliente.adicionarCliente(new Cliente("priscila"));
        Cliente.adicionarCliente(new Cliente("antonio"));
        Cliente.adicionarCliente(new Cliente("joão"));
        Cliente.adicionarCliente(new Cliente("joão"));
        Cliente.adicionarCliente(new Cliente("maria"));



    }

}
