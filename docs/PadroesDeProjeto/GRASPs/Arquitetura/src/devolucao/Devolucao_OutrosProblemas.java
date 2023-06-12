package devolucao;

import sistema.Pedido;

public class Devolucao_OutrosProblemas extends OperacaoDevolucao{
    private Pedido pedido;

    @Override
    public String realizarDevolucao(Pedido pedido) {
        this.pedido = pedido;        
        return "##Devolução por outros problemas##\n" + "Pedido Número: " + pedido.getIdPedido() + "\n" +
		"Quantidade: " + pedido.getQuantidade() + "\n"; // Implementação específica para estorno do comprador
    }
}
