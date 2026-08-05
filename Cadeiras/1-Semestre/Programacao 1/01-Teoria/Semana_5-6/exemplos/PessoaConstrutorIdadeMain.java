public class PessoaConstrutorIdadeMain {
    public static void main(String[] args) {
        // Criar uma pessoa com idade < 18
        PessoaConstrutorIdade p1 = new PessoaConstrutorIdade("João", 16, true);
        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade()); // saída: Nome: João, Idade: 18

        // Criar uma pessoa com idade >= 18
       PessoaConstrutorIdade p2 = new PessoaConstrutorIdade("Maria", 25, true);
        System.out.println("Nome: " + p2.getNome() + ", Idade: " + p2.getIdade()); // saída: Nome: Maria, Idade: 25
    }
}