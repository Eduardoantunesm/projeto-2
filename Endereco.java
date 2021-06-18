package br.edu.faculdadejk.aula13.polimorfismo;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	
	public void setEndereco(String rua, String bairro, String cidade, String cep){
		this.rua    = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep    = cep;
	}
	
	public String getEndereco(){
		return "RUA: " + this.rua + "\nBAIRRO: " + this.bairro + "\nCIDADE: " + this.cidade + "\nCEP: " + this.cep;
	}

}
