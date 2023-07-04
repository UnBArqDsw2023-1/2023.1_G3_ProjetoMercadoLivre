package model;

import java.util.*;

public class Comprador extends Conta {
	private int idComprador;
	private Nivel classeComprador;
	private Conta conta;
	private List<Pedido> historicoCompras;
	
	public Comprador(int idPessoa, String nome, String email, int telefone, String endereco,
			List<Pedido> historicoCompras) {
		
		super(idPessoa, nome, email, telefone, endereco);
		this.idComprador = idPessoa;
		this.classeComprador = Nivel.NIVEL_1;
		this.historicoCompras = historicoCompras;
		this.conta = new Conta(idPessoa, nome, email, telefone, endereco);
	}
	
	public Nivel getClasseComprador() {
		return classeComprador;
	}
	public void setClasseComprador(Nivel classeComprador) {
		this.classeComprador = classeComprador;
	}
	public List<Pedido> getHistoricoCompras() {
		return historicoCompras;
	}
	public void setHistoricoCompras(List<Pedido> historicoCompras) {
		this.historicoCompras = historicoCompras;
	}
	public int getIdComprador() {
		return idComprador;
	}
	public Conta getConta() {
		return conta;
	}
}
