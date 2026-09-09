SELECT * FROM Piloto;

SELECT num_licen, nome FROM Piloto;

---------------------------------------------

SELECT data From Voo;

-- DISTINCT --> Consulta dados selecionados não repetidos
-- ORDER BY --> ordenando
-- Padrão: Ascendente = ASC | Descendente = DESC

SELECT DISTINCT data FROM Voo
ORDER BY data ASC;

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

