package reclamacao;

import sistema.Pedido;

public class ReclamacaoVendedor extends Reclamacao {
    private Pedido pedido;
    
    public ReclamacaoVendedor(Pedido pedido) {
        this.pedido = pedido;
    }
    
    @Override
    public String getDescricao() {
        return "Reclamação do vendedor do pedido: " + pedido.getIdPedido();
    }

    @Override
    public String getDescricaoCompleta() {
        return getDescricao();
    }
    
    // Padrão utilizado: Decorator (decorador específico para reclamação de vendedor)
}
