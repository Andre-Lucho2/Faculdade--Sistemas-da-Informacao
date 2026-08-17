# Mapeamento Lógico

### - Entidades --> Tabelas
### - Atributos --> Colunas
### - Identificadores --> Chaves primárias (pk)

<br>

## Mapeamento de Realcionamentos
> **A) Relacionamentos 1:1 --> 1,1 | 1,1**  :

As 2 entidades passam a compor 1 única tabela

> **B) Relacionamentos 1:1 --> 1,1 | 0,1**  :

O Mapeamento pode ser feito de 2 maneiras  :

a) 1 única tabela (como acima);

b) 2 tabelas (a pk da 1º tabela passa a ser fk da 2º)

> **C) Relacionamentos 1:N --> 1,1 | 0,N**  :

No lado do 'N'(a pk da 1º tabela passa a ser fk da 2º)

> **D) Relacionamentos N:N --> 0,N | 0,N**  :

Gera uma **nova** tabela, com pelo menos, 2 fk's relacionados aos pk's das tabelas originais  

***Obs.*** Considerar a possibilidade de se criar uma chave-composta