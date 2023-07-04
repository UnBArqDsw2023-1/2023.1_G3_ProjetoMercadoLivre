package view;

import model.Conta;

public class Perfil {
	
	private Conta conta;
	
	public Perfil(int idPessoa, String nome, String email, int telefone, String endereco) {
		this.conta = new Conta(idPessoa, nome, email, telefone, endereco);
		// TODO Auto-generated constructor stub
	}
	public void verPerfil() {
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
	public Conta getConta() {
		return conta;
	}
}
