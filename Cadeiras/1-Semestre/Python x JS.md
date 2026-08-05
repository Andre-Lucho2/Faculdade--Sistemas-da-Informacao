# Cheat Sheet: De JavaScript para Python

Equivalências de métodos e propriedades entre JavaScript e Python para manipulação de arrays (listas) entre outros.

---

## Tabela Comparativa de Métodos

| Operação                 | JavaScript               | Python                             |
| :----------------------- | :----------------------- | :--------------------------------- |
| **Comprimento**          | `arr.length`             | `len(lista)`                       |
| **Adicionar ao fim**     | `arr.push(v)`            | `lista.append(v)`                  |
| **Adicionar no início**  | `arr.unshift(v)`         | `lista.insert(0, v)`               |
| **Remover o último**     | `arr.pop()`              | `lista.pop()`                      |
| **Remover o primeiro**   | `arr.shift()`            | `lista.pop(0)`                     |
| **Transformar (Map)**    | `arr.map(x => x * 2)`    | `[x * 2 for x in lista]`           |
| **Filtrar (Filter)**     | `arr.filter(x => x > 5)` | `[x for x in lista if x > 5]`      |
| **Encontrar índice**     | `arr.indexOf(v)`         | `lista.index(v)`                   |
| **Inverter**             | `arr.reverse()`          | `lista.reverse()` ou `lista[::-1]` |
| **Juntar em String**     | `arr.join(' - ')`        | `' - '.join(map(str, lista))`      |
| **del item de um index** |                          | `del lista[posicao] `              |
| **Menor valor**          | `Math.min(numeros)`      | `min(arr)`                         |
| **Maior valor**          | `Math.max(numeros)`      | `max(arr)`                         |

## |

## Exemplo Prático: Map e Filter

```javascript
# JS
const numeros = [1, 2, 3, 4, 5];
const dobradosMaioresQue4 = numeros.map((n) => n * 2).filter((n) => n > 4);
```

```python
# Python
numeros = [1, 2, 3, 4, 5]
dobrados_maiores_que_4 = [n * 2 for n in numeros if n * 2 > 4]

# [expressão for item in iterável if condição]
```

## ATENÇÃO:

### Percorrendo listas em Python

---

```python
1.) Com for 'algo' in 'lista'

lista = range(10) --> lista de 0 até 9

2.) print(list(lista)) --> método Pythônico para percorer uma lista

3.) print([n for n in lista]) --> método 'list comprehension'

4.) print(list(map(lambda x: x, range(10)))) --> método com map **

** map deve ser utilizado para transformação dos itens iterados

```

## Resumo sobre qual método utilizar para iterar e filtrar listas em Python:

- for + if (Tradicional): Ótimo para quando você precisa de lógica complexa e vários prints no meio do caminho.

- List Comprehension (O favorito): A forma mais comum, rápida e legível para a maioria dos casos simples.

- filter + map (Funcional): Ideal para processar volumes gigantescos de dados ou quando você quer encadear várias operações (filtrar, depois transformar, depois somar).

### \*\* Ver exerc02.py e exerc03.py em semana 3 e 4 da cadeira - Laboratório 1

### Somando listas

```
a) com o método sum():

print(sum(range(11))) --> percorre e soma a lista de 0 até 10 == 55

b) com reduce()

from functools import reduce

print(reduce(lambda acc, num: acc + num, range(11), 0))
```

## Observação sobre métodos map e filter em Python:

No Python, o retorno de map() e filter()) chamamos isso de Iteradores.
Eles não ocupam espaço na memória criando uma lista nova até que você realmente precise dela (como ao dar um print ou converter para list).
Isso é o que permite ao Python processar arquivos de Gigabytes sem travar o computador!

````

## Diferenças de Sintaxe Críticas

### Acesso a Índices

- **JavaScript**: `lista[99]` retorna `undefined` se não existir.
- **Python**: `lista[99]` lança um `IndexError`.
- **Dica**: Use `lista[-1]` em Python para pegar o último elemento com facilidade.

### Loops (For)

Em Python, o `for` funciona como um _for...of_ do JS:

```python
# Python
for item in lista:
    print(item)

# JavaScript
for (const item of lista) {
    console.log(item);
}
````
o