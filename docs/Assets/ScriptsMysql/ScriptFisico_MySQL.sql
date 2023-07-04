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