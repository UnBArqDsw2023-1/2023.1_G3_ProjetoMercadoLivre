package estorno;

import sistema.Pedido;

public abstract class OperacaoEstorno {
    public abstract String realizarEstorno(Pedido pedido);
}
