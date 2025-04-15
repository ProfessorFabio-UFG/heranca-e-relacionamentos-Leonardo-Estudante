package main;

import loja.Loja;
import models.Cliente;
import models.Fornecedor;
import models.Funcionario;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("Léo", "Rua 3", "629831823", "412032312", 'H', 1, 123.45, "Estudar", "Estagiário");
		
		Funcionario func = new Funcionario("Carlos", "Rua 1", "1231321", "4123121", 'F', 1, 20, 1200, "Estoquista");

		Fornecedor forn = new Fornecedor("Roger", "Rua 10", "12342321", "5433121", "Razão social", "Queijo");

		Loja loja = new Loja();
		
		
		loja.cadastrarCliente(c);
		loja.listarCliente();

		loja.empregarFunc(func);
		loja.demiteFunc(func);
		loja.listarFunc();

		loja.cadastrarFornecedor(forn);
		loja.listarForn();

	}

}
