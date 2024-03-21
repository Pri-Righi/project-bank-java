package com.bank.aulas;

public class MainCondicoes {

	public static void main(String[] args) {
		
		
		String nome = "joao";
		int idade = 30;
		
		//nome diferente de antonio !nome.equals("antonio")
		//nome igual antonio nome.equals("antonio")
		if(!nome.equals("antonio")) {
			System.out.println("Diferente de antonio");
		}
		
		//idade diferente de 29 != 29
		//idade igual 29    idade != 29
		if(idade != 29) {
			System.out.println("Idade diferente de 29");
		}

		
		//boas praticas
		Integer idadeNaoPrimi = Integer.valueOf(idade);
		
		if(!idadeNaoPrimi.equals(Integer.valueOf(29))) {
			System.out.println("Idade diferente de 29");
		}
		
		//ternario condicao ? retorno verdadeiro : retorno falso
		System.out.println(nome.equals("antonio") ? "nome igual":"nome diferente");
		
		
		String textoIdade = idade > 29 ? "Maior que 29" : "menor ou igual";
		
		System.out.println(textoIdade);
		
	}

}
