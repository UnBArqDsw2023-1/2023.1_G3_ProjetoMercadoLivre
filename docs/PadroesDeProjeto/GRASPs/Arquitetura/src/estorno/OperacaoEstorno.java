package estorno;

import sistema.Pedido;

// Padrão de projeto: Polimorfismo 

public abstract class OperacaoEstorno {
    public abstract String realizarEstorno(Pedido pedido);
}
