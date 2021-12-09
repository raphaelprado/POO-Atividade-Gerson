package com.wb.negocio;

import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class ListarClientesAmbosGeneros extends Listagem {
	private List<Cliente> clientes;

	public ListarClientesAmbosGeneros(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("======================================");
		System.out.println("LISTA DE CLIENTES DO G�NERO MASCULINO:");
		for (Cliente cliente : clientes) {
			if (cliente.genero == "Masculino") {
				System.out.println("--------------------------------------");
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println("G�nero: " + cliente.genero);
				System.out.println("CPF: " + cliente.getCpf().getValor());
				System.out.println("RG: " + cliente.getRgs().getValor());
				for(Telefone telefone: cliente.getTelefones()) {
					System.out.println("Telefone: ("+ telefone.getDdd()+") "+telefone.getNumero());
				}
			}
		}
		System.out.println("======================================");
		System.out.println("LISTA DE CLIENTES DO G�NERO FEMININO:");
		for (Cliente cliente : clientes) {
			if (cliente.genero == "Feminino") {
				System.out.println("--------------------------------------");
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println("G�nero: " + cliente.genero);
				System.out.println("CPF: " + cliente.getCpf().getValor());
				System.out.println("RG: " + cliente.getRgs().getValor());
				for(Telefone telefone: cliente.getTelefones()) {
					System.out.println("Telefone: ("+ telefone.getDdd()+") "+telefone.getNumero());
				}
			}
		}
		System.out.println("======================================");
	}
}
