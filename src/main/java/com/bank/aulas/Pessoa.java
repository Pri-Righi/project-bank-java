package com.bank.aulas;

public class Pessoa {
	private String nome; //pertence ao objeto
	public static String nomePriscila; // pertenca a classe Pessoa.nomePriscila
	public static final String nomeAntonio = "Antonio";

	public Pessoa(String nome) {
	}

	public Pessoa() {
	}

	//	public String retornaNome(String nomeCompleto) {
	//passa o nome completo e retorna o ultimo
	//	}

	public static String retornaUltimoNome(String nomeCompleto) {
		String[] nomeEmPartes = nomeCompleto.split(" ");
		if (nomeEmPartes.length > 1) {
			return nomeEmPartes[nomeEmPartes.length - 1];
		}
		return null;
	}
}
