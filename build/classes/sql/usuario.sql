/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  edson
 * Created: 12 de nov de 2023
 */

DROP TABLE Usuario;

CREATE TABLE Usuario (
    id serial PRIMARY KEY,
    nome_usuario VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    senha_hash VARCHAR(60) NOT NULL,
    tipo_usuario VARCHAR(20) NOT NULL,
    deletado BOOLEAN DEFAULT false,
    ativo BOOLEAN DEFAULT true,
    CHECK (tipo_usuario IN ('ADMINISTRADOR', 'COMUM'))
);

-- Exemplo de inserção de um usuário administrador
INSERT INTO Usuario (nome_usuario, nome, senha_hash, tipo_usuario)
VALUES ('admin', 'Administrador', '$2a$10$Y9Pe4Ja7zS.rgmC7oUqxCeelnhEOVDexEL71nTxEJkjO7HwcY1nLy', 'ADMINISTRADOR');

SELECT * FROM usuario;