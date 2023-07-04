package controller;

import model.*;

public class ControllerDados {
	
	public Comprador CriarContaComprador(Conta conta) {
		return new Comprador(conta.getIdPessoa(),conta.getNome(),conta.getEmail(),conta.getTelefone(),conta.getEndereco(),null);
	}
	public Vendedor CriarContaVendedor(Conta conta) {
		return new Vendedor(conta.getIdPessoa(),conta.getNome(),conta.getEmail(),conta.getTelefone(),conta.getEndereco(),null);
	}
}
