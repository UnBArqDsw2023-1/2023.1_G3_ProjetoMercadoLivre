package view;

import controller.*;
import model.Conta;

public class Perfil extends ControllerDados{

	public Perfil(int idPessoa, String nome, String email, int telefone,String endereco) {
		super(new Conta(idPessoa,nome,email,telefone,endereco));
		// TODO Auto-generated constructor stub
	}
	public void verPerfil() {
		this.index();
	}
}
