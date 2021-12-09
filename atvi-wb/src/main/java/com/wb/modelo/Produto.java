package com.wb.modelo;

public class Produto {
	public String nome;
	public Number valor;
	public Produto(String nome, Number valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
}