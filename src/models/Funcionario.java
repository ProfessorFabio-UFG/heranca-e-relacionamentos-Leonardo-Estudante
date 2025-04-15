package models;

public class Funcionario extends PessoaFisica{
	private int matricula;
	private double salario;
	private String cargo;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil,int matricula, double salario, String cargo) {
		super(nome, endereco, telefone, cpf, sexo, estadoCivil);
		this.matricula = matricula;
		this.salario = salario;
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + super.getNome()
			+ ", endereco=" + super.getEndereco()
			+ ", telefone=" + super.getTelefone()
			+ ", cpf=" + super.getCpf()
			+ ", sexo=" + super.getSexo()
			+ ", estadoCivil=" + super.getEstadoCivil()
			+ ", matricula=" + matricula
			+ ", salario=" + salario
			+ ", cargo=" + cargo + "]";
	}

	
	
}
