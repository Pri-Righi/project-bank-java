package com.bank.aulas;

public class MainImutavel {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		PessoaImutavel imutavel = new PessoaImutavel("priscila", 20);
		
		System.out.println(imutavel.getNome());

	}

}
