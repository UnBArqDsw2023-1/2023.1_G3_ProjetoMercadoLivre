package controller;

import model.Conta;

public class ControllerDados {
	private Conta conta;
	
	public ControllerDados(Conta conta) {
		this.conta = conta;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void index() {
		Conta pessoa = this.getConta();
		System.out.println("---------------------------------------\n");
		System.out.println("Dados da conta: \n");
		System.out.println("ID : "+pessoa.getIdPessoa());
		System.out.println("Nome : "+pessoa.getNome());
		System.out.println("Email : "+pessoa.getEmail());
		System.out.println("Telefone : "+pessoa.getTelefone());
		System.out.println("Endereço : "+pessoa.getEndereco());
		System.out.println("---------------------------------------\n");
	}
	
}
