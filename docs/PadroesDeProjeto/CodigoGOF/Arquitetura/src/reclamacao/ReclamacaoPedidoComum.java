package reclamacao;

import sistema.Pedido;

//Padrão: Decorator

public class ReclamacaoPedidoComum extends Reclamacao {
    private Pedido pedido;
    private TipoReclamacao tipo;

    public ReclamacaoPedidoComum(Pedido pedido, TipoReclamacao tipo) {
        this.pedido = pedido;
        this.tipo = tipo;
        this.descricao = "Problema com o pedido: ";
    }

    @Override
    public String getDescricaoCompleta() {
        return descricao + "Pedido #" + pedido.getIdPedido() + ", Tipo: " + tipo;
    }
}
