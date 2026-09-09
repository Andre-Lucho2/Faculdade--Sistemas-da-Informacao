relax: c345902e37aa07d58987e32e1c946ff1

## Criar o comando em Álgebra Relacional
### a) Quais são os nomes dos dependentes do Piloto 'João Silva'.  
```sql
//Produto Cartesiano:

π Dependente.nome (σ Piloto.num_licen = Dependente.num_licen ∧ Piloto.nome = 'João Silva' (Piloto x Dependente))


//Natural join (⨝):

π Dependente.nome (σ Piloto.nome = 'João Silva' (Piloto ⨝ Piloto.num_licen = Dependente.num_licen Dependente))
```

- Natural join (⨝) --> Quando temos 1 atributo = nas 2 tabelas, ele junta elas;
qd temos + 1 --> temos que especificar por onde juntar --> 'Piloto.num_licen = Dependente.num_licen'

### b) Qual é o número de matrícula, nome, número de lugares e autonomia para cada um dos aviões disponíveis na CiaAerea. O id_modelo e a data de fabricação não devem ser exibidas.  

```sql
π matricula, nome, num_lugares, autonomia (σ Aviao.id_modelo = Modelo.id_modelo (Aviao x Modelo))


π matricula, nome, num_lugares, autonomia (Aviao ⨝ Modelo)
```

### c) Qual é o número de matrícula e data de fabricação dos aviões do modelo 'Embraer E195'.  

```sql
π matricula, data_fabricacao (σ Modelo.id_modelo = Aviao.id_modelo ∧ Modelo.nome = 'Embraer E195' (Modelo x Aviao))


//Natural join (⨝):
π matricula, data_fabricacao (σ Modelo.nome = 'Embraer E195' (Modelo ⨝ Aviao))

ou

π matricula, data_fabricacao (σ nome = 'Embraer E195' (Modelo ⨝ Aviao))
*nome é único no join das tabelas
```

### d) Qual é o nome do piloto, número do voo, destino e matrícula do avião dos voos que foram realizado antes das 11:00

```sql
π nome, num_voo, destino, matricula, hora (σ hora < '11:00' (Voo ⨝ Piloto))
```

### e) Quais são os nomes dos pilotos e o destino dos seus voos, mostre o nome do piloto mesmo que ele tenha pilotado nenhum voo.  

```sql
π nome, destino (Piloto ⟕ Voo)
```

- Left Join (⟕) --> Matém o valor da esquerda, mesmo que seu par seja nulo

### f) Quais são os nomes dos pilotos que não realizaram nenhum voo?  

```sql
π nome (σ partida = null (Piloto ⟕ Voo))

ou

π nome (Piloto) - π nome (Piloto ⟖ Voo)

pq ⟖ ?:

Relação Voo (0,n) - Piloto (1,1) - se tenho voo, tenho piloto (obrigatório)

```

### g) Qual é o nome do Piloto que pilotou o voo na data '2023-07-22', as '14:45' de 'João Pessoa' para 'Maceió'?  

```sql
π nome (σ Voo.data_partida = '2023-07-22' ∧ Voo.hora = '14:45'∧ Voo.partida = 'João Pessoa'∧ Voo.destino = 'Maceió' (Piloto ⨝ Voo))
```

