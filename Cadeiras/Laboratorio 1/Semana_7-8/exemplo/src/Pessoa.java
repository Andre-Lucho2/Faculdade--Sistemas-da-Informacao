public class Pessoa {
    private String nome;
    private int idade;
    private Dado meuDado;
    private Dado meuDado1;
    private Dado meuDado2;
    // associação entre classes --> Pessoa e Dado

    
    public Pessoa(String nome, int idade, int dado) {
        this.nome = nome;
        this.idade = idade;
        this.meuDado = new Dado(dado);
        // meu atributo 'tipo Dado' está recebendo um objeto*
        // com um valor 'int dado' que defino na instanciação de um novo objeto de Pessoa
        // *instanciado no momento de sua construção(Pessoa)
        this.meuDado1 = new Dado(6);
        this.meuDado2 = new Dado(8);
    }

    // public Pessoa(String nome, int idade, Dado dado) {
    //     this.nome = nome;
    //     this.idade = idade;
    //     this.meuDado = new Dado(dado);
//     // estou construindo um novo objeto, mas dado(vindo do parêmetro) é do tipo  Dado, que JÁ É UM OBJETO instanciado == estaria instanciando um novo objeto de um objeto já existente! 
//      }

    // public Pessoa(String nome, int idade) {
    //     this.nome = nome;
    //     this.idade = idade;
    //     }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public Dado getDado(){
        return this.meuDado;
    }
    public Dado getDado1(){
        return this.meuDado1;
    }
    public Dado getDado2(){
        return this.meuDado2;
    }



    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setDado(Dado meuDado){
        this.meuDado = meuDado;
    }

// public void setDado(int meuDado){
//     this.meuDado = new Dado(meuDado);
// }
// instanciando um novo objeto Dado a partir de um método que não o construtor


    public void jogarDado(){
        this.meuDado.jogarDado();
    }

    @Override
    public String toString(){
        return String.format("Pessoa - Nome: %s | Idade: %d", nome, idade);
    }

    
}
