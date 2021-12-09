package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class EditarServico extends Edicao {
	private List<Servico> servicos;
	private Entrada entrada;
	
	public EditarServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}

	@Override
	public void editar() {
		System.out.println("======================================");
		System.out.println("Identifique o serviço pelo nome");
		Entrada entrada = new Entrada();
		String nome = entrada.receberTexto();
		SelecaoServico selecionador = new SelecaoServico(servicos, nome);
		Servico servicoselecionado = selecionador.selecionar();
		
		System.out.println("Qual informação deseja alterar?");
		System.out.println("1 - Nome");
		System.out.println("2 - Valor");
		
		Entrada entrada2 = new Entrada();
		int operacao = entrada.receberNumeroInteiro();
		switch(operacao) {
		case 1:
			System.out.println("Informe o nome do produto");
			servicoselecionado.nome = entrada2.receberTexto();
			break;
		case 2:
			System.out.println("Informe o valor do produto");
			servicoselecionado.valor = entrada2.receberNumeroDouble();
		}
	}

}
