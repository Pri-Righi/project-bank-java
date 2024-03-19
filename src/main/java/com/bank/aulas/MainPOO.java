package com.bank.aulas;

import com.bank.model.*;
import com.bank.model.Pessoa;

public class MainPOO {

	public static void main(String[] args) {
		ContaEstudo contaUm = new ContaEstudo();
		contaUm.setNif("123456789");

		System.out.println(contaUm.getNif());

		contaUm.setIban("233456789");

		System.out.println(contaUm.getIban());

		contaUm.setSaldo(3450.00);

		System.out.println(contaUm.getSaldo());

	}
}
