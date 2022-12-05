CREATE TABLE medicos
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    nome          VARCHAR(100)          NULL,
    email         VARCHAR(100)          NULL UNIQUE,
    crm           VARCHAR(6)            NULL UNIQUE,
    especialidade INT                   NULL,
    logradouro    VARCHAR(100)          NULL,
    bairro        VARCHAR(100)          NULL,
    cep           VARCHAR(9)            NULL,
    cidade        VARCHAR(100)          NULL,
    uf            VARCHAR(2)            NULL,
    numero        VARCHAR(100)          NULL,
    complemento   VARCHAR(100)          NULL,
    PRIMARY KEY (id)
);
