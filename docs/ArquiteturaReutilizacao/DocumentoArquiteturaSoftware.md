# Documento de Arquitetura de Software - DAS

## 1. Introdução

###  1.1. Finalidade

Este documento tem como objetivo explicar os aspectos gerais da arquitetura do projeto Mercado livre em relação aos processos de reclamação, estorno, devolução e/ou troca. Ele visa mostrar as escolhas arquiteturais feitas e os padrões utilizados durante o desenvolvimento do projeto.

### 1.2. Escopo
 
Este documento tem como objetivo apresentar uma visão geral da arquitetura do sistema desenvolvido para o projeto Mercado Livre. Ele incluirá informações sobre os padrões de software utilizados, os componentes de software, os frameworks de desenvolvimento, os casos de uso e a persistência de dados. Ele tem como objetivo descrever tecnicamente a solução adotada, tornando o projeto manutenível e apresentando os padrões a serem seguidos ao longo do seu desenvolvimento.

## 2. Representação Arquitetural

### 2.1 Back-End

**Java** Para o back-end, a linguagem escolhida para o desenvolvimento foi Java. A principal razão para essa escolha foi a familiaridade com essa linguagem pela maioria dos integrantes do grupo, além do consenso geral de que o desenvolvimento de uma aplicação web poderia ser beneficiado pelo uso de certas ferramentas disponíveis para Java.

Como modelo arquitetural, então, foi adotado, "automaticamente" o MTV (Model Template View), uma vez que é o padrão implementado pelo framework.


## 3. Metas Arquiteturais e Restrições da Arquitetura

|  Restrições   | Descrição  |
| :-----------: | :--------: |
| Conectividade	| É necessário estabelecer conexão com internet para utilização do Mercado Livre. |
| Idioma	| O sistema deve ser desenvolvido para o idioma português do Brasil. |
| Público |	O Web-App tem como público compradores e vendedores do Web-App mercado livre. |
| Plataforma	| A aplicação terá suporte para web browsers. |

## 4. Requisitos Não Funcionais

| Metas	| Descrição |
| :------: | :------: |
| Fácil de utilização | O usuário deve conseguir utilizar o app sem treinamento específico |
| Segurança | O Web-Appdeve proteger os dados dos usuários. |
| Padronização | O Web-Appdeve ser intuitivo e de fácil utilização. Com layouts semelhantes à aplicações de mídias sociais já estabelecidas. |


## 5. Visão Lógica

### 5.1. Diagrama de Pacote
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLEstaticos/diagramaPacotes"></iframe></center>

### 5.2. Diagrama de Classes
<center><iframe height="600" width="700" src=" https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLEstaticos/DiagramaDeClasses"></iframe></center>

### 5.3. Diagrama de Comunicação
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLDinamicos/diagramaDeComunicacao"></iframe></center>

### 5.4. Diagrama de Estados
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLDinamicos/DiagramadeEstados"></iframe></center>


## 6. Visão de Implementação

### 6.1. Diagrama de Componentes
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLEstaticos/diagramaComponentes"></iframe></center>

## 7. Visão de Implantação
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLEstaticos/diagramaImplantacao"></iframe></center>

## 8. Visão de Processos

### 8.1. Diagrama de Atividades
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLDinamicos/DiagramadeAtividades"></iframe></center>

### 8.2. Diagrama de Sequência
<center><iframe height="600" width="700" src="https://unbarqdsw2023-1.github.io/2023.1_G3_ProjetoMercadoLivre/#/Modelagem/UMLDinamicos/Diagramadesequencia"></iframe></center>

## 9. Tamanho e Desempenho

### 9.1. Requisitos Mínimos

    * É necessário possuir conexão com a internet;
    * Para desenvolvimento possuir algum dos sistemas abaixo: 
        - Microsoft® Windows® 8/10/11 de 64 bits
        - Arquitetura de CPU x86_64; MacOS® 10.14 (Mojave) ou mais recente
        - Qualquer distribuição de Linux de 64 bits que oferece suporte para Gnome, KDE ou Unity DE e a Biblioteca C do GNU (glibc) 2.31 ou mais recente.

### 9.2. Visão Geral

O Web-App Mercado Livre é projetado com uma visão geral de simplicidade e eficiência. A arquitetura MVC (Model-View-Controller) é usada no desenvolvimento do backend, isso torna o desenvolvimento mais fácil e organizado, além de melhorar a manutenibilidade do código.
Em resumo, a visão geral do Web-App Mercado Livre é baseada na arquitetura MVC  e reutilização de código, garantindo que o Web-Appseja desenvolvido de forma organizada, escalável e eficiente.

## 10. Histórico de Versionamento

| Data | Versão | Descrição | Autor | Revisor |
| -----|--------|----------|------|-------- |
| 26/06/2023 | 1.0.0 | Elaboração do artefato de padroes-arquiteturais | [Vinícius Assumpção](https://github.com/viniman27) , [Gabriel Roger](https://github.com/GabrielRoger07) e [João Pedro Vaz](https://github.com/JoaoPedro0803) | [Erick Levy](https://github.com/Ericklevy) |
| 02/07/2023 | 1.0.1 | Alteração na numeração dos tópicos e correção do histórico de versionamento | [Gabriel Roger](https://github.com/GabrielRoger07) | [Vinícius Assumpção](https://github.com/viniman27) e [João Pedro Vaz](https://github.com/JoaoPedro0803) |
