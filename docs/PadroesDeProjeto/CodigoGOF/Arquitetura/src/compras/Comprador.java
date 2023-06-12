package compras;

//Padrão: Nenhum padrão específico

import java.util.ArrayList;
import java.util.List;

import sistema.Nivel;
import sistema.Pedido;

public class Comprador {
    private int idComprador;
    private Nivel classeComprador;
    private List<Pedido> historicoCompras;

    public Comprador(int idComprador, Nivel classeComprador) {
        this.idComprador = idComprador;
        this.classeComprador = classeComprador;
        this.historicoCompras = new ArrayList<>();
    }

    public int getIdComprador() {
        return idComprador;
    }

    public Nivel getClasseComprador() {
        return classeComprador;
    }

    public List<Pedido> getHistoricoCompras() {
        return historicoCompras;
    }

    // Adiciona um pedido ao histórico de compras do comprador
    public void adicionarPedido(Pedido pedido) {
        historicoCompras.add(pedido);
    }
}
