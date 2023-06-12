package sistema;

import java.util.Date;


import devolucao.TipoDevolucao;
import estorno.TipoEstorno;

public class Pedido {
    private int idPedido;
    private Produto produto;
    private int quantidade;
    private Date data;
    //private float preco;
    private boolean pago = true; // inicializado como true
    private int idComprador;
    private int idVendedor;
    private TipoDevolucao tipoDevolucao;
    private TipoEstorno tipoEstorno;


    public Pedido(int idPedido, Produto produto, int quantidade, Date data, int idComprador, int idVendedor) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
        this.idComprador = idComprador;
        this.idVendedor = idVendedor;
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

//    public float getPreco() {
//        return preco;
//    }

//    public void setPreco(float preco) {
//        this.preco = preco;
//    }

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

    public TipoDevolucao getTipoDevolucao() {
        return tipoDevolucao;
    }

    public TipoEstorno getTipoEstorno() {
        return tipoEstorno;
    }

}
