package banco;

public class Cliente {
    private String nome;
    private String endereco;
    private Conta conta;

    public Cliente(String nome, String endereco, Conta conta) {
        this.nome = nome;
        this.endereco = endereco;
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", endereco=" + endereco + ", conta=" + conta.toString() + "]";
    }
}
