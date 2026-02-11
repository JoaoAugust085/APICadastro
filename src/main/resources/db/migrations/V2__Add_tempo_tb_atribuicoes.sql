-- V2: Migrations para adicionar a coluna de tempo na tabela de atribuicoes

ALTER TABLE tb_atribuicoes
ADD COLUMN tempo int;