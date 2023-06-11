package estorno;

import sistema.Pedido;

public class Estorno_Vendas extends OperacaoEstorno{
    private Pedido pedido;

    @Override
    public String realizarEstorno(Pedido pedido) {
        this.pedido = pedido;        
        return "Estorno de venda: pedido #" + pedido.getIdPedido(); // Implementação específica para estorno do comprador
    }
}
