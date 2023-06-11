package reclamacao;

//Padrão: Decorator

public abstract class Reclamacao {
    protected String descricao;

    public String getDescricao() {
        return descricao;
    }

    public abstract String getDescricaoCompleta();
}
