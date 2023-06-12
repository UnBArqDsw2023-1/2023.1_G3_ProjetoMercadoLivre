package sistema;

//Padrão: Template Method

import java.util.Date;

import compras.Comprador;
import reclamacao.Reclamacao;
import reclamacao.ReclamacaoPedidoComum;
import reclamacao.TipoReclamacao;

public class PedidoComum extends Pedido {

    public PedidoComum(int idPedido, Produto produto, int quantidade, Date data, boolean pago, Comprador comprador, int idVendedor) {
        super(idPedido, produto, quantidade, data, pago, comprador, idVendedor);
    }

    @Override
    public float calcularPreco() {
        // Implementação do cálculo de preço para um pedido comum
        return getProduto().getPreco() * getQuantidade();
    }

    @Override
    protected Reclamacao criarReclamacao(TipoReclamacao tipo) {
        // Criação da reclamação para um pedido comum
        return new ReclamacaoPedidoComum(this, tipo);
    }
}
