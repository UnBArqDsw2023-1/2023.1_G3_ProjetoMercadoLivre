package sistema;
//(Padrões: Decorator, Adapter)

import java.util.Date;

import compras.Comprador;
import reclamacao.Reclamacao;
import reclamacao.TipoReclamacao;

public class Main {
    public static void main(String[] args) {
        // Criação de compradores
        Comprador comprador1 = new Comprador(1, Nivel.ALTO);
        Comprador comprador2 = new Comprador(2, Nivel.BAIXO);

        // Criação de produtos
        Produto produto1 = new Produto(1, "Produto A", 50.0f);
        Produto produto2 = new Produto(2, "Produto B", 100.0f);

        // Criação de pedidos
        Pedido pedido1 = new PedidoComum(1, produto1, 2, new Date(), true, comprador1, 1);
        Pedido pedido2 = new PedidoComum(2, produto2, 1, new Date(), true, comprador2, 2);

        // Adicionando os pedidos ao histórico de compras dos compradores
        comprador1.adicionarPedido(pedido1);
        comprador2.adicionarPedido(pedido2);

        // Fazendo reclamação no primeiro pedido
        pedido1.fazerReclamacao(TipoReclamacao.PRODUTO_NAO_DESCRITO);

        // Acessando a descrição da reclamação do primeiro pedido
        Reclamacao reclamacaoPedido1 = pedido1.getReclamacao();
        if (reclamacaoPedido1 != null) {
            System.out.println(reclamacaoPedido1.getDescricao());
        }

        // Adaptando o pedido para outro formato
        PedidoAdapter pedidoAdapter = new PedidoAdapter(pedido1);
        System.out.println("Pedido adaptado: " + pedidoAdapter.getIdPedido());
    }
}
