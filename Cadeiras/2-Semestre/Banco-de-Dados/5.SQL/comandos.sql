--SQLite == Mesmo Comando

CREATE TABLE "Modelo" (
    "id_modelo" NUMBER,
    "nome" VARCHAR2(50) NOT NULL, -- max de 50 caracteres - dinâmico = grava no banco o que passar
    "cor" CHAR(10), --  max de 10 caracteres - não dinâmico = grava sempre a quant máx
    "num_lugares" NUMBER,
    "autonomia" NUMBER(6, 2), -- tamanho max = 6 digitos, sendo os 2 últimos depois da vírgula
    PRIMARY KEY ("id_modelo")
);

-- ou

CREATE TABLE Modelo (
    id_modelo NUMBER,
    nome VARCHAR2(50) NOT NULL, 
    cor CHAR(10) NOT NULL, 
    num_lugares NUMBER NOT NULL,
    autonomia NUMBER(6, 2) NOT NULL,
    PRIMARY KEY (id_modelo)
);

-- ou

CREATE TABLE "Modelo" (
    "id_modelo" NUMBER PRIMARY KEY,
    "nome" VARCHAR2(50) NOT NULL,
    "cor" CHAR(10),
    "num_lugares" NUMBER,
    "autonomia" NUMBER(6, 2)
);

CREATE TABLE Aviao (
    matricula VARCHAR(20) PRIMARY KEY,
    id_modelo NUMBER,
    CONSTRAINT fk_modelo_id_modelo FOREIGN KEY (id_modelo) REFERENCES Modelo (id_modelo)
    -- "CONSTRAINT"  --> inserindo uma FK e dando um nome qquer
);

----------------------------------------------------------
-- UPDATE SQLite
-- Inclusões
ALTER TABLE Aviao
ADD data_fabricacao DATE;

----------------------------------------------------------

--SQLite == Mesmo Comando
INSERT INTO Modelo 
VALUES (1,'Boeing 1000', 'Preto', 400, 8000);
INSERT INTO Modelo 
VALUES (2,'Airbus A300', 'Preto', 1500, 3500);

INSERT INTO Modelo VALUES (3, NULL, 'White', 150, 2500);

-- ou

INSERT INTO Modelo 
(id_modelo, nome, cor, num_lugares, autonomia) 
VALUES (4, 'Bombardier CR900', 'Blue', 90, 1500);
INSERT INTO Modelo 
(id_modelo, nome, cor, num_lugares, autonomia) 
VALUES (5, 'Bombardier CRW1205', 'Blue', 500, 9500);


INSERT INTO Aviao 
(matricula, id_modelo, data_fabricacao) 
VALUES ('ABC123', 1, TO_DATE('2022-02-01', 'yyyy-MM-DD'));
INSERT INTO Aviao 
(matricula, id_modelo, data_fabricacao) 
VALUES ('DEF456', 2, TO_DATE('2021-05-10', 'yyyy-MM-DD'));
INSERT INTO Aviao 
(matricula, id_modelo, data_fabricacao) 
VALUES ('GHI789', 3, TO_DATE('2021-07-15', 'yyyy-MM-DD'));
INSERT INTO Aviao 
(matricula, id_modelo, data_fabricacao) 
VALUES ('JKL012', 4, TO_DATE('2022-03-20', 'yyyy-MM-DD'));

INSERT INTO Aviao 
(matricula, id_modelo, data_fabricacao) 
VALUES ('KKK222', 5, TO_DATE('2022-03-20', 'yyyy-MM-DD'));

----------------------------------------------------------

UPDATE Modelo
SET cor = 'Black'
WHERE id_modelo = 1;

UPDATE Modelo
SET cor = 'Black'
WHERE id_modelo = 2;


UPDATE Aviao
SET matricula = 'KJW123'
WHERE matricula = 'KKK222';

----------------------------------------------------------

-- Alterar a estrutura (tipo de dado ou nome) da coluna - PostgreSQL
ALTER TABLE nome_tabela MODIFY COLUMN nome_coluna NOVO_TIPO;



----------------------------------------------------------
-- Para fazer um DELETE do (Aviao id_modelo = 1) temos que desvincular a informação dele da Table Modelo onde ele herda o id_modelo
UPDATE Aviao
SET id_modelo = 2
WHERE matricula = 'ABC123';

--SQLite == Mesmo Comando
DELETE FROM Modelo
WHERE id_modelo = 1;

DELETE FROM Aviao
WHERE matricula = 'ABC123';


----------------------------------------------------------

--SQLite == Mesmo Comando
SELECT * FROM Modelo;
SELECT * FROM Aviao;

----------------------------------------------------------

--SQLite == Mesmo Comando
DROP TABLE Aviao;
DROP TABLE Modelo;

----------------------------------------------------------

CREATE TABLE Piloto(
    num_licen NUMBER PRIMARY KEY,
    nome VARCHAR2(50) NOT NULL
);

