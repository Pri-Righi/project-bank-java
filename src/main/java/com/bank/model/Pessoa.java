package com.bank.model;

import java.util.Date;

public abstract class Pessoa {
	//ATRIBUTOS
	private String cpf;
	private String nome;
	private Date dataNascimento;

	//CONSTRUTORERS
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa() {
	}

	//ENCAPSULAMENTOS
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
