package sistema;

import java.util.Date;

import compras.Comprador;
import reclamacao.Reclamacao;
import reclamacao.ReclamacaoFrete;
import reclamacao.ReclamacaoProduto;
import reclamacao.ReclamacaoVendedor;

public class TestesUnitarios {
    public static void main(String[] args) {
        testarPedido();
        testarPedidoAdapter();
        testarDecoradoresReclamacao();
    }

    private static void testarPedido() {
        System.out.println("Testando Pedido...");

        Comprador comprador = new Comprador(1, Nivel.ALTO);
        Produto produto = new Produto(1, "Produto A", 50.0f);

        Pedido pedido = new PedidoComum(1, produto, 2, new Date(), true, comprador, 1);

        System.out.println("ID do Pedido: " + pedido.getIdPedido());
        System.out.println("Produto: " + pedido.getProduto().getNome());
        System.out.println("Quantidade: " + pedido.getQuantidade());
        System.out.println("Data: " + pedido.getData());
        System.out.println("Pago: " + pedido.isPago());
        System.out.println("Preço Total: " + pedido.calcularPreco());

        System.out.println("Teste concluído.");
        System.out.println("-------------------------------------");
    }

    private static void testarPedidoAdapter() {
        System.out.println("Testando PedidoAdapter...");

        Comprador comprador = new Comprador(1, Nivel.ALTO);
        Produto produto = new Produto(1, "Produto A", 50.0f);

        Pedido pedido = new PedidoComum(1, produto, 2, new Date(), true, comprador, 1);

        PedidoAdapter pedidoAdapter = new PedidoAdapter(pedido);

        System.out.println("ID do Pedido: " + pedidoAdapter.getIdPedido());
        System.out.println("Descrição do Pedido: " + pedidoAdapter.getDescricaoReclamacao());
        System.out.println("Preço Total: " + pedidoAdapter.calcularPreco());

        System.out.println("Teste concluído.");
        System.out.println("-------------------------------------");
    }

    private static void testarDecoradoresReclamacao() {
        System.out.println("Testando Decoradores de Reclamação...");

        Comprador comprador = new Comprador(1, Nivel.ALTO);
        Produto produto = new Produto(1, "Produto A", 50.0f);

        Pedido pedido = new PedidoComum(1, produto, 2, new Date(), true, comprador, 1);

        Reclamacao reclamacaoProduto = new ReclamacaoProduto(pedido, null);
        Reclamacao reclamacaoVendedor = new ReclamacaoVendedor(pedido);
        Reclamacao reclamacaoFrete = new ReclamacaoFrete(pedido);

        System.out.println("Descrição do Vendedor: " + reclamacaoVendedor.getDescricaoCompleta());
        System.out.println("Descrição do Frete: " + reclamacaoFrete.getDescricaoCompleta());

        System.out.println("Teste concluído.");
        System.out.println("-------------------------------------");
    }
}
