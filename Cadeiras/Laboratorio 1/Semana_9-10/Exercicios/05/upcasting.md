#### Questão referente as linhas 17 e 20 de Teste.java

```Java
Competicao comp2 = new Competicao("São Silvestre", new Data(01, 01, 2026));
Atleta atleta1 = new Corredor("Augusto", 100, 70.0, comp2);
System.out.println(atleta1.imprimeInfo());

Corredor poliAtleta1 = (Corredor) atleta1;
System.out.println(poliAtleta1.imprimeInfo());

```

- Entendo pq a linha 20 está ativando o método imprimeInfo() - downCasting pega o mais específico, que no caso é a classe Corredor....
  Mas, pq a linha 17 também está ativando esse método(da class Corredor) se tenho um Upcasting?

## Polimorfismo Dinâmico.

O motivo pelo qual a linha 17 ativa o método da classe Corredor, mesmo sendo um Upcasting, deve-se a uma regra de ouro: Em Java, quem decide qual método será executado é o objeto real na memória, e não o tipo da variável.

### 1. Tipo de Referência vs. Tipo de Objeto

Para entender isso, precisamos separar dois conceitos:

- Tipo de Referência (A "Etiqueta"): É o que você escreve à esquerda (Atleta atleta1). Ela define o que você pode "enxergar". Como a etiqueta é de Atleta, você só pode chamar métodos que existam na classe Atleta.

- Tipo do Objeto (A "Realidade"): É o que você cria com o new à direita (new Corredor(...)). Este é o objeto que realmente existe na memória do computador.

### 2. O Mecanismo: Late Binding (Ligação Tardia)

Quando você executa atleta1.imprimeInfo(), o Java faz o seguinte processo em milissegundos:

1. Verificação de Compilação: O Java olha para a variável atleta1. Ela é do tipo Atleta. Existe um método imprimeInfo() em Atleta? Sim. Então, o código é válido e compila.

2. Decisão em Tempo de Execução (Runtime): Na hora que o programa está rodando, a Máquina Virtual Java (JVM) olha para dentro da variável e pergunta: "Quem você é de verdade?".

3. A Descoberta: A variável responde: "Eu sou um Corredor".

4. A Execução: A JVM então procura: "O Corredor tem uma versão própria (sobrescrita) do método imprimeInfo()?". Como a resposta é sim, o Java executa a versão de Corredor.

### 3. Por que isso acontece no Upcasting?

No seu código:

```
Atleta atleta1 = new Corredor("Augusto", 100, 70, comp2);
```

- O Upcasting apenas "disfarça" o seu corredor de atleta para que ele possa ser tratado de forma genérica (por exemplo, em uma lista de vários atletas diferentes). Mas o objeto não deixa de ser um corredor.

### Analogia Didática:

- Imagine que você pede para todos os "Animais" em uma sala emitirem um som. Se houver um Cachorro disfarçado de Animal, quando ele abrir a boca, ele vai latir, e não fazer um "som genérico de animal". O comportamento (o método) está ligado à natureza dele (a classe filha), e não ao nome que damos a ele (a classe pai).

### Resumo do Comportamento:

- Na Linha 17 (Upcasting): O Java usa o método mais específico (Corredor) porque o objeto foi criado como Corredor.
- Na Linha 20 (Downcasting): Você apenas ganha o direito de acessar coisas que o Atleta não conhece (como o método getPeso()), mas o comportamento do imprimeInfo() permanece o mesmo, pois o objeto na memória ainda é o mesmo.
