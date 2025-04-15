package loja;

import models.*;
import java.util.ArrayList;

public class Loja {
	private ArrayList<Funcionario> funcList = new ArrayList<Funcionario>();
	private ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
	private ArrayList<Fornecedor> fornecedorList = new ArrayList<Fornecedor>();

	public void empregarFunc(Funcionario func) {
		if (func == null) {
			System.out.println("Erro, Funcionário não cadastrado");
		} else {
			funcList.add(func);
		}
	}

	public void demiteFunc(Funcionario func) {
		if (func == null) {
			System.out.println("Erro, Funcionário não cadastrado");
		} else {
			funcList.removeIf(f -> f.getMatricula() == func.getMatricula());
		}
	}

	public void cadastrarCliente(Cliente cliente) {
		if (cliente == null) {
			System.out.println("Erro, Cliente não cadastrado");
		} else {
			clienteList.add(cliente);
		}
	}

	public void cadastrarFornecedor(Fornecedor forn) {
		if (forn == null) {
			System.out.println("Erro, Fornecedor não cadastrado");
		} else {
			fornecedorList.add(forn);
		}
	}

	public void listarCliente() {
		for (Cliente c : clienteList) {
			if (c != null)
				System.out.println(c);
		}
	}

	public void listarFunc() {
		for (Funcionario f : funcList) {
			if (f != null)
				System.out.println(f);
		}
	}

	public void listarForn() {
		for (Fornecedor f : fornecedorList) {
			if (f != null)
				System.out.println(f);
		}
	}

}
