package view;

import model.*;

public class VerPerfil {

	public void verPerfilVendedor (Vendedor vendedor) {
		
		Conta pessoa = vendedor.getConta();
		int quantidade = vendedor.getListaProdutos() != null ? vendedor.getListaProdutos().size() : 0;
		
		System.out.println("---------------------------------------\n");
		System.out.println("DADOS DO VENDEDOR \n");
		System.out.println("ID : "+pessoa.getIdPessoa());
		System.out.println("Nome : "+pessoa.getNome());
		System.out.println("Email : "+pessoa.getEmail());
		System.out.println("Telefone : "+pessoa.getTelefone());
		System.out.println("Endereço : "+pessoa.getEndereco());
		System.out.println("Nível de comprador  : "+vendedor.getReputacaoVendedor());
		System.out.println("Quantidade de produtos  : "+quantidade);
		System.out.println("---------------------------------------\n");
	
	}
	public void verPerfilComprador (Comprador comprador) {
		
		Conta pessoa = comprador.getConta();
		
		System.out.println("---------------------------------------\n");
		System.out.println("DADOS DO COMPRADOR \n");
		System.out.println("ID : "+pessoa.getIdPessoa());
		System.out.println("Nome : "+pessoa.getNome());
		System.out.println("Email : "+pessoa.getEmail());
		System.out.println("Telefone : "+pessoa.getTelefone());
		System.out.println("Endereço : "+pessoa.getEndereco());
		System.out.println("Nível de comprador  : "+comprador.getClasseComprador());
		System.out.println("---------------------------------------\n");
	
	}
}
