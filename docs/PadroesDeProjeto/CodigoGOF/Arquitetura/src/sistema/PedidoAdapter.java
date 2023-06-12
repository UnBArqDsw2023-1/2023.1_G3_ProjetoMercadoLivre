package sistema;

import reclamacao.Reclamacao;

//Padrão: Adapter

public class PedidoAdapter {
    private Pedido pedido;

    public PedidoAdapter(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getIdPedido() {
        return pedido.getIdPedido();
    }

    public Produto getProduto() {
        return pedido.getProduto();
    }

    public int getQuantidade() {
        return pedido.getQuantidade();
    }

    public float calcularPreco() {
        return pedido.calcularPreco();
    }

    public String getDescricaoReclamacao() {
        Reclamacao reclamacao = pedido.getReclamacao();
        if (reclamacao != null) {
            return reclamacao.getDescricaoCompleta();
        } else {
            return "Nenhuma reclamação registrada para este pedido.";
        }
    }
}
