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

<div align="center">

![MER_Final](https://github.com/UnBArqDsw2023-1/2023.1_G3_ProjetoMercadoLivre/assets/72039007/0a5b837f-5990-4527-b546-db684d205470)

</div>

<h6 align='center'> Imagem 1: Modelo Entidade Relacionamento <br> Fonte: autoria própria <br> Autor: Gustavo Martins Ribeiro </h6>

<br> </br>

### DIAGRAMA ENTIDADE RELACIONAMENO (DER ou Diagrama ER)
<h5 align='justify'> Enquanto o MER é um modelo conceitual, o DER é a sua representação gráfica e principal ferramenta. Além disso, este diagrama facilita a comunicação entre os integrantes da equipe, pois oferece uma linguagem comum utilizada tanto pelo analista, responsável por levantar os requisitos, e os desenvolvedores, responsáveis por implementar aquilo que foi modelado. Por tanto, de acordo com a metodologia apresentada no tópico METODOLOGIA, após a confecção do MER mapeia-se seus elementos no DER, seguindo diversas regras essenciais para manter a rastreabilidade e integridade dos dados ao seguir de um nível de abstração à outro. A imagem 2 a seguir apresenta este artefato elaborado a partir da ferramenta brModelo versão 3.3, a qual pode ser baixada gratuitamente pela internet. </h5>
<br> </br>

<div align="center">

![Diagrama Entidade Relacionamento](https://github.com/UnBArqDsw2023-1/2023.1_G3_ProjetoMercadoLivre/assets/72039007/44066eb1-5f0e-4471-a0bf-c469bac9aed8)

</div>

<h6 align='center'> Imagem 2: Diagrama Entidade Relacionamento desenvolvido no app brModelo v3.3</b> <br> Fonte: autoria própria <br> Autor: Gustavo Martins Ribeiro </h6>
<br> </br>

### DIAGRAMA LÓGICO DE DADOS (DLD)
<h5 align='justify'> Um diagrama lógico de dados consiste em uma representação visual que descreve a estrutura e as relações dos dados em um sistema de banco de dados. Ele utiliza símbolos gráficos para representar as tabelas (relações), colunas e as conexões entre elas. O diagrama lógico de dados mostra a organização dos dados e as regras que regem esses relacionamentos, permitindo uma compreensão clara do esquema do banco de dados. Ele é uma ferramenta essencial no projeto de bancos de dados, pois ajuda os desenvolvedores e usuários a entenderem a estrutura do sistema, identificarem as entidades e seus atributos, e facilita a comunicação entre as partes envolvidas no desenvolvimento do banco de dados. Diante do exposto, este artefato (imagem 3) possui um nível de abstração muito mais próximo da implementação do que os outros dois citados (MER e DER), o qual também segue determinadas regras de mapeamento, a fim de trazer novas informações ao projeto de banco de dados em relação ao artefato que lhe deu origem (DER). </h5>
<br> </br>

<div align="center">

![Diagrama Logico de Dados](https://github.com/UnBArqDsw2023-1/2023.1_G3_ProjetoMercadoLivre/assets/72039007/6b3f47ad-2204-4102-b7f5-ded573104ea4)

</div>

<h6 align='center'> Imagem 3: Diagrama Lógico de Dados desenvolvido no app brModelo v3.3 <br> Fonte: autoria própria <br> Autor: Gustavo Martins Ribeiro</h6>
<br> </br>

## CONCLUSÃO
<h5 align='justify'> A elaboração dos artefatos apresentados contribuem de diversas maneiras para o projeto. Com eles, torna-se mais fácil uma série de fatores, como compreensão visual, documentação, planejamento, análise, comunicação e colaboração, assim como a detecção de erros e inconsistências. Sendo assim, são capazes de contribuir para o projeto de maneira muito significativa, trazendo detalhes em diferentes níveis de abstrações do projeto lógico de banco de dados. </h5>
<br> </br>

## ARTEFATOS EXTRAS
<h5 align='justify'> Existem diversos outros artefatos inerentes à um projeto de banco de dados relacional. Alguns deles são chamaos de scripts e servem de documentação para o projeto em questão, trazendo informações relevantes sobre o esquema da base de dados, como as tabelas, seus respectivos atributos e restrições, assim como visões as quais podem ser utilizadas em relatórios de auditória, etc. Além disso, durante o desenvolvimento de tais scripts, geralmente são percebidos erros os quais passaram despercebidos em artefatos de níveis de abstração superiores, como o DLD. Sendo assim, 3 novos artefatos foram desenvolvidos, na linguagem de banco de dados relacional SQL do SGBD (Sistema Gerenciador de Banco de Dados) MySQL 8.0.33, com o intuito de auxiliar a visão arquitetural de dados do projeto:  <a href="https://github.com/UnBArqDsw2023-1/2023.1_G3_ProjetoMercadoLivre/blob/VisaoArquitetural_Dados/docs/Assets/ScriptsMysql/ScriptFisico_MySQL.sql">Script Físico</a>, <a href="https://github.com/UnBArqDsw2023-1/2023.1_G3_ProjetoMercadoLivre/blob/VisaoArquitetural_Dados/docs/Assets/ScriptsMysql/ScriptPopula_MySQL.sql">Script Popula</a> e <a href ="https://github.com/UnBArqDsw2023-1/2023.1_G3_ProjetoMercadoLivre/blob/VisaoArquitetural_Dados/docs/Assets/ScriptsMysql/ScriptVisao_Mysql.sql"> Script Visão</a>. Tais artefatos podem ser visto conforme os subtópicos a seguir.
</h5>
<br> </br>

### Script Físico
<h5 align='justify'>Traz informações relevantes sobre o esquema da base de dados</h5>

```sql
-- ----------------------------------------- << SCRIPT: Físico (DDL) >> -----------------------------------------
--
-- Data Criacao ...........: 01/07/2023
-- Autor ..............: Gustavo Martins Ribeiro
-- Banco de Dados .........: MySQL
-- Base de Dados ..........: mercadoLivreDB
--
--
-- PROJETO => 01 Base de Dados
--         => 09 Tabelas
--
-- ---------------------------------------------------------

CREATE DATABASE IF NOT EXISTS mercadoLivreDB;

USE mercadoLivreDB;

CREATE TABLE USUARIO (
    idUsuario int auto_increment,
    senha varchar(12) not null,
    email varchar(50) not null,
    nomeCompleto varchar(100) not null,
    apelido varchar(50),
    dataCriacao date not null,
    CONSTRAINT USUARIO_PK PRIMARY KEY (idUsuario),
    CONSTRAINT USUARIO_UK UNIQUE KEY (email)
) engine = InnoDB auto_increment = 1;

CREATE TABLE COMPRADOR (
    idUsuario int,
    nivel enum('1','2','3','4','5','6') not null,
    CONSTRAINT COMPRADOR_PK PRIMARY KEY (idUsuario),
    CONSTRAINT COMPRADOR_USUARIO_FK FOREIGN KEY (idUsuario) REFERENCES USUARIO (idUsuario) ON DELETE CASCADE
) engine = InnoDB;
    
CREATE TABLE VENDEDOR (
    idUsuario int,
    reputacao enum('prata', 'ouro', 'platina') not null,
    CONSTRAINT VENDEDOR_PK PRIMARY KEY (idUsuario),
    CONSTRAINT VENDEDOR_USUARIO_FK FOREIGN KEY (idUsuario) REFERENCES USUARIO (idUsuario) ON DELETE CASCADE
) engine = InnoDB;

CREATE TABLE TELEFONE (
    idTelefone int auto_increment,
    numTelefone decimal(11) not null,
    idUsuario int not null,
    CONSTRAINT TELEFONE_PK PRIMARY KEY (idTelefone),
    CONSTRAINT TELEFONE_USUARIO_FK FOREIGN KEY (idUsuario) REFERENCES USUARIO (idUsuario) ON DELETE CASCADE
) engine = InnoDB auto_increment = 1;

CREATE TABLE ENDERECO (
    cep decimal(11),
    bairro varchar(50) not null,
    rua varchar(50) not null,
    numero int not null,
    complemento varchar(100),
    CONSTRAINT ENDERECO_PK PRIMARY KEY (cep)
) engine = InnoDB;

CREATE TABLE PEDIDO (
    idPedido int auto_increment,
    dataEmissao date not null,
    idUsuario int not null,
    CONSTRAINT PEDIDO_PK PRIMARY KEY (idPedido),
    CONSTRAINT PEDIDO_COMPRADOR_FK FOREIGN KEY (idUsuario) REFERENCES COMPRADOR (idUsuario) ON DELETE CASCADE
)engine = InnoDB auto_increment = 1;

CREATE TABLE TIPO_PRODUTO (
    idTipoProduto int auto_increment,
    nomeTipoProduto varchar(50) not null,
    CONSTRAINT TIPO_PRODUTO_PK PRIMARY KEY (idTipoProduto)
) engine = InnoDB auto_increment = 1;

CREATE TABLE PRODUTO (
    idProduto int auto_increment,
    nomeProduto varchar(50) not null,
    valor decimal not null,
    descricao varchar(500) not null,
    idUsuario int not null,
    idPedido int,
    idTipoProduto int not null,
    CONSTRAINT PRODUTO_PK PRIMARY KEY (idProduto),
    CONSTRAINT PRODUTO_VENDEDOR_FK FOREIGN KEY (idUsuario) REFERENCES VENDEDOR (idUsuario) ON DELETE CASCADE,
    CONSTRAINT PRODUTO_PEDIDO_FK FOREIGN KEY (idPedido) REFERENCES PEDIDO (idPedido) ON DELETE RESTRICT,
    CONSTRAINT PRODUTO_TIPO_PRODUTO_FK FOREIGN KEY (idTipoProduto) REFERENCES TIPO_PRODUTO (idTipoProduto) ON DELETE RESTRICT
)engine = InnoDB auto_increment = 1;

CREATE TABLE possui (
    idUsuario int not null,
    cep decimal(11),
    CONSTRAINT possui_USUARIO_FK FOREIGN KEY (idUsuario) REFERENCES USUARIO (idUsuario) ON DELETE RESTRICT,
    CONSTRAINT possui_ENDERECO_FK FOREIGN KEY (cep) REFERENCES ENDERECO (cep) ON DELETE SET NULL
) engine = InnoDB;
```
<br> </br>

### Script Popula
<h5 align='justify'>Contêm comandos DML para inserção de tuplas. Neste caso, foram inseridos tuplas a fins de teste</h5>

```sql
-- ----------------------------------------- << SCRIPT: Popula (DML) >> -----------------------------------------
--
-- Data Criacao ...........: 01/07/2023
-- Autor ..............: Gustavo Martins Ribeiro
-- Banco de Dados .........: MySQL
-- Base de Dados ..........: mercadoLivreDB
--
--
-- PROJETO => 01 Base de Dados
--         => 09 Tabelas
--
-- ---------------------------------------------------------

USE mercadoLivreDB;

INSERT INTO USUARIO(senha, email, nomeCompleto, apelido, dataCriacao) 
VALUES 
	('123GL', 'MileneLegal@gmail.com', 'Milene Professora Legal', 'Mimi', '2023-06-01'),
	('3APEX30', 'levyBolado@gmail.com', 'Levy Boladão Silva Guedes', 'Levyzim', '2023-07-01'),
	('Lucaslho', 'pimpolho_lucas@gmail.com', 'Lucas Limpolho Martins', 'lukinhas', '2023-07-01'),
	('Aaa@0007', 'gianMD@gmail.com', 'Gian Medeiros Rosa', 'Gianzão', '2023-07-01'),
	('Lalala99', 'lalala99pop@hotmail.com', "Cristovão Colombo", "Cristovim", '2023-07-01')
;

INSERT INTO COMPRADOR(idUsuario, nivel) 
VALUES 
	(1, '6')
;

INSERT INTO VENDEDOR(idUsuario, reputacao)
VALUES
	(2, 'prata'), 
	(3, 'ouro'), 
	(4, 'platina')
;

INSERT INTO TELEFONE(numTelefone, idUsuario)
VALUES
	(8835255063, 1),
	(6198115063, 1),
	(6135255063, 1),
	(8835256781, 1),
	(6122225063, 1),
	(8840028963, 1),
	(6437285413, 2),
	(8233522292, 3),
	(6222374421, 4),
	(8227403673, 5)
;

INSERT INTO ENDERECO (cep, bairro, rua, numero, complemento)
VALUES
	(78145732, 'São Simão', 'Rua José Benício da Silva', '23', 'Ao lado do Parque Shopping'),
    (58058420, 'Mangabeira', 'Rua Neusa de Sousa Salles', '51', null),
    (89260649, 'Jaraguá 99', 'Servidão 458', '505', null),
    (23520332, 'Santa Cruz', 'Beco São Jorge', '752', null),
    (29316028, 'Rua José Bento Rodrigues', 'Bela Vista', '5602', null)
;

INSERT INTO possui (idUsuario, cep)
VALUES
	(1, 78145732 ),
    (1, 58058420),
    (2, 58058420),
    (3, 89260649 ),
    (4, 23520332),
    (5, 29316028)
;

INSERT INTO PEDIDO (dataEmissao, idUsuario)
VALUES
	('2023-06-01', 1),
    ('2023-06-02', 1)
;

INSERT INTO TIPO_PRODUTO (nomeTipoProduto)
VALUES
	('Cosmético'),
    ('Eletro Doméstico'),
    ('Eletrônicos'),
    ('Alimentício'),
    ('Musculação')
;

INSERT INTO PRODUTO (nomeProduto, valor, descricao, idUsuario, idPedido, idTipoProduto)
VALUES
	('Batom Boladex Jequiti', 300, 'Batom Rosa da linha de verão da Jequiti', 2, 1, 1),
    ('Geladeira Brastemp', 4999, 'Geladeira Brastemp Automatica e Econômica', 3, 1, 2),
    ('Computador Pichau Gammer', 15000, 'Computador Pichau Gamer i9 11Gen, 64GB RAM DDR5, Placa Mãe Asus Rog Crosshair X670E Extreme', 4, 1, 3),
    ('Munhequeira Growth Up', 150, 'Munhequeira boladona resistente', 2, 2, 5)
;
```
<br> </br>

### Script Visao
<h5 align='justify'>Traz informações relevantes para análise. O script a baixo informa, respectivamente, o quantitativo de compradores, de vendedores, e o endereço físico de cada usuário. </h5>

```sql
-- ----------------------------------------- << SCRIPT: Consulta (DML) >> -----------------------------------------
--
-- Data Criacao ...........: 01/07/2023
-- Autor ..............: Gustavo Martins Ribeiro
-- Banco de Dados .........: MySQL
-- Base de Dados ..........: mercadoLivreDB
--
--
-- PROJETO => 01 Base de Dados
--         => 09 Tabelas
-- 		     => 03 Consultas 
--
-- ----------------------------------------------------------------------------------------------------------------

USE mercadoLivreDB;

-- Lista de todos os usuários compradores
SELECT 
	P.nomeCompleto
FROM 
	USUARIO P, COMPRADOR C
WHERE
	P.idUsuario = C.idUsuario
;

-- Lista de todos os usuários vendedores
SELECT 
	P.nomeCompleto
FROM
	USUARIO P, VENDEDOR V
WHERE
	P.idUsuario = V.idUsuario
;

-- Todos os endereços de cada usuário
SELECT 
	U.nomeCompleto,
    E.cep,
    E.bairro,
    E.rua,
    E.numero,
    E.complemento
FROM
	USUARIO U,
    ENDERECO E,
    possui P
WHERE
	U.idUsuario = P.idUsuario AND P.cep = E.cep
;
```
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
| 29/06/2023 |  0.0.1 |  Criação do documento de visão arquitetural dos dados | [Gustavo Martins Ribeiro](https://github.com/gustavomartins-github)| [Vinícius Assumpção](https://github.com/viniman27) |
| 03/07/2023 |  0.0.2 | Evolução do artefato | [Gustavo Martins Ribeiro](https://github.com/gustavomartins-github)|[Vinícius Assumpção](https://github.com/viniman27) |
