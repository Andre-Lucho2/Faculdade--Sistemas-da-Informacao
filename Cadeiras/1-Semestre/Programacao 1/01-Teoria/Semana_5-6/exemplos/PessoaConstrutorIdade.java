public class PessoaConstrutorIdade {
    private String nome;
    private int idade;

    // Construtor padrão
    public PessoaConstrutorIdade() {
        this.nome = "";
        this.idade = 0;
    }

    // Construtor com parâmetros
    public PessoaConstrutorIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor com validação de idade
    public PessoaConstrutorIdade(String nome, int idade, boolean maiorIdade) {
        this.nome = nome;
        if (maiorIdade) {
            if (idade < 18) {
                this.idade = 18;
            } else {
                this.idade = idade;
            }
        } else {
            this.idade = idade;
        }
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}