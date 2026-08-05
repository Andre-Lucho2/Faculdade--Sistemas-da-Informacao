public class Principal {
    public static void main(String[] args) throws Exception {
        String nome = Teclado.leString("Digite seu nome: ");
        int idade = Teclado.leInt("Digite sua idade: ");
        char sexo = Teclado.leChar("Digite seu gênero: ");
        String email = Teclado.leString("Digite um email válido: ");
        String senha = Teclado.leString("Digite uma senha: ");

        String nome2 = Teclado.leString("Digite seu nome: ");
        int idade2 = Teclado.leInt("Digite sua idade: ");
        char sexo2 = Teclado.leChar("Digite seu gênero: ");
        String email2 = Teclado.leString("Digite um email válido: ");
        String senha2 = Teclado.leString("Digite uma senha: ");

        String nome3 = Teclado.leString("Digite seu nome: ");
        int idade3 = Teclado.leInt("Digite sua idade: ");
        char sexo3 = Teclado.leChar("Digite seu gênero: ");
        String email3 = Teclado.leString("Digite um email válido: ");
        String senha3 = Teclado.leString("Digite uma senha: ");



        Cliente cliente1 = new Cliente(nome, email, senha, idade, sexo, "Livro dos Espíritos");
        Cliente cliente2 = new Cliente(nome2, email2, senha2, idade2, sexo2, "Livro dos Médiuns");
        Cliente cliente3 = new Cliente(nome3, email3, senha3, idade3, sexo3, "O Evangelho de Mateus");
        
        // com encapsulamento

        System.out.println("O cliente " + cliente1 + "está com o livro " + cliente1.getTituloLivro() + "e o preço por página deste livro é R$ " + cliente1.getPrecoPorPaginaLivro());

        // sem encapsulamento

        // System.out.println("O cliente " + cliente1 + "está com o livro " + cliente1.getLivro().getTitulo() + "o preço por página deste livro é R$ " + cliente1.getLivro().calcularPrecoPorPagina());


        System.out.println("O cliente " + cliente2 + "está com o livro " + cliente2.getTituloLivro() + "e o preço por página deste livro é R$ " + cliente2.getPrecoPorPaginaLivro());

        System.out.println("O cliente " + cliente3 + "está com o livro " + cliente3.getTituloLivro() + "e o preço por página deste livro é R$ " + cliente3.getPrecoPorPaginaLivro());

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
