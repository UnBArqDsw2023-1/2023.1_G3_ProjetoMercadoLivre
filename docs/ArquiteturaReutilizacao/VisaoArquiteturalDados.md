# VISÃO ARQUITETURAL - DADOS
<br> </br>

## INTRODUÇÃO
<h5 align='justify'> A visão arquitetural de dados é uma representação estruturada e abstrata dos principais elementos e relacionamentos envolvidos no gerenciamento de dados em um sistema ou organização. É uma parte essencial do projeto de arquitetura de dados, que tem como objetivo fornecer uma estrutura conceitual para a organização, integração e uso dos dados. Diante disso, descreve a estrutura lógica dos dados, incluindo os tipos de dados, as entidades e os relacionamentos entre elas. Ela também pode abordar questões como a modelagem de dados, os padrões de nomenclatura, a governança dos dados e a segurança da informação. </h6>
<br> </br>

## METODOLOGIA
<h5 align='justify'> O desenvolvimento dos artefatos a seguir baseou-se nos artefatos de diagrama de classes, em especial o pacote Model do diagrama arquitetural MVC. Isso se deve ao fato dele representar os dados e a lógica de negócio subjacente ao aplicativo, encapsulando a estrutura de dados. Sendo assim, os artefatos Modelo Entidade-Relacionamento (ME-R), Diagrama Entidade-Relacionamento (DE-R) e Diagrama Lógico de Dados (DLD) a serem apresentados, foram desenvolvido nesta mesma ordem, ou seja, a partir do artefato de mais alto nível de abstração até o de menor nível. Isso permite com que o projetista, após o processo de abstração contido no ME-R, realize um processo denominado "mapeamento" dos dados para o próximo nível contído no DE-R, e assim sucessivamente nos demais níveis de menor abstração. Para tanto, o proceso de mapeamento baseia-se na aplicação de diverças regras de mapeamento para manter a consistência e integridade dos dados. </h6>
<br> </br>

## ARTEFATOS
<h5 align='justify'> Diante do exposto no tópico METODOLOGIA, serão apresentados 3 artefatos nesta seção do projeto. Os próximos tópicos a seguir apresentarão, cada um, um artefato específico, seguindo a hierarquia de abstração mencionada para manter o fluxo de mapeamento entre níveis. </h6>
<br> </br>

### MODELO ENTIDADE RELACIONAMENO (MER ou Modelo ER)
<h5 align='justify'> O Modelo Entidade Relacionamento consiste em um modelo conceitual utilizado na Engenharia de Software para descrever os objetos (entidades) envolvidos em um domínio de negócios. Isso é feito a partir de suas características (atributos) e como elas se relacionam entre si (relacionamentos). Sendo assim, em geral, este modelo representa de forma abstrata a estrutura que possuirá o banco de dados da aplicação. Por tanto, esta técnica de modelagem, evidenciada na imagem 1 logo a baixo, representa o primeiro nível de abstração, entre os artefatos de visão arquitetural de dados, a ser trabalhado neste projeto. </h5>
<br> </br>

(IMAGEM 1)
<h6 align='center'> <b>Imagem 1:</b> Modelo Entidade Relacionamento <br> Fonte: autoria própria </h6>
<br> </br>

### DIAGRAMA ENTIDADE RELACIONAMENO (DER ou Diagrama ER)
<h5 align='justify'> Enquanto o MER é um modelo conceitual, o DER é a sua representação gráfica e principal ferramenta. Além disso, este diagrama facilita a comunicação entre os integrantes da equipe, pois oferece uma linguagem comum utilizada tanto pelo analista, responsável por levantar os requisitos, e os desenvolvedores, responsáveis por implementar aquilo que foi modelado. Por tanto, de acordo com a metodologia apresentada no tópico METODOLOGIA, após a confecção do MER mapeia-se seus elementos no DER, seguindo diversas regras essenciais para manter a rastreabilidade e integridade dos dados ao seguir de um nível de abstração à outro. A imagem 2 a seguir apresenta este artefato elaborado a partir da ferramenta brModelo versão 3.3, a qual pode ser baixada gratuitamente pela internet. </h5>
<br> </br>

