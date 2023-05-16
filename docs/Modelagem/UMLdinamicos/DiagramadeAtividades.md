# Diagrama de Atividades

## Introdução
O Diagrama de Atividades é um diagrama dinâmico que mostra o fluxo entre os objetos, ou seja, a parte comportamental, representando-a como um fluxo de ações. O foco se encontra nos procedimentos, processos de negócio e fluxo de trabalho.

## Metodologia

O Diagrama de Atividades tem 5 elementos principais na sua composição:
1. Atividades

Na UML, as atividades são elementos de contêiner que descrevem o nível mais alto do comportamento em um diagrama de atividades. As atividades contêm diversos nós de atividade e linhas de atividade que representam a sequência de tarefas em um fluxo de trabalho que resulta em um comportamento.

2. Ações

Na UML, uma ação representa uma unidade discreta de funcionalidade em uma atividade.

3. Nós de Controle

Nos diagramas de atividade, um nó de controle é um nó de atividade abstrata que coordena o fluxo de controle em uma atividade.

4. Nós do Objeto

Nos diagramas de atividades, um nó de objeto é um nó de atividade abstrata que ajuda a definir o fluxo de objetos em uma atividade. Um nó de objeto indica que uma instância de um classificador pode estar disponível em um ponto específico na atividade.

5. Linhas de Atividade

Nos diagramas de atividades, uma extremidade de atividade é uma conexão direcionada entre dois nós de atividade. Quando uma ação específica em uma atividade é concluída, a linha de atividade contínua o fluxo para a próxima ação na sequência.

A partir do entendimento da diagramação e de seus elementos, foram desenvolvidos diagramas para 2 tipos de casos de usos diferentes encontrados no projeto:

* Abertura do processo de reclamação, troca/devolução ou ausência do produto pelo cliente
* Processamento da comunicação dada pela plataforma sobre uma compra pelo vendedor


## Diagramas

### Abertura do processo de reclamação pelo cliente

![Diagrama de Atividades Comprador](/docs/Assets/diagramasAgeisImg/DiagramaDeAtividadesComprador.png)

<figcaption align='center'>
  <b>Figura 1: Diagrama de atividades de abertura do processo de reclamação pelo cliente</b>
  </br>
  <small>Fonte: Grupo 3</small>
</figcaption>
</br>

### Processamento da comunicação pelo vendedor

![Diagrama de Atividades Vendedor](/docs/Assets/diagramasAgeisImg/DiagramaDeAtividadesVendedor.png)

<figcaption align='center'>
  <b>Figura 2: Diagrama de atividades de processamento da comunicação pelo vendedor</b>
  </br>
  <small>Fonte: Grupo 3</small>
</figcaption>
</br>

## Referências

SERRANO, Milene. Diagrama de Colaboração, 2022. Material apresentado na Disciplina de Arquitetura e Desenho de Software do curso de engenharia de software da UnB, FGA. Acesso em: 09 de maio de 2023.

UML DIAGRAMS. UML Communication Diagrams Overview. Disponível em: https://www.uml-diagrams.org/communication-diagrams.html. Acesso em: 09 de maio de 2023.

Diagramas de Atividades. Disponível em: https://www.ibm.com/docs/pt-br/rational-soft-arch/9.7.0?topic=diagrams-activity. Acesso em: 09 de maio de 2023.

## Histório de Versionamento

Data | Versão |Descrição |Autor | Revisor
-----|--------|----------|------|--------
| 09/05/2023 | 1.0.0 | Elaboração do artefato de Diagrama de Atividades | [Vinícius Assumpção](https://github.com/viniman27) , [Gabriel Roger](https://github.com/GabrielRoger07) e [João Pedro Vaz](https://github.com/JoaoPedro0803) | [Erick Levy](https://github.com/Ericklevy) |
| 11/05/2023 | 1.0.1 | Elaboração dos diagramas de atividades | [Gabriel Roger](https://github.com/GabrielRoger07), [Vinícius Assumpção](https://github.com/viniman27) e [João Pedro Vaz](https://github.com/JoaoPedro0803) | [Erick Levy](https://github.com/Ericklevy) |
| 12/05/2023 | 1.0.2 | Inclusão de legenda e fonte nas imagens | [Gabriel Roger](https://github.com/GabrielRoger07), [Vinícius Assumpção](https://github.com/viniman27) e [João Pedro Vaz](https://github.com/JoaoPedro0803) | [Erick Levy](https://github.com/Ericklevy) |
