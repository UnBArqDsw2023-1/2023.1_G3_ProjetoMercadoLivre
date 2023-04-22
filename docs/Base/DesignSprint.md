
# Design Sprint

## Introdução & Objetivo

Design Sprint é uma técnica feita em equipe para ajudar na construção de artefatos importante para o projeto a ser realizado. Ela foi primeiramente usada e desenvolvida pelo Google Ventures visando, de forma ágil e colaborativa, conceituar e concretizar uma ideia, um produto, suas implementações e funcionalidades em um curto espaço de tempo. A técnica é composta por 4 etapas:

- Unpack
- Sketch
- Decision
- Prototype

## Metodologia

A partir do conhecimento da definição e objetivo do Design Sprint, a equipe se uniu a fim de realizar sua execução. Cada uma das etapas serão explicadas e como foram aplicadas durante a realização da técnica.

# Processos, Metodologias e Abordagens

## 1. **Introdução**

Nesse módulo iremos abordar três conceitos que podem ser entendidos com um conjunto de atividades, práticas ou diretrizes que visam auxiliar no processo de desenvolvimento de um Software.

## 2. **Metodologias  Abordagens e Processos**
As metodologias, abordagens e processos se diferenciam pela sua flexibilidade e rigor, mas todas são podem ser entendidas como práticas que buscam agilizar o desenvolvimento de um projeto. Assim, as metodologias tem um papel fundamental na produtividade das equipes e vem ganhando cada vez mais importância.

O uso de métodos ágeis promove melhor comunicação, conhecimento, organização e bem estar da equipe. Desse modo podemos incluir toda a equipe e o cliente entro desse processo.

## 3. **Breve Resumo das metodologias**

### 3.1. **RUP**
O RUP, ou Rational Unified Process, foi criado pelo grupo da IBM Rational e é um processo que usa uma abordagem orientada a objetos em sua concepção, fazendo uso de gráficos UML para ilustrar esses processos.

Suas principais característica é ser iterativo e incremental. Que se baseia em implementar uma ideia e apresentar ao usuário buscando atender aos seus feedback, refinando a cada etapa.

Baseado em ciclos de quatro fases: Concepção, Elaboração, Construção e transição e nove disciplinas.

### 3.2. **Scrum**
O Scrum surgiu a partir do problema das pessoas em gerenciar o tempo. Desde muito tempo nós tempos problemas em lidar com prazos muito grandes. Apenas quando falta poucos dias para o prazo limite do projeto tomamos consciência na situação e vemos que é praticamente inviável finalizar todas as tarefas a tempo.

Para isso o Scrum surge para dividir o projeto em pequenas etapas. Cada etapa possui um ciclo que deve ser seguido: Planejar, Construir, testar e revisar.

Existem 3 papeís essenciais para o trabalho funcionar:
* Scrum master
* Product Owner
* Team (desenvolvedores, testadores, etc, ...)

E três artefatos que fazer parte da documentação:
* Product Backlog
* Sprint backlog - Que são ditadas atravês de história de usuário.
* Gráfico de Burndown

### 3.3. **Lean**
A metodologia Lean tem como objetivo a identifica e eliminação dos desperdícios.O lema do Lean é fazer tudo certo uma vez na qualidade certa no momento certo.

Os cinco princípios do Lean são:
* Valor para o cliente
* Fluxo de Valor
* Fluxo contínuo
* Sistema pull (just in time)
* Kaizen (melhoria contínua)

Muito usado no início do projeto para fazer a elicitação dos requisitos.

### 3. **Kanban**
O Kanban é uma abordagem muito simples de ser implementada, mas que agrega muito valor no gerenciamento de fluxo de trabalho. 

O Kanban utiliza um quadro dividido em "a fazer", "fazendo" e "feito" e cartões coloridos. A ideia é conforme as atividades forem executadas os cartões são movidos na coluna. 

### 3.4. **XP**
Uma das principais preocupações da metodologia XP é o bem estar da equipe. A prática de pair programming é um dos diferencias, pois nivela a equipe de desenvolvimento.

A mentalidade do XP se baseia em:
* escrever testes
* refatoração e melhoria do código
* proximidade com o cliente

## 4. **Escolha da(s) metodologia(s)**
Construir ou evoluir um software com o mínimos de erros, dentro do prazo e custos pré-estabelecidos não é uma tarefa fácil. Para isso, as metodologias ágeis trouxeram grande ajuda

Porém, ainda é dificil se adaptar a tantos processos. A combinação de metodologias, sejam elas tradicionais ou ágeis, permite eliminar essa complexidade desnecessária. Para as metodologias ágeis e processo de combinação é mais fácil uma vez que ambas possuem muitas características em comum.

### 4.1 **SCRUM**
A escolha do Scrum deve-se ao uso de *Sprints* que funcionam em pequenos ciclos de 7-10 dias (tempo determinado préviamente pela equipe). Esses ciclos ajudam a manter o controle dos prazos de entrega.

* **Sprint planning:** Realizado nas terças ou quintas para planejar as da semana.

* **Sprint Review:** Realizados nas terças ou quintas para checar o andamento da equipe com as atividades da semana.

