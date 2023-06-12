package estorno;

import sistema.Pedido;
import sistema.Produto;

public abstract class OperacaoEstorno {
    public abstract String realizarEstorno(Pedido pedido, Produto produto);
}