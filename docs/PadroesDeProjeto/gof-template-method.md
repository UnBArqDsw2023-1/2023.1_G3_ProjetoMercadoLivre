# GoF: Template Method

## 1. Introdução

<p align="justify">
    O padrão Template Method, definido pelo GoF (Gang of Four), é um padrão comportamental que permite definir o esqueleto de um algoritmo em uma classe base, enquanto alguns passos do algoritmo podem ser implementados por subclasses. Isso permite que as subclasses redefinam certos passos sem alterar a estrutura do algoritmo. O Template Method é útil quando se deseja definir um comportamento comum para várias classes, mas permitir que cada uma delas customize partes específicas do algoritmo.
</p>

## 2. Metodologia

<p align="justify">
    A metodologia utilizada para aplicar o padrão Template Method é a seguinte: uma classe base abstrata define o esqueleto do algoritmo e declara os métodos abstratos que as subclasses devem implementar. Esses métodos representam os passos variáveis do algoritmo. As subclasses, por sua vez, herdam da classe base abstrata e implementam esses métodos abstratos de acordo com suas necessidades específicas.
    
    Padrão Template Method:

    Classe Base Abstrata - Neste contexto, a classe base abstrata representa o Template Method. Ela define o esqueleto do algoritmo, incluindo a ordem dos passos, mas deixa os detalhes de implementação de certos passos para as subclasses. A classe base abstrata declara métodos abstratos que as subclasses devem implementar.

    Subclasses Concretas - São as subclasses que herdam da classe base abstrata e fornecem implementações específicas para os métodos abstratos. Elas personalizam ou estendem certos passos do algoritmo definido na classe base, mantendo a estrutura geral intacta.

</p>

## 3. Participantes
- [Abdul Hannan](https://github.com/hannanhunny01)

- [Erick Levy](https://github.com/Ericklevy)

- [Heitor Marques](https://github.com/heitormsb)



## 4. Exemplo de Codigo

`PedidoComum.java`

```
package sistema;

import java.util.Date;

public class PedidoComum extends Pedido {

    public PedidoComum(int idPedido, Produto produto, int quantidade, Date data, boolean pago, Comprador comprador, int idVendedor) {
        super(idPedido, produto, quantidade, data, pago, comprador, idVendedor);
    }

    @Override
    public float calcularPreco() {
        // Implementação do cálculo de preço para um pedido comum
        return getProduto().getPreco() * getQuantidade();
    }

    @Override
    protected Reclamacao criarReclamacao(TipoReclamacao tipo) {
        // Criação da reclamação para um pedido comum
        return new ReclamacaoPedidoComum(this, tipo);
    }
}

```

`Pedido.java`

```
package sistema;

import java.util.Date;

public abstract class Pedido {
    private int idPedido;
    private Produto produto;
    private int quantidade;
    private Date data;
    private boolean pago;
    private Comprador idComprador;
    private int idVendedor;
    private Reclamacao reclamacao;

    public Pedido(int idPedido, Produto produto, int quantidade, Date data, boolean pago, Comprador comprador, int idVendedor) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
        this.pago = pago;
        this.idComprador = comprador;
        this.idVendedor = idVendedor;
    }

    public void fazerReclamacao(TipoReclamacao tipo) {
        this.reclamacao = criarReclamacao(tipo);
    }

    // Template Method - Define a estrutura do algoritmo
    protected abstract Reclamacao criarReclamacao(TipoReclamacao tipo);

    public int getIdPedido() {
        return idPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getData() {
        return data;
    }

    public boolean isPago() {
        return pago;
    }

    public Comprador getIdComprador() {
        return idComprador;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public Reclamacao getReclamacao() {
        return reclamacao;
    }

    // Método específico - Calcula o preço total do pedido
    public float calcularPreco() {
        return produto.getPreco() * quantidade;
    }
}

```


No código, a classe abstrata Pedido possui um método fazerReclamacao que utiliza o padrão Template Method. Esse método chama o método criarReclamacao, que é um método abstrato declarado na classe Pedido e implementado nas subclasses concretas, como PedidoComum.

Dessa forma, a estrutura do algoritmo para fazer uma reclamação é definida na classe abstrata Pedido, mas a implementação específica desse algoritmo é delegada às subclasses. Cada tipo de pedido (como PedidoComum) pode fornecer sua própria implementação do método criarReclamacao, permitindo que cada tipo de pedido crie uma reclamação adequada para si.



## 5. Conclusão

<p align="justify">
    O padrão Template Method permite definir um esqueleto de algoritmo em uma classe base, com partes variáveis implementadas por suas subclasses. Isso permite que o comportamento geral seja compartilhado entre várias classes, enquanto partes específicas podem ser personalizadas. O padrão é útil quando se deseja evitar duplicação de código em classes semelhantes e quando se quer garantir que a estrutura do algoritmo permaneça consistente em todas as subclasses.

</p>

## 6. Referências

> Refactoring Guru - Template Method. Disponível em: <https://refactoring.guru/pt-br/design-patterns/template-method>. Acesso em: 11 junho. 2023.


## 7. Histórico de versionamento

|Data | Versão | Descrição | Autor(es)|Revisores|
| -- | -- | -- | -- |--|
|11/06/2023|1.0|Criação do Documento de gof template method| [Abdul Hannan](https://github.com/hannanhunny01) <br>   [Erick Levy](https://github.com/Ericklevy) e [Heitor Marques](https://github.com/heitormsb)| 
