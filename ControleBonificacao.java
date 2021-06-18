package br.edu.faculdadejk.aula13.polimorfismo;

public class ControleBonificacao {
	
	private double somaBonificacao;

	public void registrar(Funcionario f){
		double bonificacao = f.getBonificacao();
		somaBonificacao = somaBonificacao + bonificacao;
	}
	
	public double getSomaBonificacao() {
		return somaBonificacao;
	}

}
