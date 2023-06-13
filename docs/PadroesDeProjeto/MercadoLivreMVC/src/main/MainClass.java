package main;

import view.*;

public class MainClass {

	public static void main(String[] args) {
		
		int idPessoa = 1;
		String nome = "Nvula Luvumbu";
		String email = "email@dominio.com";
		int telefone = 999999999;
		String endereco = "64009-200 Rua Crisipo Aguiar";
		
		Perfil perfil = new Perfil(idPessoa,nome,email,telefone,endereco);
		perfil.verPerfil();
	}

}
