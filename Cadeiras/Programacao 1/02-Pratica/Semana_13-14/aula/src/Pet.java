public class Pet {
    private String raca;
    private String nome;
    private int idade;


    public Pet(String raca, String nome, int idade){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }


    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}