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
-- 		   => 03 Consultas 
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