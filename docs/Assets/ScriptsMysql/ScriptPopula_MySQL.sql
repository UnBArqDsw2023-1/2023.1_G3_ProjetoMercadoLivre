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