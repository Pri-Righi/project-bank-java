package com.bank.aulas;

import java.util.ArrayList;
import java.util.List;

public class MainLacoRepeticao {

	public static void main(String[] args) {
		
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Priscila");
		nomes.add("Righi");
		
		for(int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			System.out.println(nome);
		}
		
		
		System.out.println("============================================");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("============================================");
		
		nomes.forEach(nome -> {
			System.out.println(nome);
			System.out.println(nome);
		});
		
		
		//while
		
		int contador = 10;
		
		do {
			System.out.println(contador);
			contador++;
		} while (contador < 10);
		

		while (contador < 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("Write counter");
		
		writeCounter(0);
		

	}
	
	public static void writeCounter(int count) {
		System.out.println(count);
		count += 1;
		if(count < 10)
			writeCounter(count);
	}

}
