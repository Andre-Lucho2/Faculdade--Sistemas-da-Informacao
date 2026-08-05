public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco){
        this.endereco = endereco;
        this.nome = nome;
    }
     public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
