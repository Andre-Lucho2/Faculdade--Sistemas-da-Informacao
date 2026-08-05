## Exercício 11.

### Seja x uma variável inteira. Pesquise e responda: qual a diferença entre a utilização de x++ e ++x no código? Exemplifique sua resposta.

### a) x++ == Operador Pós-fixado:

Ele primeiro entrega o valor atual para a operação e só depois se incrementa.
Regra: Use primeiro, mude depois.

```java
Ex.
int x = 5;
int y = x++; // y recebe 5, e DEPOIS x passa a ser 6

```

### b) ++x == Operador Pré-fixado:

Ele incrementa o valor da variável primeiro e só depois entrega o resultado
para quem pediu.

```java
Ex.:
int x = 5;
int y = ++x; // x passa a ser 6, e DEPOIS y recebe 6

Ex2.
int a = 5;
int b = 5;

System.out.println(a) // 5

int resultado = (a++) + (++b);

System.out.println(resultado) // 11

System.out.println(a) // 6 -- somente ao final da execução
System.out.println(b) // 6 -- antes da execução

```
