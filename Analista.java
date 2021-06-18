package br.edu.faculdadejk.aula13.polimorfismo;

public class Analista extends Funcionario {

	public double getBonificacao(){
		System.out.println("Aqui é o Analista");
		return this.salario + 150;
	}
}
