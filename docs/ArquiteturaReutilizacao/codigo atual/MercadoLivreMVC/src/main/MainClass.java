package main;

import view.*;
import controller.*;
import model.*;

public class MainClass {

	public static void main(String[] args) {
		
		ControllerDados controllerDados = new ControllerDados();
		
		int id = 1;
		String nome = "Nvula Luvumbu";
		String email = "nvula@dominio.com";
		int telefone = 996521120;
		String endereco = "64009-200 Rua Crisipo Aguiar";
		
		Comprador perfilComprador = controllerDados.CriarContaComprador(new Conta(id,nome,email,telefone,endereco));
	
		++id;
		nome = "Kiluwanji Nkusi";
		email = "nkusi@dominio.com";
		telefone = 996524109;
		endereco = "64009-200 Rua Crisipo Aguiar";
		
		Vendedor perfilVendedor= controllerDados.CriarContaVendedor(new Conta(id,nome,email,telefone,endereco));
		
		VerPerfil verPerfil = new VerPerfil();
		
		verPerfil.verPerfilComprador(perfilComprador);
		verPerfil.verPerfilVendedor(perfilVendedor);
	}

}
