package estorno;

import sistema.Pedido;
import sistema.Produto;

public class Estorno_ValorErrado extends OperacaoEstorno{
	private Pedido pedido;
	private Produto produto;

    @Override
    public String realizarEstorno(Pedido pedido, Produto produto) {
        this.pedido = pedido;
        this.produto = produto;
        return "##Estorno por Valor Errado##\n" + "Pedido Número: " + pedido.getIdPedido() + "\n" +
        "Nome do Produto: " + produto.getNome() + "\n" + 
		"Quantidade: " + pedido.getQuantidade() + "\n" + "Valor estornado: " + produto.getPreco()*pedido.getQuantidade() + "\n"; // Implementação específica para estorno do comprador
    }
}
