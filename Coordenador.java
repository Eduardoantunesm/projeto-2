package br.edu.faculdadejk.aula13.polimorfismo;

public class Coordenador extends Funcionario {

	public double getBonificacao(){
		System.out.println("Aqui é o Coordenador");
		return this.salario + 300;
	}
}
