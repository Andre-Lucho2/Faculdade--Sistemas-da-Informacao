# Mapeamento Lógico

## 1)  Entidades --> Tabelas
## 2)  Atributos --> Colunas
## 3)  Identificadores --> Chaves primárias (pk)

<br>

## 4) Mapeamento de Realcionamentos
### **A) Relacionamentos 1:1 --> 1,1 | 1,1**:
---

As 2 entidades passam a compor 1 única tabela --> os atributos da 2º tabela são incorporados na 1º

### **B) Relacionamentos 1:1 --> 1,1 | 0,1**:
---

O Mapeamento pode ser feito de 2 maneiras:

a) 1 única tabela (como acima);

b) Mantêm as 2 tabelas --> a pk da 1º tabela é incorporada como fk da 2º

### **C) Relacionamentos 1:N --> 1,1 | 0,N**:
---

Vou olhar para o lado do 'N'(1) (pego a pk da tabela com cardinalidade '1'(2) e incorporo um novo atributo nela(1) como uma fk da tabela(2)
Mesmo b) de (B) acima

### **D) Relacionamentos N:N --> 0,N | 0,N**:
---

Cria-se uma 3º tabela (do relacionamento) --> as pk's das tabelas originais serão pk's + fk's da nova tabela.

***Obs.*** Considerar a possibilidade de se criar uma chave-composta para que um mesmo dado não se repita
Ex. Aluno cursa Disciplina --> 
3 tabelas
Tabela EstáCursando:

* pk composta por: id_aluno, id_disciplina, data --> aqui, os 3 atributos não poderão se repetir em outro campo da tabela --> são únicos --> o aluno pode curar a mesma disciplina 2x em datas diferentes