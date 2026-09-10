SELECT * FROM Piloto;

SELECT num_licen, nome FROM Piloto;

---------------------------------------------

SELECT data From Voo;

-- DISTINCT --> Consulta dados selecionados não repetidos
-- ORDER BY --> ordenando
-- Padrão: Ascendente = ASC | Descendente = DESC

SELECT DISTINCT data FROM Voo
ORDER BY data ASC;

-- FETCH FIRST "X" ROWS ONLY --> retornando uma qt limitada de tuplas
SELECT * FROM MODELO
ORDER BY autonomia DESC
FETCH FIRST 3 ROWS ONLY

---------------------------------------------

SELECT * FROM Aviao
WHERE matricula = 'MNOP123';

-- OR - geralmente a consulta é feito com o mesmo domínio
SELECT * FROM Aviao
WHERE   id_modelo = 2 OR 
        id_modelo = 3;

-- IN --> outra forma de consulta:
SELECT * FROM Aviao
WHERE id_modelo IN (2, 3);

SELECT * FROM Aviao
WHERE id_modelo BETWEEN 2 AND 3;

-- que NÃO estejam no intervalo
SELECT * FROM Aviao
WHERE id_modelo NOT IN (2, 3);

------------------------------------------------------------------
-- Consulta da domínios diferentes ao mesmo tempo:
SELECT * FROM VOO
WHERE   num_licen = 123456 AND
        (partida = 'Porto Alegre' OR
        partida = 'SÃ£o Paulo');

-- OBS: cuidar os parênteses --> OR --> ele irá informar qquer lado que for TRUE!

-- ou

SELECT * FROM VOO
WHERE   num_licen = 123456 AND
        partida IN ('Porto Alegre','SÃ£o Paulo');


-- consulta qquer partida começada com Porto
SELECT * FROM VOO
WHERE partida LIKE 'Porto%';


-- consulta qquer partida onde não sei as 2 primeiras letras e a terceira é um 'r'
SELECT * FROM VOO
WHERE partida LIKE '__r%';


SELECT * FROM VOO
WHERE partida NOT LIKE '__r%';


--------------------------------------------------
--------------------------------------------------

-- FUNÇÕES
------------

-- Contagem total de tuplas
SELECT COUNT (*) FROM Aviao;

SELECT COUNT (*) FROM Aviao
WHERE id_modelo = 1;

--------------------------------------------------
-- Maior valor de um determ domínio
SELECT Max (autonomia) FROM Modelo;

-- Menor valor de um determ domínio
SELECT Min (autonomia) FROM Modelo;

--------------------------------------------------
-- Soma de valores
SELECT SUM(num_lugares) AS "Soma" From Modelo;
--AS " " --> opcional

-- Média de valores
SELECT AVG(num_lugares) AS "Média Lugares" FROM Modelo;

SELECT AVG(num_lugares) FROM Modelo;

--------------------------------------------------
--GROUP
-------

SELECT COUNT(*) FROM Voo
WHERE partida = 'SÃ£o Paulo';

-- ou

-- não esquecer o dominio logo após SELECT para mostrar a coluna consultada
SELECT partida, COUNT(*) AS Quantidade FROM Voo
GROUP BY partida
--AS " " --> opcional

-- Com limitador (destino):
-- Agrupando por partidas, mas APENAS os com destino = São Paulo
SELECT partida, COUNT(*) AS Quantidade FROM Voo
WHERE destino = 'SÃ£o Paulo' 
GROUP BY partida;

-- Agrupando por partidas, mas APENAS os voos partindo de POA com destino a São Paulo
SELECT partida, COUNT(*) AS Quantidade FROM Voo
WHERE partida = 'Porto Alegre' AND destino = 'SÃ£o Paulo'
GROUP BY partida;


--WHERE analisa linha a linha de toda a tabela--> reduz performance
-- HAVING --> faz a analise na consulta já filtrada pelo GROUP
SELECT partida, COUNT(*) AS Quantidade FROM Voo
GROUP BY partida HAVING COUNT(*) > 1


--Qual é o destino q mais possui voos?
SELECT destino, COUNT(*) FROM Voo
GROUP BY destino
ORDER BY COUNT(*) DESC
FETCH FIRST 1 ROWS ONLY;

--------------------------------------------------

-- Consultas em +1 tabela
---------------------------
-- OBS. --> SEMPRE: a pk de uma tabela estará como fk da outra!


-- Qual é o nome do piloto que possui o maior número de dependentes?

SELECT * FROM Piloto
SELECT * FROM Dependete

