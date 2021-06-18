package br.edu.faculdadejk.aula13.polimorfismo;

public class Diretor extends Funcionario {
	
	private int senha = 2222;

	public double getBonificacao(){
		System.out.println("Aqui é o Diretor");
		return this.salario + 1000;
	}
	
	public boolean autenticar(int senha){
		
		if(this.senha == senha){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
