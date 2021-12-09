package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class CadastroServico extends Cadastro {
	private List<Servico> servicos;
	private Entrada entrada;
	
	public CadastroServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("======================================");
		System.out.println("IN�CIO DO CADASTRO DO SERVI�O");
		System.out.println("Informe o nome do servi�o:");
		String nome = entrada.receberTexto(); //NOME DO SERVI�O
		System.out.println("Informe o valor do servi�o:");
		Number valor = entrada.receberNumeroDouble();
		System.out.println("======================================");
		
		Servico servico = new Servico(nome, valor);
		servico.nome = nome;
		servico.valor = valor;
		this.servicos.add(servico);
	}

}
