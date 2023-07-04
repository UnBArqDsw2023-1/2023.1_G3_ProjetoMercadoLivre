package model;

import java.util.List;

public class Vendedor extends Conta {
	
	private int idVendedor;
	private Reputacao reputacaoVendedor;
	private List<Produto> listaProdutos;
	private Conta conta;
	
	public Vendedor(int idPessoa, String nome, String email, int telefone, String endereco,
			List<Produto> listaProdutos) {
		
		super(idPessoa, nome, email, telefone, endereco);
		this.idVendedor = idPessoa;
		this.reputacaoVendedor = Reputacao.PRATA;
		this.listaProdutos = listaProdutos;
		this.conta = new Conta(idPessoa, nome, email, telefone, endereco);
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public Reputacao getReputacaoVendedor() {
		return reputacaoVendedor;
	}
	public void setReputacaoVendedor(Reputacao reputacaoVendedor) {
		this.reputacaoVendedor = reputacaoVendedor;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public Vendedor(int idPessoa, String nome, String email, int telefone, String endereco) {
		super(idPessoa, nome,email, telefone, endereco);
	}
	String devolver(Produto produto, Status status )
	{
		String ret = "";	
		ret += "Produto "+produto.getNome()+" vai ser devolvido!\n";
		ret += "Estado: "+status+ "\n";
		return ret;
	}
	String estornar(Produto produto, Status status )
	{
		String ret = "";
		ret += "Produto "+produto.getNome()+" vai ser estornado!\n";
		ret += "Estado: "+status+ "\n";
		return ret;
	}
	public Conta getConta() {
		return conta;
	}
}
