# Orientação a objetos com Java

### Pensar na orientação a objetos como um estrutura modular: <br> - vários modulos compoẽm o sistema e esses módulos interagem entre si;

## Classe e Objeto

### Uma Classe representa um conjunto de elementos do mesmo universo:

- Classe Livro: tem uma série de característica ( ou atributos) comuns a diversos livros; mas cada livro(Objeto) em si é único, ou seja, em seus valores individuais, são diferentes

- #### Dissemos, então, que uma classe, vai representar o conjunto de objetos que possuem determinadas características em comum

Ex.:

```
Classe Livro == conjunto de livros:
capa, título, número de páginas, ano de publicação, disponibilidade, preco...

- Objeto:'Livro dos espíritos' == 1 livro com o valor 'título' == 'Livro dos espíritos'
```

- #### O objeto 'Livro dos espíritos' **pertence** a classe Livro!
- #### **Ou ainda:** O objeto 'Livro dos espíritos' é uma **instância** da classe Livro --> objeto gerado a partir de determinada classe
- #### Uma variável que representa um objeto é conhecida como **variável de referência** (também chamada de **ponteiro**).

### As Classe possuem 2 características principais:

---

1. ### Atributos (Campos)

---

- São informações(ou uma estrutura de dados) da classe (cor do cabelo, sexo, altura, etc...) == são variáveis globais == persistem na memória enquanto o objeto, criado a partir da classe, existir
- Estrutura : visibilidade | tipo de dado | nome

Exs.:  
 private int idade;  
 private char sexo;

- #### OBS.: por padrão --> atributos devem ser **privados** --> somente a instância criada(objeto) deve ter acesso direto

2. ### Métodos

---

- São as AÇÕES que podem ser realizadas pelos objetos de cada classe (andar, correr, falar, pensar, etc...)
- Estrutura = visibilidade | tipo de retorno\* | nome (Parâmetros)
  \*\* se não retorna nada == void

- Começam com letra minúscula
  Ex.:
  getNome, setIdade...

- Obs1.Métodos que retornam boolean devem começar por 'is + Nome'
- Obs2.: Posso ter 2 métodos com o mesmo nome, porém devem ter( ou não ter) diferentes parâmetros ou tipo de retorno diferentes == sobrecarga de métodos
- Obs3. variáveis que são passadas como parâmetro só existem para o escopo do método

### 2.a) **Método Construtor** --> toda vez que instancio uma classe, o método construtor é chamado e sua AÇÃO é CONSTRUIR um objeto

-- Características:

1. Tem o mesmo nome da Classe
2. NÃO possui retorno
3. Os parâmetros que são recebidos devem atualizar os atributos gerais da classe qd instanciamos um Objeto --> essas serão as características individuais desse Objeto criado.<br> Porém, uma variável só tem escopo dentro do prórpio método (variável local), depois 'morre'(não persiste na memória).... então, uso o this. --> faz referência ao atribuito da classe e atualiza = assim o novo valor pode persistir na memória --> o valor passa de uma variável local para uma variável global
4. Sobrecarga de métodos construtores --> +1 forma de criar objetos a partir de uma classe

## OBS.:

- #### Quando não escrevemos nenhum construtor no código, o Java cria automaticamente um "construtor invisível" que não recebe parâmetros.<br>Por isso, para ATUALIZARMOS os atributos de um NOVO objeto criado a partir dessa classe, usaremos os métodos de acesso Setters.

---

### 2.b) **Método main** --> Método principal de execução geral da aplicação, de instanciação e de interação dos objetos entre si

- Semalhante ao script.ts(TypeScript | JS) e main.jsx(React)

### 2.c) **Método de acesso** --> Métodos para acessar os atributos de uma classe

#### - Atributos privados de uma Classe não podem ser acessados diretamente, SOMENTE através do seu objeto instanciado == serve para não descaracterizar a Classe

- principais:

1. Get() --> pega as informações do atributo e retorna --> possui return
2. Set() --> apenas atualiza(seta) as informações do atributo --> não possui return == 'retorna' void
3. Por padrão, nomeamos: CamelCase --> minuscúla: (tipo do método) + maiúscula: nome do atributo que estamos atualizando ou consultando('pegando')

Estrutura: visibilidade | retorno | setNomeDoAtributo, getNomeDoAtributo()

<br>

## Criando uma classe em Java

```java
public class NomeDaClasse {

    private int idade;
    private char sexo;

    public NomeDaClasse(){

    }

    - Métodos da classe

}

* entre {} temos um bloco de código
```

```java
new Pessoa(); // Objeto de Pessoa(intanciando Pessoa)

new Livro();
```

### Método toString():

---

#### O toString() é um método que pertence à classe Object (a classe "mãe" de todas as classes no Java).<br> Isso significa que toda e qualquer classe que você criar já nasce com esse método

- O objetivo dele é retornar uma representação do objeto em formato de String (texto).
- Para tornar o método útil, nós fazemos uma Sobrescrita (Overrtide). Nós dizemos ao Java: "Esqueça aquela descrição padrão de memória e use esta que eu vou escrever agora".
- Conseguimos ver rapidamente o estado dos atributos do objeto sem precisar de vários System.out.println separados para cada getter.<br>
- Em sistemas reais (backend), usamos o toString() para registrar o que aconteceu no sistema em arquivos de log.

<br>

## Método public static void main(Stringp[]args){}

### Ponto de entrada onde a aplicaçµão começa a ser executada

- "public": Acesso(visibilidade) do método é público e pode ser acessado de qualquer lugar do código.
- #### "static": Indica que o método é estático e pertence à classe em si, não a uma instância da classe. Isso significa que você NÃO PRECISA criar um OBJETO da classe para chamar o método 'main'.
- "void": retorno --> não retorna nenhum valor.
- "main": Nome do método.
- #### "String[] args": Este é o parâmetro que o método recebe. Ele é um array de Strings que permite que você passe argumentos de linha de comando para o programa. Por exemplo, se você executar o programa a partir do terminal usando "java NomeDoPrograma argumento1 argumento2", esses argumentos serão passados para o parâmetro "args"

<br>

## Instruções Condicionais

- Sintaxe do IF (observe que o primeiro não possui {})
- Caso o comando tenha apenas uma “linha”, então, não haverá necessidade de colocar bloco { ... }

```java
// 1

if(condicao)
  comando;

if(condicao){ //(colchetes aqui)
  comando;
}

// 2

if(condicao){ //(colchetes: 2 comandos)
  comando
  comando
  }
```

## Métodos equals() e compareTo()

- Métodos específicos para comparação de valores de objetos de classes diferentes em Java.

<br>

## Palavra-chave 'final'

### Em Java, a palavra-chave **'final'** é usada para indicar que um elemento não pode ser alterado. <br>Ela pode ser aplicada a variáveis, métodos e classes:

- Variáveis: quando uma variável é declarada como final, ela **NÃO PODE ser alterada** após sua inicialização. Ou seja, seu VALOR É FIXO é fixo durante toda a execução da aplicação.
  - Semelhante a 'const' em JS
- Métodos: quando um método é declarado como final, ele **NÃO PODE ser sobrescrito** por outras classes que herdam da classe que contém o método.
- Classes: quando uma classe é declarada como final, ela **NÃO PODE ser herdada** por outras classes.

```java
// constante inalterada
final double PI = 3.14159;

// método que não pode ser sobrescrito
public final void imprimir() {
System.out.println("Imprimindo...");
}

// classe que não pode ser herdada
public final class Pessoa {
// atributos, construtor, métodos
}

```
