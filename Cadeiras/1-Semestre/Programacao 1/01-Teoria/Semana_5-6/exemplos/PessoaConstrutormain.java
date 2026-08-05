public class PessoaConstrutorMain {
    public static void main(String[] args) {
        // Criar uma pessoa com o construtor sem parâmetros
        PessoaConstrutor p1 = new PessoaConstrutor();
        p1.setNome("João");
        p1.setIdade(30);

        // Criar uma pessoa com o construtor com parâmetros
        PessoaConstrutor p2 = new PessoaConstrutor("Maria", 25);

        // Exibir informações sobre as pessoas criadas
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());
        System.out.println("Nome: " + p2.getNome() + ", Idade: " + p2.getIdade());
    }
}