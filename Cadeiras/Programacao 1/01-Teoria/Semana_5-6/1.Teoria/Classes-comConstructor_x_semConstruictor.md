# Estratégias de Criação de Objetos em Java

## 1. Construtor Descritivo vs. Construtor Padrão

No desenvolvimento Java profissional, a forma como instanciamos uma classe define a **segurança** e a **flexibilidade** da aplicação.

### A. O Construtor Descritivo (`ClasseUm`)

O construtor que recebe parâmetros funciona como um **"Contrato de Existência"**.

- **O que ele diz:** "Para que este objeto exista, eu obrigatoriamente preciso desses dados agora."
- **Vantagens:** \* **Integridade:** O objeto nunca nasce "vazio" ou incompleto, evitando erros de `NullPointerException` mais adiante.
- **Imutabilidade:** Permite o uso de campos `final`. Uma vez definido no nascimento do objeto, o valor não precisa mudar.
- **Exemplo Real:** Uma `ContaBancaria`. Você não quer que o sistema crie uma conta sem um número e um titular definidos.

### B. O Construtor Padrão (`ClasseDois`)

Utiliza o que chamamos de **JavaBean Pattern**. O objeto nasce "vazio" e é preenchido aos poucos via métodos `set`.

- **O que ele diz:** "Eu existo primeiro, e você me fornece as informações conforme elas estiverem disponíveis."
- **Vantagens:** \* **Flexibilidade:** Fácil de instanciar sem ter todos os dados em mãos no início.
- **Compatibilidade com Frameworks:** Bibliotecas como **Hibernate/JPA** (banco de dados) e **Jackson** (JSON) exigem um construtor vazio para "montar" o objeto automaticamente.
- **Exemplo Real:** Formulários web onde o objeto é criado primeiro e os campos são preenchidos conforme o usuário digita.

  <br>

---

## Tabela Comparativa: Qual usar?

| Característica   | Construtor Descritivo (`ClasseUm`)              | Construtor Padrão (`ClasseDois`)                                    |
| :--------------- | :---------------------------------------------- | :------------------------------------------------------------------ |
| **Integridade**  | Alta. O objeto já nasce pronto.                 | Baixa. O objeto pode ficar "incompleto" se esquecerem um `set`.     |
| **Legibilidade** | Ótima para poucos campos.                       | Melhor quando a classe tem 20 campos (evita construtores gigantes). |
| **Uso Comum**    | Regras de negócio, cálculos, objetos imutáveis. | Entidades de Banco de Dados, DTOs, Integrações.                     |

---

## <br>

## 2. O Padrão Builder (Nível Sênior)

Quando uma classe cresce e passa a ter muitos atributos (ex: 10 campos), o construtor descritivo torna-se confuso e propenso a erros de inversão de valores. O **Builder** resolve isso criando o objeto de forma fluída.

```java
public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private String telefone;

    // Construtor privado: Ninguém cria o objeto "na mão" lá fora
    private Usuario(Builder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.idade = builder.idade;
        this.telefone = builder.telefone;
    }

    // A classe interna que faz a mágica
    public static class Builder {
        private String nome;
        private String email;
        private int idade;
        private String telefone;

        public Builder nome(String nome) { this.nome = nome; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder idade(int idade) { this.idade = idade; return this; }
        public Builder telefone(String telefone) { this.telefone = telefone; return this; }

        // O método que finalmente entrega o objeto pronto
        public Usuario build() {
            return new Usuario(this);
        }
    }
}

```

### Com Construtor Comum (Confuso):

```
// Qual String é qual? O risco de inverter nome e email é enorme!
Usuario user = new Usuario("João", "joao@email.com", 25, "9999-9999");
```

### Exemplo de Uso Com Builder (Legível e Fluído)::

    Usuario user = new Usuario.Builder()
                    .nome("André")
                    .email("andre@dev.com")
                    .idade(25)
                    .build(); // O objeto só é validado e entregue aqui

### Por que o mercado prefere o Builder?

1. **Legibilidade:** O código é lido como uma frase.
2. **Opcionalidade:** Se não houver um dado (ex: telefone), você simplesmente não chama o método, sem precisar passar `null`.
3. **Imutabilidade:** Você pode manter os campos protegidos, sem expor métodos `set` públicos.

---

## 3. Dica de Ouro: Project Lombok

Para não ter que escrever centenas de linhas de código repetitivo (_boilerplate_), utilizamos a biblioteca **Lombok** no dia a dia profissional. É algo que ajuda muito na estruturação rápida de projetos maiores, como uma rede social Full-stack.

    import lombok.Builder;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.AllArgsConstructor;

    @Getter
    @Builder
    @NoArgsConstructor  // Para os Frameworks (JPA/Jackson)
    @AllArgsConstructor // Para o funcionamento do Builder
    public class Usuario {
        private String nome;
        private String email;
        private int idade;
    }

---

## Tabela Comparativa de Decisão

| Característica    | Construtor Descritivo  | Construtor Padrão         | Padrão Builder              |
| :---------------- | :--------------------- | :------------------------ | :-------------------------- |
| **Integridade**   | Alta (Objeto pronto)   | Baixa (Objeto incompleto) | Máxima (Validado no build)  |
| **Legibilidade**  | Boa para poucos campos | Média                     | Excelente (Autoexplicativo) |
| **Uso Principal** | Regras de Negócio      | Entidades de Banco/DTOs   | APIs e Objetos Complexos    |

---

> **Conclusão do Docente:** Um bom desenvolvedor backend não apenas faz o código funcionar; ele escolhe a estrutura que torna o sistema mais difícil de quebrar e mais fácil de manter.
