package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;
import com.wb.negocio.Cadastro;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.CadastroServico;
import com.wb.negocio.Edicao;
import com.wb.negocio.EditarCliente;
import com.wb.negocio.EditarProduto;
import com.wb.negocio.EditarServico;
import com.wb.negocio.Listagem;
import com.wb.negocio.ListarClientesAmbosGeneros;
import com.wb.negocio.ListarClientesFemininos;
import com.wb.negocio.ListarClientesMasculinos;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.ListarTodosServicos;


public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao sistema de cadastro do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Produto");
			System.out.println("3 - Cadastrar Serviço");
			System.out.println("4 - Listar todos os Clientes");
			System.out.println("5 - Listar Clientes Masculinos");
			System.out.println("6 - Listar Clientes Femininos");
			System.out.println("7 - Listar Clientes Ambos os Gêneros");
			System.out.println("8 - Listar todos os Produtos");
			System.out.println("9 - Listar todos os Serviços");
			System.out.println("10 - Editar Cliente");
			System.out.println("11 - Editar Produto");
			System.out.println("12 - Editar Serviço");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			

				switch (operacao) {
				case 0:
					execucao = false;
					System.out.println("Até mais!");
					break;
				case 1:
					Cadastro cadastro = new CadastroCliente(empresa.getClientes());
					cadastro.cadastrar();
					break;
				case 2:
					cadastro = new CadastroProduto(empresa.getProdutos());
					cadastro.cadastrar();
					break;
				case 3:
					cadastro = new CadastroServico(empresa.getServicos());
					cadastro.cadastrar();
					break;	
				case 4:
					Listagem listagem = new ListarTodosClientes(empresa.getClientes());
					listagem.listar();
					break;
				case 5:
					listagem = new ListarClientesMasculinos(empresa.getClientes());
					listagem.listar();
					break;
				case 6:
					listagem = new ListarClientesFemininos(empresa.getClientes());
					listagem.listar();
					break;
				case 7:
					listagem = new ListarClientesAmbosGeneros(empresa.getClientes());
					listagem.listar();
					break;
				case 8:
				    listagem = new ListarTodosProdutos(empresa.getProdutos());
					listagem.listar();
					break;
				case 9:
					listagem = new ListarTodosServicos(empresa.getServicos());
					listagem.listar();
					break;
				case 10:
					Edicao editar = new EditarCliente(empresa.getClientes());
					editar.editar();
					break;
				case 11:
					editar = new EditarProduto(empresa.getProdutos());
					editar.editar();
					break;
				case 12:
					editar = new EditarServico(empresa.getServicos());
					editar.editar();
					break;
				default:
					System.out.println("Operação não entendida");
				}
			}
		}
	}