package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Produto;

public class EditarProduto extends Edicao {
	private List<Produto> produtos;
	private Entrada entrada;
	
	public EditarProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}

	@Override
	public void editar() {
		System.out.println("======================================");
		System.out.println("Identifique o produto pelo nome");
		Entrada entrada = new Entrada();
		String nome = entrada.receberTexto();
		SelecaoProduto selecionador = new SelecaoProduto(produtos, nome);
		Produto produtoselecionado = selecionador.selecionar();
		
		System.out.println("Qual informa��o deseja alterar?");
		System.out.println("1 - Nome");
		System.out.println("2 - Valor");
		
		Entrada entrada2 = new Entrada();
		int operacao = entrada.receberNumeroInteiro();
		switch(operacao) {
		case 1:
			System.out.println("Informe o nome do produto");
			produtoselecionado.nome = entrada2.receberTexto();
			break;
		case 2:
			System.out.println("Informe o valor do produto");
			produtoselecionado.valor = entrada2.receberNumeroDouble();
		}
	}

}
