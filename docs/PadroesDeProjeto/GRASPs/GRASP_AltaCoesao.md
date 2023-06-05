# 3.1. Módulo Padrões de Projeto GRASPs

## 3.1.1. Introdução

Padrões de projeto são princípios e soluções usados durante a criação de um software, codificados em um formato estruturado, descrevendo o problema e a respectiva solução adotada. Com isso, GRASP, ou Padrões de Software para Atribuição de Responsabilidade Geral em português, é um tipo de padrões de projeto que pode ser aplicado para o desenvolvimento de um projeto. Em outras palavras, os padrões GRASP são princípios descritos de modo metódico, explicável e repetível para atribuir as responsabilidades (fazer e conhecer) dos papéis (objetos).

## 3.1.2. GRASP de Alta Coesão

O padrão de projeto de alta coesão se refere à atribuição de responsabilidades de maneira a maximizar a coesão em uma classe ou módulo. Isso significa que todas as responsabilidades de uma classe ou módulo devem estar relacionadas e trabalhar em conjunto para atingir um objetivo comum.

Em geral, uma classe ou módulo com alta coesão é considerada mais fácil de entender, manter e testar, pois possui um propósito claro e bem definido. Além disso, é provável que uma classe ou módulo com alta coesão seja reutilizável em outros contextos, pois possui um conjunto de responsabilidades bem definido e não depende de outras classes ou módulos para realizar suas tarefas.

![image](https://user-images.githubusercontent.com/54439337/210288575-24b5048f-f2f4-4007-985a-c3b0bf456289.png)<br>
*Imagem 1: Diferença entre baixa e alta coesão. Fonte: https://unbarqdsw2022-1.github.io/2022.1_G2_DonAct/#/PadroesDeProjeto/3.1.GRASPs*

Na figura em blocos da esquerda exemplifica um projeto que é comum de ser encontrado no mercado de trabalho, sendo suas características: 

- Maior complexidade; 
- Dependência entre classes; 
- Forte acoplamento; 
- Baixa reutilização; 
- Maior impacto em mudanças; 
- Dificuldade na documentação e no entendimento; 
- Maior dificuldade na produção de testes.

Projeto esse que apresenta uma baixa coesão, ou seja, suas principais funções e classes estão interligadas de formas indesejáveis, dificultando o trabalho do profissional responsável. Já o projeto da direita apresenta um projeto mais difícil de se encontrar, com raras características: 
- Menor complexidade; 
- Maior reutilização; 
- Dependendo da situação até inutiliza a função da documentação, essa que é muito mais simples e consideravelmente entendível;
- Mudanças impactam minimamente o sistema;
- Baixo acoplamento;
- Testes coerentes e fáceis de serem alterados. 

No projeto do grupo 3, foi definido desde o começo que desenvolveríamos com o padrão de projeto de alta coesão, apesar de levar tempo e não ser a tarefa mais fácil, é recompensador a longo prazo. Isto é, conforme os requisitos do produto eram alterados. Para exemplificar melhor esse padrão de projeto serão apresentados exemplos no Back e Front-end.

No Back-end, um exemplo mais simples é a utilização do padrão gerado pelo MVC de OO em java.

![image]()<br>
*Imagem 3: Conjunto de arquivos para organização em Java. Fonte: Autores do documento*

*Note*: As imagens apresentadas podem ser alteradas, tendo em vista que o projeto está em constante desenvolvimento.

# 3.2 Referências

* SILVA. Ramon. Página do Engenheiro Ramon Ferreira Silva: Padrões GRASP. Rio de Janeiro, 10 mar. 2021. Disponível em: https://www.ramonsilva.net/post/alta-coes%C3%A3o-padr%C3%B5es-grasp. Acesso em: 05 de junho de 2023.
* Projeto semestre anterior: Módulo Padrões de Projeto GRASPs. Disponível em: https://unbarqdsw2022-1.github.io/2022.1_G2_DonAct/#/PadroesDeProjeto/3.1.GRASPs. Acesso em: 05 de junho de 2023.

## Histórico de Versões

|    Data    | Versão |            Descrição           |       Autor     |    Revisor    |
|  --------  |  ----  |            ----------          | --------------- |    -------    |
| 05/06/2023 |  1.0.0 |  Configuração inicial do artefato de Padrões GRASPs | [Vinícius Assumpção](https://github.com/viniman27) , [Gabriel Roger](https://github.com/GabrielRoger07) e [João Pedro Vaz](https://github.com/JoaoPedro0803) | [Erick Levy](https://github.com/Ericklevy) |
