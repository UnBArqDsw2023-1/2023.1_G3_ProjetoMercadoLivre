package sistema;

import java.util.List;


public class Comprador{
    private int idComprador;
    private Nivel classeComprador;
    private List<Pedido> historicoCompras;

    public Comprador(int idComprador, Nivel classeComprador) {
        this.idComprador = idComprador;
        this.classeComprador = classeComprador;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public Nivel getClasseComprador() {
        return classeComprador;
    }

    public void setClasseComprador(Nivel classeComprador) {
        this.classeComprador = classeComprador;
    }

    public List<Pedido> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Pedido> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    public void devolverProduto(Pedido pedido) {
        // Lógica para devolver o produto
    }

    public void adicionarPedido(Pedido pedido) {
        historicoCompras.add(pedido);
    }
}

