package estorno;
import sistema.Pedido;

public class Estorno_ValorErrado extends OperacaoEstorno{
    private Pedido pedido;

    @Override
    public String realizarEstorno(Pedido pedido) {
        this.pedido = pedido;        
        return "Estorno por valor errado cobrado: pedido #" + pedido.getIdPedido(); // Implementação específica para estorno do comprador
    }
}