package model;

public class Conta {
	private int idPessoa;
	private int telefone;
	private String endereco;
	private String email;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta(int idPessoa, String nome, String email, int telefone, String endereco) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
