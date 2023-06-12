package reclamacao;

import sistema.Pedido;

//Padrão: Decorator

public class ReclamacaoFrete extends Reclamacao {
    private Pedido pedido;

    public ReclamacaoFrete(Pedido pedido) {
        this.pedido = pedido;
        this.descricao = "Problema com o frete: ";
    }

    @Override
    public String getDescricaoCompleta() {
        return descricao + "Pedido #" + pedido.getIdPedido();
    }
}

