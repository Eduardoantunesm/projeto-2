package br.edu.faculdadejk.aula13.polimorfismo;

public class Gerente extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Aqui � o Gerente");
		return this.salario + 500;
	}

}
