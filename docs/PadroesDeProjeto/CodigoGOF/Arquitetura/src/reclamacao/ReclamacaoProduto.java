package reclamacao;

import sistema.Pedido;

public class ReclamacaoProduto extends Reclamacao {
    private Pedido pedido;
    private TipoReclamacao tipo;

    public ReclamacaoProduto(Pedido pedido, TipoReclamacao tipo) {
        this.pedido = pedido;
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return "Reclamação do produto: " + pedido.getProduto().getNome();
    }

    @Override
    public String getDescricaoCompleta() {
        return getDescricao() + " - Tipo: " + tipo.name();
    }
    
    // Padrão utilizado: Decorator (decorador específico para reclamação de produto)
}
