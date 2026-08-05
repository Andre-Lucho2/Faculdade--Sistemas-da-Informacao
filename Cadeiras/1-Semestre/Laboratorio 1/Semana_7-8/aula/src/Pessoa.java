public class Pessoa {
    private String nome;
    private int idade;
    private Carro carro;
    // associação entre classes --> Pessoa e Carro

    public Pessoa(String nome, int idade, Carro carro) {
        this.nome = nome;
        this.idade = idade;
        this.carro = carro;
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public Carro getCarro(){
        return this.carro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCarro(Carro carro){
        this.carro = carro;
    }

    @Override
    public String toString(){
        return String.format("Pessoa - Nome: %s | Idade: %d | Carro: %s", nome, idade, carro);
    }

    
}
