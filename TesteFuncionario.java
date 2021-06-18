package br.edu.faculdadejk.aula13.polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		/*Diretor d = new Diretor();
		d.setNome("Wellington Raposo");
		d.setCpf("908.765.567-12");
		d.setSalario(1000.0);
		d.setEndereco("SHVP RUA 12 CH 45 LOTE 40", "VICNTE PIRES", "VICENTE PIRES", "72003-675");
				
		System.out.println("NOME: " + d.getNome());
		System.out.println("CPF: " + d.getCpf());
		System.out.println("SALÁRIO: " + d.getSalario());
		System.out.println(d.getEndereco());
		System.out.println(d.getBonificacao());
		System.out.println("Autenticou? " + d.autenticar(2222));*/
		
		System.out.println("=================================================================================");
		System.out.println("POLIMORFISMO");
		
		Funcionario f = new Funcionario();
		f.setSalario(100);		
		
		Diretor d = new Diretor();
		d.setSalario(1000);
		
		Gerente g = new Gerente();
		g.setSalario(200);
		
		Coordenador c = new Coordenador();
		c.setSalario(250);

		Analista a = new Analista();
		a.setSalario(120);
		
		ControleBonificacao cb = new ControleBonificacao();
		
		cb.registrar(f);
		cb.registrar(d);
		cb.registrar(g);
		cb.registrar(c);
		cb.registrar(a);
		
		System.out.println("SOMA BONIFICAÇÃO ACUMULADA: " + cb.getSomaBonificacao());
		
		
		

	}

}
