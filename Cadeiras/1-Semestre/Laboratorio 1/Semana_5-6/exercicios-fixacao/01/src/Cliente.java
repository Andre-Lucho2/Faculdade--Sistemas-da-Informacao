public class Cliente {
    private String nome, email;
    private int idade, senha;
    private char genero;

    public Cliente(String nome, String email, int senha, int idade, char genero) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public int getSenha(){
        return this.senha;
    }
    public int getIdade(){
        return this.idade;
    }

    public char getGenero(){
        return this.genero;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public void imprimeInformacoes(){
        System.out.println(String.format("Nome: %s, Idade: %d, Email: %s, Senha: %s, Gênero: %c", nome, idade, email, senha, genero));
    }
    
}