INSERT INTO Piloto
VALUES (1, 'Joao Silva');
INSERT INTO Piloto
VALUES (2, 'Maria Santos');
INSERT INTO Piloto
VALUES (3, 'Pedro Costa');
INSERT INTO Piloto
VALUES (4, 'Ana Sousa');
INSERT INTO Piloto
VALUES (5, 'Carlos Pereira');

SELECT * FROM Piloto;

----------------------------------------------------------

CREATE TABLE Voo(
    num_voo VARCHAR(10) PRIMARY KEY,
    data DATE,
    hora CHAR(5),
    partida VARCHAR2(50) NOT NULL,
    destino VARCHAR2(50) NOT NULL,
    matricula VARCHAR(20),
    num_licen NUMBER,
    CONSTRAINT fk_aviao_matricula FOREIGN KEY (matricula) REFERENCES Aviao (matricula),
    CONSTRAINT fk_piloto_num_licen FOREIGN KEY (num_licen) REFERENCES Piloto(num_licen)
);

INSERT INTO Voo 
(num_voo, data, hora, partida, destino, matricula, num_licen) 
VALUES ('V123', TO_DATE('2026-07-15', 'yyyy-MM-DD'), '14:30', 'Porto Alegre', 'Curitiba', 'ABC123', 1);
INSERT INTO Voo 
(num_voo, data, hora, partida, destino, matricula, num_licen) 
VALUES ('V001', TO_DATE('2026-08-11', 'yyyy-MM-DD'), '10:30', 'Porto Alegre', 'Maringá', 'ABC123', 1);
INSERT INTO Voo 
(num_voo, data, hora, partida, destino, matricula, num_licen) 
VALUES ('V002', TO_DATE('2026-06-02', 'yyyy-MM-DD'), '09:10', 'Porto Alegre', 'Belo Horizonte', 'DEF456', 2);
INSERT INTO Voo 
(num_voo, data, hora, partida, destino, matricula, num_licen) 
VALUES ('V003', TO_DATE('2026-08-15', 'yyyy-MM-DD'), '14:00', 'Porto Alegre', 'Macapá', 'KJW123', 4);
INSERT INTO Voo 
(num_voo, data, hora, partida, destino, matricula, num_licen) 
VALUES ('V004', TO_DATE('2026-09-10', 'yyyy-MM-DD'), '08:05', 'Porto Alegre', 'São Paulo', 'GHI789', 5);


SELECT * FROM Voo;

----------------------------------------------------------

CREATE TABLE AptoPilotar(
    id_modelo NUMBER,
    num_licen NUMBER,
    PRIMARY KEY (id_modelo, num_licen),
    CONSTRAINT fk2_modelo_id_modelo FOREIGN KEY(id_modelo) REFERENCES Modelo(id_modelo),
    CONSTRAINT fk2_piloto_num_licen FOREIGN KEY(num_licen) REFERENCES Piloto(num_licen)
);


INSERT INTO AptoPilotar
VALUES (1, 1);
INSERT INTO AptoPilotar
VALUES (2, 1);
INSERT INTO AptoPilotar
VALUES (2, 2);
INSERT INTO AptoPilotar
VALUES (2, 5);
INSERT INTO AptoPilotar
VALUES (3, 5);
INSERT INTO AptoPilotar
VALUES (3, 3);


SELECT * FROM AptoPilotar;

----------------------------------------------------------

CREATE TABLE Dependente(
    id_dependente NUMBER PRIMARY KEY,
    nome VARCHAR2(50),
    data_nasc DATE,
    num_licen NUMBER,
    CONSTRAINT fk_dependente_num_licen FOREIGN KEY (num_licen) REFERENCES Piloto (num_licen)
);

INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (1, 'Maria Silva', TO_DATE('2005-01-15', 'YYYY-MM-DD'), 1);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (2, 'Pedro Santos', TO_DATE('2008-06-22', 'YYYY-MM-DD'), 5);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (3, 'Ana Oliveira', TO_DATE('2010-03-10', 'YYYY-MM-DD'), 3);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (4, 'JoÃ£o Oliveira', TO_DATE('2003-12-05', 'YYYY-MM-DD'), 1);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (5, 'Julia Santos', TO_DATE('2007-09-18', 'YYYY-MM-DD'), 2);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (6, 'Lucas Almeida', TO_DATE('2009-11-25', 'YYYY-MM-DD'), 3);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (7, 'Mariana Costa', TO_DATE('2006-08-12', 'YYYY-MM-DD'), 1);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (8, 'Rafael Pereira', TO_DATE('2009-05-23', 'YYYY-MM-DD'), 2);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (9, 'Camila Rodrigues', TO_DATE('2011-02-07', 'YYYY-MM-DD'), 3);
INSERT INTO Dependente 
(id_dependente, nome, data_nasc, num_licen) 
VALUES (10, 'Gabriel Silva', TO_DATE('2004-11-20', 'YYYY-MM-DD'), 4);
