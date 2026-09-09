-- Querys:

CREATE TABLE Modelo (
    id_modelo NUMBER,
    nome VARCHAR2(100),
    num_lugares NUMBER,
    autonomia NUMBER,
    PRIMARY KEY (id_modelo)
);

INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (1, 'Boeing 747', 400, 8000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (2, 'Airbus A320', 150, 3500);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (3, 'Embraer E195', 120, 2500);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (4, 'Bombardier CRJ900', 90, 2000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (5, 'Boeing 787', 250, 6000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (6, 'Airbus A380', 500, 9000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (7, 'Embraer E190', 110, 1800);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (8, 'Cessna 172', 4, 600);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (9, 'Bombardier Global 6000', 18, 8000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (10, 'Boeing 737', 180, 3500);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (11, 'Airbus A330', 300, 5000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (12, 'Embraer E175', 88, 2500);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (13, 'Bombardier CRJ700', 70, 1500);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (14, 'Boeing 777', 350, 7000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (15, 'Airbus A340', 380, 8000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (16, 'Embraer E170', 78, 2000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (17, 'Cessna Citation X', 8, 2000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (18, 'Bombardier Challenger 300', 9, 3500);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (19, 'Boeing 757', 200, 4000);
INSERT INTO Modelo (id_modelo, nome, num_lugares, autonomia) VALUES (20, 'Airbus A350', 300, 6500);


CREATE TABLE Aviao (
    matricula VARCHAR2(20),
    id_modelo NUMBER,
    data_fabricacao DATE,
    PRIMARY KEY (matricula),
    CONSTRAINT fk_id_modelo FOREIGN KEY (id_modelo) REFERENCES MODELO (id_modelo)
);

INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('ABCD123', 1, TO_DATE('2022-01-01', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('EFGH456', 2, TO_DATE('2021-05-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('IJKL789', 3, TO_DATE('2021-07-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('MNOP123', 4, TO_DATE('2022-03-20', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('QRST456', 5, TO_DATE('2021-12-31', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('UVWX789', 6, TO_DATE('2023-01-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('Y7AB123', 7, TO_DATE('2022-06-25', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('CD3F456', 8, TO_DATE('2023-02-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('GHI2789', 9, TO_DATE('2022-09-05', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('KL1N123', 10, TO_DATE('2023-04-01', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('A0C123', 1, TO_DATE('2021-01-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('DE6456', 2, TO_DATE('2020-05-22', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('2HI789', 3, TO_DATE('2022-03-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('KBCD123', 1, TO_DATE('2022-01-01', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('EF4H456', 2, TO_DATE('2021-05-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('I3KL789', 3, TO_DATE('2023-07-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('M7OP123', 4, TO_DATE('2022-09-20', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('TRST456', 5, TO_DATE('2023-03-05', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('UTWX789', 6, TO_DATE('2022-06-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('Y3AB123', 7, TO_DATE('2021-08-25', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('2DEF456', 8, TO_DATE('2023-02-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('GU9J789', 9, TO_DATE('2022-04-05', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('G4MN123', 10, TO_DATE('2023-06-20', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('OPOR456', 11, TO_DATE('2022-03-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('SSUV789', 12, TO_DATE('2021-07-25', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('WXXZ123', 13, TO_DATE('2023-01-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('1224ABC', 14, TO_DATE('2022-08-05', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('5778DEF', 15, TO_DATE('2023-05-20', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('909BGHI', 16, TO_DATE('2022-02-15', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('JJLM123', 3, TO_DATE('2021-06-25', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('NNPQ456', 18, TO_DATE('2023-04-10', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('RSSU789', 19, TO_DATE('2022-07-05', 'YYYY-MM-DD'));
INSERT INTO Aviao (matricula, id_modelo, data_fabricacao) VALUES ('VWWY123', 20, TO_DATE('2021-09-20', 'YYYY-MM-DD'));

--------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Piloto (
    num_licen VARCHAR2(20),
    nome VARCHAR2(50),
    PRIMARY KEY (num_licen)
);

INSERT INTO Piloto (num_licen, nome) VALUES ('123456', 'JoÃ£o Silva');
INSERT INTO Piloto (num_licen, nome) VALUES ('654321', 'Maria Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('987654', 'Pedro Costa');
INSERT INTO Piloto (num_licen, nome) VALUES ('456789', 'Ana Souza');
INSERT INTO Piloto (num_licen, nome) VALUES ('789456', 'Carlos Pereira');
INSERT INTO Piloto (num_licen, nome) VALUES ('321654', 'Luisa Oliveira');
INSERT INTO Piloto (num_licen, nome) VALUES ('654987', 'Felipe Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('987123', 'Mariana Silva');
INSERT INTO Piloto (num_licen, nome) VALUES ('159357', 'Rafaela Almeida');
INSERT INTO Piloto (num_licen, nome) VALUES ('753159', 'Gustavo Lima');
INSERT INTO Piloto (num_licen, nome) VALUES ('852964', 'Carolina Fernandes');
INSERT INTO Piloto (num_licen, nome) VALUES ('369852', 'Bruno Rodrigues');
INSERT INTO Piloto (num_licen, nome) VALUES ('951753', 'Juliana Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('456123', 'Fernando Silva');
INSERT INTO Piloto (num_licen, nome) VALUES ('789321', 'Larissa Mendes');
INSERT INTO Piloto (num_licen, nome) VALUES ('321789', 'Marcelo Castro');
INSERT INTO Piloto (num_licen, nome) VALUES ('654951', 'Patricia Sousa');
INSERT INTO Piloto (num_licen, nome) VALUES ('987456', 'Rodrigo Alves');
INSERT INTO Piloto (num_licen, nome) VALUES ('159753', 'Sandra Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('753951', 'Vitoria Ribeiro');
INSERT INTO Piloto (num_licen, nome) VALUES ('147258', 'Ricardo Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('258369', 'Camila Oliveira');
INSERT INTO Piloto (num_licen, nome) VALUES ('369147', 'Lucas Pereira');
INSERT INTO Piloto (num_licen, nome) VALUES ('471258', 'Carolina Mendes');
INSERT INTO Piloto (num_licen, nome) VALUES ('582369', 'Miguel Silva');
INSERT INTO Piloto (num_licen, nome) VALUES ('693147', 'Lara Rodrigues');
INSERT INTO Piloto (num_licen, nome) VALUES ('714258', 'Bruno Almeida');
INSERT INTO Piloto (num_licen, nome) VALUES ('825369', 'Alice Costa');
INSERT INTO Piloto (num_licen, nome) VALUES ('936147', 'Gustavo Ribeiro');
INSERT INTO Piloto (num_licen, nome) VALUES ('147963', 'Isabela Fernandes');
INSERT INTO Piloto (num_licen, nome) VALUES ('258741', 'Daniel Souza');
INSERT INTO Piloto (num_licen, nome) VALUES ('769852', 'Amanda Lima');
INSERT INTO Piloto (num_licen, nome) VALUES ('471963', 'Vitor Alves');
INSERT INTO Piloto (num_licen, nome) VALUES ('582741', 'Leticia Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('693852', 'Raul Mendes');
INSERT INTO Piloto (num_licen, nome) VALUES ('714963', 'Natasha Oliveira');
INSERT INTO Piloto (num_licen, nome) VALUES ('825741', 'Henrique Costa');
INSERT INTO Piloto (num_licen, nome) VALUES ('936852', 'Mariana Ribeiro');
INSERT INTO Piloto (num_licen, nome) VALUES ('147369', 'Rafaela Alves');
INSERT INTO Piloto (num_licen, nome) VALUES ('258147', 'Guilherme Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('369258', 'Sofia Oliveira');
INSERT INTO Piloto (num_licen, nome) VALUES ('471369', 'Leonardo Pereira');
INSERT INTO Piloto (num_licen, nome) VALUES ('582147', 'Laura Mendes');
INSERT INTO Piloto (num_licen, nome) VALUES ('693258', 'Pedro Almeida');
INSERT INTO Piloto (num_licen, nome) VALUES ('714369', 'Fernanda Costa');
INSERT INTO Piloto (num_licen, nome) VALUES ('825147', 'Ricardo Ribeiro');
INSERT INTO Piloto (num_licen, nome) VALUES ('936258', 'Mariana Alves');
INSERT INTO Piloto (num_licen, nome) VALUES ('147852', 'Rodrigo Santos');
INSERT INTO Piloto (num_licen, nome) VALUES ('258963', 'Carolina Oliveira');
INSERT INTO Piloto (num_licen, nome) VALUES ('369741', 'Lucas Pereira');

--------------------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Voo (
    num_voo VARCHAR2(20),
    data DATE,
    hora VARCHAR2(5),
    partida VARCHAR2(100),
    destino VARCHAR2(100),
    matricula VARCHAR2(20),
    num_licen VARCHAR2(20),
    PRIMARY KEY (num_voo),
    CONSTRAINT fk_voo_num_licen FOREIGN KEY (num_licen) REFERENCES Piloto(num_licen),
    CONSTRAINT fk_voo_matricula FOREIGN KEY (matricula) REFERENCES Aviao(matricula)
);

INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V123', TO_DATE('2023-07-14', 'YYYY-MM-DD'), '14:30', 'Porto Alegre', 'SÃ£o Paulo', 'ABCD123', '123456');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V001', TO_DATE('2023-07-14', 'YYYY-MM-DD'), '09:00', 'Porto Alegre', 'SÃ£o Paulo', 'ABCD123', '123456');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V002', TO_DATE('2023-07-15', 'YYYY-MM-DD'), '12:30', 'SÃ£o Paulo', 'Rio de Janeiro', 'CD3F456', '753159');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V003', TO_DATE('2023-07-16', 'YYYY-MM-DD'), '15:45', 'Rio de Janeiro', 'BrasÃ­lia', 'GHI2789', '321789');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V004', TO_DATE('2023-07-17', 'YYYY-MM-DD'), '08:30', 'BrasÃ­lia', 'Salvador', 'JJLM123', '789456');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V005', TO_DATE('2023-07-18', 'YYYY-MM-DD'), '10:45', 'Salvador', 'Recife', 'NNPQ456', '321654');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V006', TO_DATE('2023-07-19', 'YYYY-MM-DD'), '14:20', 'Recife', 'Fortaleza', 'RSSU789', '159357');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V007', TO_DATE('2023-07-20', 'YYYY-MM-DD'), '09:15', 'Fortaleza', 'Natal', 'WXXZ123', '369852');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V008', TO_DATE('2023-07-21', 'YYYY-MM-DD'), '11:30', 'Natal', 'JoÃ£o Pessoa', 'OPOR456', '987456');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V009', TO_DATE('2023-07-22', 'YYYY-MM-DD'), '14:45', 'JoÃ£o Pessoa', 'MaceiÃ³', 'SSUV789', '159753');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V010', TO_DATE('2023-07-23', 'YYYY-MM-DD'), '08:30', 'MaceiÃ³', 'Aracaju', 'KBCD123', '123456');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V011', TO_DATE('2023-07-24', 'YYYY-MM-DD'), '10:45', 'Aracaju', 'Salvador', 'CD3F456', '123456');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V012', TO_DATE('2023-07-25', 'YYYY-MM-DD'), '13:20', 'Salvador', 'VitÃ³ria', 'IJKL789', '456123');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V013', TO_DATE('2023-07-26', 'YYYY-MM-DD'), '09:15', 'VitÃ³ria', 'Belo Horizonte', 'G4MN123', '654987');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V014', TO_DATE('2023-07-27', 'YYYY-MM-DD'), '11:30', 'Belo Horizonte', 'SÃ£o Paulo', 'EF4H456', '456789');
INSERT INTO Voo (num_voo, data, hora, partida, destino, matricula, num_licen)
VALUES ('V015', TO_DATE('2023-07-28', 'YYYY-MM-DD'), '14:45', 'SÃ£o Paulo', 'Curitiba', 'GU9J789', '123456');


-----------------------------------------------------------------------------------------------------------------------

CREATE TABLE AptoPilotar (
    id_modelo NUMBER,
    num_licen VARCHAR2(20),
    PRIMARY KEY (id_modelo, num_licen),
    CONSTRAINT fk_apto_id_modelo FOREIGN KEY (id_modelo) REFERENCES Modelo(id_modelo),
    CONSTRAINT fk_apto_num_licen FOREIGN KEY (num_licen) REFERENCES Piloto(num_licen)
);

INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (1, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (2, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (3, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (4, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (5, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (6, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (7, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (8, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (9, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (10, '123456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (1, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (2, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (3, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (4, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (5, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (6, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (7, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (8, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (9, '654321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (3, '987654');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (4, '456789');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (5, '789456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (6, '321654');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (7, '654987');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (8, '987123');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (9, '159357');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (10, '753159');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (11, '852964');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (12, '369852');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (13, '951753');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (14, '456123');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (16, '789321');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (16, '321789');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (17, '654951');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (18, '987456');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (19, '159753');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (20, '753951');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (11, '258741');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (12, '258741');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (13, '471963');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (14, '471963');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (15, '147369');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (16, '147369');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (17, '147369');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (18, '369258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (19, '471369');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (20, '582147');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (11, '693258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (2, '693258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (3, '693258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (4, '693258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (5, '825147');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (6, '825147');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (7, '825147');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (8, '936258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (9, '936258');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (10, '147852');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (11, '258963');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (12, '369741');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (13, '369741');
INSERT INTO AptoPilotar (id_modelo, num_licen) VALUES (14, '369741');

------------------------------------------------------------------------------------------------

CREATE TABLE Dependente (
    id_dependente NUMBER,
    nome VARCHAR2(50),
    data_nasc DATE,
    num_licen VARCHAR2(20),
    PRIMARY KEY (id_dependente),
    CONSTRAINT fk_dependente_num_licen FOREIGN KEY (num_licen) REFERENCES Piloto (num_licen)
);

INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (1, 'Maria Silva', TO_DATE('2005-01-15', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (2, 'Pedro Santos', TO_DATE('2008-06-22', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (3, 'Ana Oliveira', TO_DATE('2010-03-10', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (4, 'JoÃ£o Oliveira', TO_DATE('2003-12-05', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (5, 'Julia Santos', TO_DATE('2007-09-18', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (6, 'Lucas Almeida', TO_DATE('2009-11-25', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (7, 'Mariana Costa', TO_DATE('2006-08-12', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (8, 'Rafael Pereira', TO_DATE('2009-05-23', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (9, 'Camila Rodrigues', TO_DATE('2011-02-07', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (10, 'Gabriel Silva', TO_DATE('2004-11-20', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (11, 'Isabela Santos', TO_DATE('2007-07-15', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (12, 'Guilherme Oliveira', TO_DATE('2010-02-10', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (13, 'Laura Costa', TO_DATE('2005-09-03', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (14, 'Thiago Pereira', TO_DATE('2008-04-16', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (15, 'Amanda Rodrigues', TO_DATE('2011-01-29', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (16, 'Mateus Silva', TO_DATE('2006-12-10', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (17, 'Sophia Santos', TO_DATE('2009-07-25', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (18, 'Enzo Oliveira', TO_DATE('2012-02-17', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (19, 'Fernanda Costa', TO_DATE('2007-10-15', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (20, 'Leonardo Pereira', TO_DATE('2010-05-20', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (21, 'Carolina Rodrigues', TO_DATE('2013-02-25', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (22, 'Gustavo Silva', TO_DATE('2006-11-08', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (23, 'Sophia Santos', TO_DATE('2009-06-12', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (24, 'Mateus Oliveira', TO_DATE('2012-03-25', 'YYYY-MM-DD'), '987654');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (25, 'Isabella Costa', TO_DATE('2007-09-03', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (26, 'Enzo Pereira', TO_DATE('2010-04-16', 'YYYY-MM-DD'), '654321');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (27, 'Sophie Rodrigues', TO_DATE('2013-01-29', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (28, 'Antonio Silva', TO_DATE('2006-12-10', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (29, 'Valentina Santos', TO_DATE('2009-07-25', 'YYYY-MM-DD'), '123456');
INSERT INTO Dependente (id_dependente, nome, data_nasc, num_licen) VALUES (30, 'Francisco Oliveira', TO_DATE('2012-04-05', 'YYYY-MM-DD'), '123456');

--------------------------------------------------------------------------------------------------------------
