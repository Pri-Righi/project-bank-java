package com.bank.aulas;

import com.bank.model.Conta;
import com.bank.model.ContaCorrente;
import com.bank.model.ContaPoupanca;

import java.util.Scanner;

public class ValidarContas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        String numeroConta = scan.next();
        System.out.println("Digite o saldo: ");
        double saldo = scan.nextDouble();

        ContaDtoEstudo dto = new ContaDtoEstudo(numeroConta, saldo);
        Conta conta = factoryConta(dto);
    }

    public static Conta factoryConta(ContaDtoEstudo dto) {
        if (dto.saldo() > 1000) {
            return new ContaCorrente(dto.numeroConta(), dto.saldo());
        } else {
            return new ContaPoupanca(dto.numeroConta(), dto.saldo());

        }
    }
}