(IMAGEM 2)
<h6 align='center'> <b>Imagem 2:</b> Diagrama Entidade Relacionamento desenvolvido no app brModelo v3.3 <br> Fonte: autoria própria </h6>
<br> </br>

### DIAGRAMA LÓGICO DE DADOS (DLD)
<h5 align='justify'> Um diagrama lógico de dados consiste em uma representação visual que descreve a estrutura e as relações dos dados em um sistema de banco de dados. Ele utiliza símbolos gráficos para representar as tabelas (relações), colunas e as conexões entre elas. O diagrama lógico de dados mostra a organização dos dados e as regras que regem esses relacionamentos, permitindo uma compreensão clara do esquema do banco de dados. Ele é uma ferramenta essencial no projeto de bancos de dados, pois ajuda os desenvolvedores e usuários a entenderem a estrutura do sistema, identificarem as entidades e seus atributos, e facilita a comunicação entre as partes envolvidas no desenvolvimento do banco de dados. Diante do exposto, este artefato (imagem 3) possui um nível de abstração muito mais próximo da implementação do que os outros dois citados (MER e DER), o qual também segue determinadas regras de mapeamento, a fim de trazer novas informações ao projeto de banco de dados em relação ao artefato que lhe deu origem (DER). </h5>
<br> </br>

(IMAGEM 3)
<h6 align='center'> <b>Imagem 3:</b> Diagrama Lógico de Dados desenvolvido no app brModelo v3.3 <br> Fonte: autoria própria </h6>
<br> </br>

## CONCLUSÃO
<h5 align='justify'> A elaboração dos artefatos apresentados contribuem de diversas maneiras para o projeto. Com eles, torna-se mais fácil uma série de fatores, como compreensão visual, documentação, planejamento, análise, comunicação e colaboração, assim como a detecção de erros e inconsistências. Sendo assim, são capazes de contribuir para o projeto de maneira muito significativa, trazendo detalhes em diferentes níveis de abstrações do projeto lógico de banco de dados. </h5>
<br> </br>

## BIBLIOGRAFIA
> SERRANO, Milene. Arquitetura e Desenho de Software. AULA - ARQUITETURA & DAS – PARTE II, [S. l.], p. 1-55. Disponível em: <https://aprender3.unb.br/pluginfile.php/2482580/mod_label/intro/Arquitetura%20e%20Desenho%20de%20Software%20-%20Aula%20Arquitetura%20e%20DAS%20-%20Parte%20II%20-%20Profa.%20Milene.pdf>. Acesso em: 29 jun. 2023. <br></br>
> MODELAGEM de Dados - Projeto - Diagrama Entidade-Relacionamento - 01. [S. l.: s. n.], 2018. Disponível em: <https://www.youtube.com/watch?v=eWz0SLgJWxc>. Acesso em: 29 jun. 2023. <br></br>
> MODELAGEM de Dados - Modelo Entidade-Relacionamento e Diagrama ER. [S. l.: s. n.], 2017. Disponível em: <https://www.youtube.com/watch?v=W2Z1STnjNJo>. Acesso em: 29 jun. 2023. <br></br>
> JOEL. MER e DER: Modelagem de Bancos de Dados. [S. l.], 2014. Disponível em: <https://www.devmedia.com.br/mer-e-der-modelagem-de-bancos-de-dados/14332>. Acesso em: 29 jun. 2023.
<br></br>

## HISTÓRICO DE VERSÕES
|    Data    | Versão |            Descrição           |       Autor     |    Revisor    |
|  --------  |  ----  |            ----------          | --------------- |    -------    |
| 29/06/2023 |  0.0.1 |  Criação do documento de visão arquitetural dos dados | [Gustavo Martins Ribeiro](https://github.com/gustavomartins-github)|
