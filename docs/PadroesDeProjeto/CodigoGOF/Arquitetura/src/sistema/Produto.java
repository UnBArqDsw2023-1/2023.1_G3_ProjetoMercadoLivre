package sistema;

//Padrão: Nenhum padrão específico

public class Produto {
    private int idProduto;
    private String nome;
    private float preco;

    public Produto(int idProduto, String nome, float preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }
}
