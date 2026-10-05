2. Considerando as seguintes relações (tabelas) genéricas:

---

R = (A, B, C)
S = (C, D, E)

e o codigo SQL equivalente a cada uma das expressões da Álgebra Relacional

```sql
a) R |X| S
SELECT \* FROM R
INNER JOIN S ON R.C = S.C

ou
SELECT \* FROM R, S
WHERE R.C = S.C

b) piA, D (sigmaE = 3 (R |X| S))
SELECT A, D FROM R
INNER JOIN S ON R.C = S.C
WHERE S.E = 3d

ou
SELECT A, D FROM R, S
WHERE R.C = S.C AND S.E = 3

```

3. Tabelas PDF:

---

1. Liste os dados das lojas da região 2 que realizaram vendas num valor entre 11.000 e 55.000.

```sql
SELECT \* FROM Loja
WHERE Regiao_cod = 2
AND Vendas BETWEEN 11000 AND 55000

OU

SELECT \*
FROM Loja
WHERE Região_Cod = 2 AND Vendas >= 11000 AND Vendas <= 55000

2. Liste o nome e sobrenome dos empregados de lojas que estão localizadas na região ‘Sul’.

SELECT Emp_Nome, Emp_Sobrenome FROM Empregado E
INNER JOIN Loja L ON E.Loja_Cod = L.Loja_Cod
INNER JOIN Regiao R ON R.Regiao_cod = L.Regiao_cod
WHERE R.Descrição = "Sul";

Soluçao pdf:

SELECT E.Emp_Nome, E.Emp_Sobrenome
FROM Empregado E, Loja L, Região R
WHERE E.Loja_Cod = L.Loja_Cod AND L.Região_Cod = R.Região_Cod AND R.Descrição =
“Sul”

3. Liste o faturamento total das lojas por região. Ou seja, o resultado do SQL deverá gerar algo que liste cada região
   e o total de vendas das lojas da região.

SELECT R.Regiao_cod AS Codigo, R.Descricao AS Regiao, SUM(L.Vendas) AS Total
FROM Região R
INNER JOIN Loja L ON R.Regiao_cod = L.Regiao_cod
GROUP BY R.Regiao_cod, R.Descricao
ORDER BY Total DESC

Soluçao pdf:

SELECT R.Regiao_cod, SUM(L.Vendas) FROM Loja L, Região R
WHERE L.Região_Cod = R.Região_Cod
```
