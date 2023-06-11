package estorno;

import sistema.Pedido;

public class Estorno_TransacaoNaoAutorizada extends OperacaoEstorno{
    private Pedido pedido;

    @Override
    public String realizarEstorno(Pedido pedido) {
        this.pedido = pedido;        
        return "Estorno por transação não autorizada: pedido #" + pedido.getIdPedido(); // Implementação específica para estorno do comprador
    }
}
