# GRASP Polimorfismo

## 3.1.1. Introdução

Padrões de projeto são princípios e soluções usados durante a criação de um software, codificados em um formato estruturado, descrevendo o problema e a respectiva solução adotada. Com isso, GRASP, ou Padrões de Software para Atribuição de Responsabilidade Geral em português, é um tipo de padrões de projeto que pode ser aplicado para o desenvolvimento de um projeto. Em outras palavras, os padrões GRASP são princípios descritos de modo metódico, explicável e repetível para atribuir as responsabilidades (fazer e conhecer) dos papéis (objetos).


##  3.1.2. GRASP Polimorfismo

No polimorfismo temos que subclasses que se originam de uma superclasse podem invocar métodos da segunda e sobrescrevê-los, já que cada subclasse tem um comportamento diferente.

O padrão polimorfismo trabalha na organização das classes utilizando operações polimórficas, fazendo com que as responsabilidades sejam atribuídas a abstrações condizentes ao invés de objetos concretos. 
    
### Vantagens
	
- Apoia o princípio de baixo acoplamento;
- Útil em projetos com variações semelhantes;
- Facilidade em estender o projeto com novas funcionalidades;

### Implementação no Mercado Livre
O GRASP polimorfismo foi utilizado na herança do Processo em UsuarioAnunciante e UsuarioAdotante, a especialidade escolhida, além das outras também existentea, possuindo funcionalidades diferentes no projeto. Segue nossa aba do diagrama de classe [Diagrama de Classe](Modelagem/UMLEstaticos/DiagramaDeClasses.md) e abaixo o diagrama mais revisado até a data da útima atualização.

![Diagrama de Classes](docs/Assets/DiagramaDeClassesV2.png)


### Referências

> Serrano, Milene. 2020. Aula GRASPs Parte I Conteúdo Complementar.  https://aprender3.unb.br/pluginfile.php/2277128/mod_label/intro/Arquitetura%20e%20Desenho%20de%20Software%20-%20Aula%20GRASP_A%20-%20Profa.%20Milene%20-%20Complementar.pdf. Acesso em: 05 de junho de 2023.

> Serrano, Milene. 2020. Aula GRASPs Parte II Conteúdo Complementar.  https://aprender3.unb.br/pluginfile.php/2277128/mod_label/intro/Arquitetura%20e%20Desenho%20de%20Software%20-%20Aula%20GRASP_B%20-%20Profa.%20Milene%20-%20Complementar.pdf. Acesso em: 05 de junho de 2023.

> BOAS, Leandro. Padrões GRASP — Padrões de Atribuir Responsabilidades. Medium, 2019. Disponível em: <https://medium.com/@leandrovboas/padr%C3%B5es-grasp-padr%C3%B5es-de-atribuir-responsabilidades-1ae4351eb204>. Acesso em: 05 de junho de 2023.

> Renato. Desenvolvimento com qualidade com GRASP. Devmedia, 2013. Disponível em: <https://www.devmedia.com.br/desenvolvimento-com-qualidade-com-grasp/28704>. Acesso em: 05 de junho de 2023.

> GRASP (padrão orientado a objetos). Wikipedia, 2020. Disponível em: <https://pt.wikipedia.org/wiki/GRASP_(padr%C3%A3o_orientado_a_objetos)>. Acesso em: 05 de junho de 2023.


## Histórico de Versões

|    Data    | Versão |            Descrição           |       Autor     |    Revisor    |
|  --------  |  ----  |            ----------          | --------------- |    -------    |
| 05/06/2023 |  1.0.0 |  Configuração inicial do artefato de Padrões GRASPs | [Vinícius Assumpção](https://github.com/viniman27) , [Gabriel Roger](https://github.com/GabrielRoger07) e [João Pedro Vaz](https://github.com/JoaoPedro0803) | [Erick Levy](https://github.com/Ericklevy) |
