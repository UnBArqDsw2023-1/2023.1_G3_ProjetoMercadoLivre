package estorno;
import sistema.Pedido;

public class Estorno_TransacaoFraudulenta extends OperacaoEstorno{
    private Pedido pedido;

    @Override
    public String realizarEstorno(Pedido pedido) {
        this.pedido = pedido;        
        return "Estorno por transação fraudulenta: pedido #" + pedido.getIdPedido(); // Implementação específica para estorno do comprador
    }
}