* **Produto Backlog:** Lista de ideias e recursos que devem ser completados ao longo da semana.

### 4.2 **Kanban**
Faremos uso de *Checklists* que é uma abordagem muito simples e efetiva facilidando muito a aderência pela equipe. Para acompanhar as atividades usaremos um quadro e dividi-lo em:

* **TO DO** - Atividades que ainda precisam ser realizadas.
* **Doing** - Atividades em andamento.
* **Done** - Atividades que foram finalizadas e aprovadas pela equipe.

### 4.3. **XP**
A metodologia XP, por ser um método de desenvolvimento que preza o bem estar da equipe e a confiabilidade do produto. Adotamos algumas boas práticas como:

* **Pair Programming(programação em pares):** é uma pratica que ajuda a nivelar o nível de conhecimento da equipe e garantindo códigos mais robustos com duas linhas de pensamento alinhadas.

* **Integração contínua:** Utilizaremos ferramentas de teste unitário para melhor manutenabilidade do software.

* **Padronização do código:** Todo código é desenvolvido seguindo um padrão, qualquer que seja, mas toda equipe deve seguir o mesmo padrão. Dessa forma, todos da equipe terão a mesma visão do código.

## 5. **Escolha dos Artefatos**
A escolha dos artefatos deve-se a sua simplicidade e eficiência. Xp, SCRUM e Kanban costumam ser as metodologias favoritas para projetos de curto prazo que visam maior flexibilidade.

Outro motivo da escolha é devido à familiaridade do grupo com tais abordagens. O simples fato de todos integrantes do grupo já estarem envolvidos em projetos que aplicavam os artefatos apresentados.

## 6. **Modelagem BPMN**
A modelagem BPMN é um diagrama que modela os processos  de negócio do produto. Nele contém um fluxograma que passa por cada etapa dentro de um processo.

Elaboramos um fluxograma que especifica nossa abordagem metodológica e do fluxo selecionado. Utilizamos como ponto de início do evento nossas sprints, além de tarefas e *gateways* para especificar ações e decisões tomadas. Então separamos em piscinas, que sugerem a que parte do processo pertence aquele atividade/ação.

## 7. Comunicação
Devido ao tamanho do grupo e devido ao trabalho exigir horas extra classe, definimos as ferramentas que utilizaremos para auxiliar na comunicação da equipe.

### 7.1. Discord
O Discord é uma das maiores ferramentas de comunicação do time. Foi criado um servidor somente para a interação da equipe, utilizado para reuniões e pareamentos. Além disso, também foi instaciado um webhook, para receber notificações do GitHub.

Também é utilizado o servidor da disciplina, onde é feita a comunicação com os clientes do projeto e o professor.

### 7.2 Telegram
Além do Discord, a comunicação do time também é feita pelo Telegram, onde são feitas discussões mais objetivas e pontuais.

## 8. Referências bibliográficas

> Deisy Braz S., COMBINAÇÃO DE MÉTODOS ÁGEIS NO PROCESSO DE DESENVOLVIMENTO DE SOFTWARE: UM ESTUDO DE CASO. Disponível em: <https://periodicos.uniarp.edu.br/index.php/ignis/article/download/1133/570/4664>

> SCRUM. Disponível em: <http://www.desenvolvimentoagil.com.br/scrum/>

> T.L., Métodos ágeis: o que são e como impactam o seu negócio? Disponível em: <https://www.lumis.com.br/a-lumis/blog/metodos-ageis.htm#:~:text=As%20metodologias%20%C3%A1geis%20s%C3%A3o%20uma,revistos%20com%20os%20m%C3%A9todos%20%C3%A1geis.>

> Object Management Group Business Process Model and Notation, Disponível em: <https://www.bpmn.org/>

> Prof. Milene Serrano, disciplina Arquitetura e Desenho de Software. Base - Metodologia, BPMN

## 9. Versionamento

|    Data    | Versão |      Descrição       |                   Autor(a)                    |                   Revisor(a)                    |
| ---------- | ------ | -------------------- | --------------------------------------------- | ----------------------------------------------- |
| 18/04/2023 |  1.0   | Criação do documento | [Vinícius Assumpção](https://github.com/viniman27), [João Pedro Pedro de Camargo Vaz](https://github.com/JoaoPedro0803)| [Gabriel Roger Amorim da Cruz](https://github.com/GabrielRoger07)   |
| 21/04/2023 |  1.1   | Processos, Metodologias e Abordagens | [João Pedro Pedro de Camargo Vaz](https://github.com/JoaoPedro0803)| [Gabriel Roger Amorim da Cruz](https://github.com/GabrielRoger07), [Vinícius Assumpção](https://github.com/viniman27)|
| 22/04/2023 |  1.2   | Escolha dos artefatos, BPMN, Comunicação e Referências Bibliográficas | [Gabriel Roger Amorim da Cruz](https://github.com/GabrielRoger07) | [João Pedro Pedro de Camargo Vaz](https://github.com/JoaoPedro0803) e [Vinícius Assumpção](https://github.com/viniman27) |