-- Passo 1:
-- num_licen com > qta de dependentes:
SELECT num_licen AS Qtde FROM Dependente
GROUP BY num_licen
ORDER BY COUNT(*) DESC
FETCH FIRST 1 ROWS ONLY;


-- Passo 2:
-- Ligação entre as tabelas
SELECT nome FROM Piloto
WHERE num_licen = (
        SELECT num_licen AS Qtde FROM Dependente
        GROUP BY num_licen
        ORDER BY COUNT(*) DESC
        FETCH FIRST 1 ROWS ONLY
);

-- ou

SELECT nome FROM Piloto
WHERE num_licen IN (
        SELECT num_licen AS Qtde FROM Dependente
        GROUP BY num_licen
        ORDER BY COUNT(*) DESC
        FETCH FIRST 1 ROWS ONLY
);


-----------------------------------------------------------------------------------------------

-- 1) Liste todos os aviões indicando sua matricula, nome num_lugares e autonomia

-- Algebra Rel:
π matricula, nome, num_lugares, autonomia (σ Aviao.id_modelo = Modelo.id_modelo (Aviao x Modelo))
π matricula, nome, num_lugares, autonomia (Aviao ⨝ Modelo)

-- SQL
SELECT * FROM Aviao;
    SELECT * FROM Modelo;

SELECT Aviao.MATRICULA, Modelo.NOME, Modelo.NUM_LUGARES, Modelo.AUTONOMIA FROM Aviao, Modelo
WHERE Aviao.id_modelo = Modelo.id_modelo;


-- Com alais
SELECT a.MATRICULA, b.NOME, b.NUM_LUGARES, b.AUTONOMIA FROM Aviao a, Modelo b
WHERE a.id_modelo = b.id_modelo;

-----------------------------------------------------------------------------------------------

-- 2) Liste todos os aviões indicando sua matricula, nome num_lugares e autonomia, apenas para aviões que possuam + 150 lugares. Mostre os modelos c maior num_lugares primeiro
-- Algebra Rel:

π matricula, nome, num_lugares, autonomia (σ a.num_lugares > 150 (Aviao ⨝ Modelo))


-- SQL
SELECT a.MATRICULA, m.NOME, m.NUM_LUGARES, m.AUTONOMIA FROM Aviao a, Modelo m
WHERE a.id_modelo = m.id_modelo AND m.num_lugares > 150
ORDER BY m.num_lugares DESC;


-- Com INNER JOIN
SELECT a.MATRICULA, m.NOME, m.NUM_LUGARES, m.AUTONOMIA FROM Aviao a 
INNER JOIN Modelo m ON a.id_modelo = m.id_modelo
WHERE m.num_lugares > 150
ORDER BY m.num_lugares DESC;

-----------------------------------------------------------------------------------------------

-- 3) Exiba o nome dos modelos que não possuem aviões

SELECT nome FROM Modelo
WHERE id_modelo NOT IN (
        SELECT id_modelo FROM Aviao
);

-- ou

-- Com LEFT JOIN (⟕)
-- ------------------
-- Exibe o que tem nas 2, exibindo o lado esq mesmo que SEM correspondência com o dir
-- INNER JOIN junta e exclui os sem correspondência

Select m.nome FROM Modelo m 
LEFT JOIN Aviao a ON m.id_modelo = a.id_modelo
WHERE a.id_modelo IS NULL;

-----------------------------------------------------------------------------------------------

-- 4) Exiba uma lista de com o nome de cada piloto e a quant de voos em que ele está alocado

SELECT p.nome, COUNT(*) FROM Piloto p
INNER JOIN Voo v ON p.num_licen = v.num_licen
GROUP BY p.nome;


-----------------------------------------------------------------------------------------------

-- 5) Qual é o nome do piloto que possui mais dependentes?
-- b. Qtos dependentes ele tem (mostrar apenas o num dependentes)?

SELECT nome FROM Piloto
WHERE num_licen IN (
        SELECT num_licen AS Qtde FROM Dependente
        GROUP BY num_licen
        ORDER BY COUNT(*) DESC
        FETCH FIRST 1 ROWS ONLY
);

-- a)
SELECT p.nome FROM Piloto p
INNER JOIN Dependente d ON p.num_licen = d.num_licen
GROUP BY p.nome
ORDER BY COUNT(*) DESC
FETCH FIRST 1 ROWS ONLY;

-- b)

SELECT COUNT(*) AS Quant FROM Piloto p
INNER JOIN Dependente d ON p.num_licen = d.num_licen
GROUP BY p.num_licen
ORDER BY Quant DESC
FETCH FIRST 1 ROWS ONLY;