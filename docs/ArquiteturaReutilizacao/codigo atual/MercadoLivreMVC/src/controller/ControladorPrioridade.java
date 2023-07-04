package controller;

import model.Nivel;
import model.Reputacao;
import model.Status;

public class ControladorPrioridade {
	public Nivel classeComprador;
	public Reputacao  reputacaoDeVendedor;
	public Status status;
	
	public ControladorPrioridade(Nivel classeComprador, Reputacao reputacaoDeVendedor, Status status) {
		super();
		this.classeComprador = classeComprador;
		this.reputacaoDeVendedor = reputacaoDeVendedor;
		this.status = status;
	}



	public Nivel getClasseComprador() {
		return classeComprador;
	}



	public void setClasseComprador(Nivel classeComprador) {
		this.classeComprador = classeComprador;
	}



	public Reputacao getReputacaoDeVendedor() {
		return reputacaoDeVendedor;
	}



	public void setReputacaoDeVendedor(Reputacao reputacaoDeVendedor) {
		this.reputacaoDeVendedor = reputacaoDeVendedor;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public boolean conversar(String emailVended, String emailComp) {
		return true;
	}
}
