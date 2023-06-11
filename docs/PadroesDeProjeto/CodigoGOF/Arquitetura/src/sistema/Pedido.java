package sistema;

//Padrão: Template Method

import java.util.Date;

import compras.Comprador;
import reclamacao.Reclamacao;
import reclamacao.TipoReclamacao;

public abstract class Pedido {
    private int idPedido;
    private Produto produto;
    private int quantidade;
    private Date data;
    private boolean pago;
    private Comprador idComprador;
    private int idVendedor;
    private Reclamacao reclamacao;

    public Pedido(int idPedido, Produto produto, int quantidade, Date data, boolean pago, Comprador comprador, int idVendedor) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
        this.pago = pago;
        this.idComprador = comprador;
        this.idVendedor = idVendedor;
    }

    public void fazerReclamacao(TipoReclamacao tipo) {
        this.reclamacao = criarReclamacao(tipo);
    }

    protected abstract Reclamacao criarReclamacao(TipoReclamacao tipo);

    public int getIdPedido() {
        return idPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getData() {
        return data;
    }

    public boolean isPago() {
        return pago;
    }

    public Comprador getIdComprador() {
        return idComprador;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public Reclamacao getReclamacao() {
        return reclamacao;
    }

    // Calcula o preço total do pedido
    public float calcularPreco() {
        return produto.getPreco() * quantidade;
    }
}
