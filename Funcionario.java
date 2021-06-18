package br.edu.faculdadejk.aula13.polimorfismo;

public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	private Endereco endereco;
	
	public Funcionario(){
		System.out.println("Aqui é o Funcionário");
		endereco = new Endereco();
	}
	
	public double getBonificacao(){
		return salario * 0.05;
	}
	
	public String getEndereco() {
		return this.endereco.getEndereco();
	}
	
	public void setEndereco(String rua, String bairro, String cidade, String cep) {
		this.endereco.setEndereco(rua, bairro, cidade, cep);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
