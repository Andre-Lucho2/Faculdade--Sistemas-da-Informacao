// Classe --> criando um novo tipo, além do int, String, boolean....

public class Pessoa {
    // atributos da classe Pessoa
    private String nome;
    private int idade;

    // método construtor = constrõe a classe e aloca na memória
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    // método = visibilidade | tipo de retorno | nome
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
