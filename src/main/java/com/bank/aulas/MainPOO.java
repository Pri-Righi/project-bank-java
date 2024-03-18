package com.bank.aulas;

import com.bank.model.*;
import com.bank.model.Pessoa;

public class MainPOO {

	public static void main(String[] args) {
//		ContaEstudo contaUm = new ContaEstudo();
//		contaUm.setNif("123456789");
//
//		System.out.println(contaUm.getNif());
//
//		contaUm.setIban("233456789");
//
//		System.out.println(contaUm.getIban());
//
//		contaUm.setSaldo(3450.00);
//
//		System.out.println(contaUm.getSaldo());

		Conta conta = new ContaCorrente();
		System.out.println(conta.getTipoConta());
		 Conta conta1 = new ContaPoupanca();
		System.out.println(conta1.getTipoConta());

		Pessoa pessoa = new Cliente();
		if (pessoa instanceof Cliente) {
			System.out.println("essa pessoa é cliente");
		} else if (pessoa instanceof Funcionario) {
			System.out.println("essa pessoa é funcionario");

		}
	}


}
