package sistema;

import java.util.Date;
import devolucao.*;
import estorno.*;

public class main {
    public static void main(String[] args) {
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

        // Criação de pedidos
        Pedido pedido1 = new Pedido(1, produto1, 2, new Date(), 1, 1);
        Pedido pedido2 = new Pedido(2, produto2, 1, new Date(), 2, 2);

        // Adicionando os pedidos ao histórico de compras dos compradores
        comprador1.adicionarPedido(pedido1);
        comprador2.adicionarPedido(pedido2);

        
        Devolucao_OutrosProblemas devolucaoOutrosProblemas = new Devolucao_OutrosProblemas();
        String resultadoDevolucao = devolucaoOutrosProblemas.realizarDevolucao(pedido1);
        System.out.println(resultadoDevolucao);
        

        Estorno_TransacaoFraudulenta estorno_TransacaoFraudulenta = new Estorno_TransacaoFraudulenta();
        String resultadoEstorno = estorno_TransacaoFraudulenta.realizarEstorno(pedido2);
        System.out.println(resultadoEstorno);
    }
}
