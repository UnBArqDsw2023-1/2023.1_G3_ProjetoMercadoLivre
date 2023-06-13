package model;

import recursos.*;

public class Vendedor extends Conta {
	public Vendedor(int idPessoa, String nome, String email, int telefone, String endereco) {
		super(idPessoa, nome,email, telefone, endereco);
	}
	void devolverProduto(Produto produto ) {
		System.out.println("Produto "+produto.getIdProduto()+" devolvido!");
	}
}
