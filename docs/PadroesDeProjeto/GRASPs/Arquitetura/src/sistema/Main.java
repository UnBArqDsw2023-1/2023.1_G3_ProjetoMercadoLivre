package sistema;

import java.util.Date;
import devolucao.*;
import estorno.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Criação de compradores
        Comprador comprador1 = new Comprador(1, Nivel.NIVEL1);
        Comprador comprador2 = new Comprador(2, Nivel.NIVEL2);
        Comprador comprador3 = new Comprador(3, Nivel.NIVEL3);
        Comprador comprador4 = new Comprador(4, Nivel.NIVEL4);
        Comprador comprador5 = new Comprador(5, Nivel.NIVEL5);
        Comprador comprador6 = new Comprador(6, Nivel.NIVEL6);

        // Criação de produtos
        Produto produto1 = new Produto(1, "Produto A", 50.0f);
        Produto produto2 = new Produto(2, "Produto B", 100.0f);
        Produto produto3 = new Produto(3, "Produto C", 150.0f);
        Produto produto4 = new Produto(4, "Produto D", 200.0f);
        Produto produto5 = new Produto(5, "Produto E", 2500.0f);
        Produto produto6 = new Produto(6, "Produto F", 10000.0f);

        // Criação de pedidos
        Pedido pedido1 = new Pedido(1, produto1, 2, new Date(), 1, 1);
        Pedido pedido2 = new Pedido(2, produto2, 10, new Date(), 2, 2);
        Pedido pedido3 = new Pedido(3, produto3, 15, new Date(), 3, 1);
        Pedido pedido4 = new Pedido(4, produto4, 1, new Date(), 4, 1);
        Pedido pedido5 = new Pedido(5, produto5, 2, new Date(), 5, 2);
        Pedido pedido6 = new Pedido(6, produto6, 10, new Date(), 6, 1);
        Pedido pedido7 = new Pedido(7, produto6, 12, new Date(), 3, 2);
        
        // Adicionando os pedidos ao histórico de compras dos compradores
        comprador1.adicionarPedido(pedido1);
        comprador2.adicionarPedido(pedido2);
        comprador3.adicionarPedido(pedido3);
        comprador4.adicionarPedido(pedido4);
        comprador5.adicionarPedido(pedido5);
        comprador6.adicionarPedido(pedido6);
        comprador6.adicionarPedido(pedido7);


        
        Devolucao_ItemIncorreto devolucaoItemIncorreto = new Devolucao_ItemIncorreto();
        String resultadoDevolucao1 = devolucaoItemIncorreto.realizarDevolucao(pedido1);
        System.out.println(resultadoDevolucao1);
        
        Devolucao_OutrosProblemas devolucaoOutrosProblemas = new Devolucao_OutrosProblemas();
        String resultadoDevolucao2 = devolucaoOutrosProblemas.realizarDevolucao(pedido2);
        System.out.println(resultadoDevolucao2);
        
        Devolucao_ProdutoDefeituoso devolucaoProdutoDefeituoso = new Devolucao_ProdutoDefeituoso();
        String resultadoDevolucao3 = devolucaoProdutoDefeituoso.realizarDevolucao(pedido3);
        System.out.println(resultadoDevolucao3);

        Estorno_TransacaoFraudulenta estorno_TransacaoFraudulenta = new Estorno_TransacaoFraudulenta();
        String resultadoEstorno1 = estorno_TransacaoFraudulenta.realizarEstorno(pedido4, produto4);
        System.out.println(resultadoEstorno1);

        Estorno_TransacaoNaoAutorizada estorno_TransacaoNaoAutorizada = new Estorno_TransacaoNaoAutorizada();
        String resultadoEstorno2 = estorno_TransacaoNaoAutorizada.realizarEstorno(pedido5, produto5);
        System.out.println(resultadoEstorno2);
        
        Estorno_ValorErrado estorno_ValorErrado = new Estorno_ValorErrado();
        String resultadoEstorno3 = estorno_ValorErrado.realizarEstorno(pedido6, produto6);
        System.out.println(resultadoEstorno3);
        
        Estorno_Vendas estorno_Vendas = new Estorno_Vendas();
        String resultadoEstorno4 = estorno_Vendas.realizarEstorno(pedido7, produto6);
        System.out.println(resultadoEstorno4);
        
	}

}
