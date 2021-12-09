package com.wb.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class CadastroCliente extends Cadastro {
	private List<Cliente> clientes;
	private Entrada entrada;

	public CadastroCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	private boolean cadastraNumero = true;
	

	@Override
	public void cadastrar() {
		System.out.println("==================================================================");
		System.out.println("CADASTRO DE CLIENTE\n");
		System.out.println("Informe o nome do cliente:");
		String nome = entrada.receberTexto();  //NOME
		System.out.println("Informe o nome social do cliente:");
		String nomeSocial = entrada.receberTexto();  //NOME SOCIAL
		System.out.println("Informe o g�nero:");
		System.out.println("1 - Masculino");
		System.out.println("2 - Feminino");
		String gen = entrada.receberTexto(); //G�NERO
		String genero = null;
		if (gen.equals("1")) {
			genero = "Masculino";
		} else {
			genero = "Feminino";
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("DOCUMENTOS\n");
		System.out.println("Informe o n�mero do cpf:");
		String valor = entrada.receberTexto();  //VALOR CPF
		System.out.println("Informe a data de emiss�o do cpf, no padr�o dd/mm/yyyy:");
		String data = entrada.receberTexto();  //DATA DE EMISSÃO CPF
		System.out.println("Informe o n�mero do rg:");
		String valorrg = entrada.receberTexto(); //VALOR RG
		System.out.println("Informe a data de emiss�o do rg, no padr�o dd/mm/yyyy:");
		String datarg = entrada.receberTexto(); //DATA DE EMISS�O RG
		System.out.println("------------------------------------------------------------------");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		CPF cpf = new CPF(dataEmissao, valor);
		LocalDate dataEmissaorg = LocalDate.parse(datarg, formato);
		RG rg = new RG(dataEmissaorg, valorrg);
		Cliente cliente = new Cliente(nome, nomeSocial, genero, cpf, rg);
		this.clientes.add(cliente);
		
		System.out.println("TELEFONE\n");
		while (cadastraNumero) {
			System.out.println("Informe o n�mero do DDD:");
			String ddd = entrada.receberTexto();  //DDD
			System.out.println("Informe o n�mero do telefone:");
			String numero = entrada.receberTexto(); //N�MERO
			Telefone telefone = new Telefone(ddd, numero);
			cliente.getTelefones().add(telefone);
			System.out.println("Deseja cadastrar outro n�mero?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			String outroNumero = entrada.receberTexto();
			if(outroNumero.equals("1")) {
				cadastraNumero = true;
			} else {
				cadastraNumero = false;
			}
		}
		System.out.println("======================================");
	}
}