package model;

import java.util.*;

public class Pedido {
	private int idPedido;
	private Produto produto;
	private int quantidade;
	private Date data;
	private boolean pago;
	private int idComprador;
	private int idVendedor;
	
	public Pedido(int idPedido, Produto produto, int quantidade, Date data, int idComprador, int idVendedor) {
		super();
		this.idPedido = idPedido;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
		this.idComprador = idComprador;
		this.idVendedor = idVendedor;
		this.pago = true;
	}
	
	@SuppressWarnings("null")
	String fazerReclamacao(TipoReclamacao tipo) {
		HashMap< TipoReclamacao, String> hashMap = null;
		String ret = "";
		
		hashMap.put(TipoReclamacao.DANIFICADO,"Produto danificado!");
		hashMap.put(TipoReclamacao.NUNCA_RECEBIDO,"Produto não recebido");
		hashMap.put(TipoReclamacao.NAO_DESCRITO,"Produto não é como descrito");
		hashMap.put(TipoReclamacao.OUTROS,"Outros problemas com o pedido");
		
		ret += "Reclamação do produto "+this.getProduto().getNome() + "\n";
		ret += "Motivo: "+hashMap.get(tipo) + "\n";
		return ret;
	}
	
	@SuppressWarnings("null")
	String pedidoDevolucao(TipoDevolucao tipo) {
		String ret = "";
		HashMap< TipoDevolucao, String> hashMap = null;
		
		hashMap.put(TipoDevolucao.ITEM_INCORRETO,"Item incorreto enviado.");
		hashMap.put(TipoDevolucao.PRODUTO_DEFEITUOSO,"Produto defeituoso.");
		hashMap.put(TipoDevolucao.OUTROS,"Outros problemas com o produto.");
		
		ret += "Devolução do produto "+this.getProduto().getNome()+"\n";
		ret += "Motivo: "+hashMap.get(tipo)+"\n";
		return ret;
	}
	
	@SuppressWarnings("null")
	String pedidoEstorno(TipoEstorno tipo) {
		HashMap< TipoEstorno, String> hashMap = null;
		String ret = "";
		
		hashMap.put(TipoEstorno.ESTORNO_VENDA,"Estorno de venda.");
		hashMap.put(TipoEstorno.FRAUDULENTA,"Transação fraudulenta.");
		hashMap.put(TipoEstorno.VALOR_ERRADO,"Valor errado cobrado.");
		hashMap.put(TipoEstorno.NAO_AUTO,"Transação não autorizada.");
		
		ret += "Estorno do produto "+this.getProduto().getNome()+"\n";
		ret += "Motivo: "+hashMap.get(tipo)+"\n";
		return ret;
	}
	
	float calculaPreco() {
		return  this.getProduto().getPreco();
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public int getIdComprador() {
		return idComprador;
	}
	public void setIdComprador(int idComprador) {
		this.idComprador = idComprador;
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	
}
