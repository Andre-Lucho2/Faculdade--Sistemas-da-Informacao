public class Principal {
    public static void main(String[] args) throws Exception {
        // livro1
        String livroNome1 = Teclado.leString("Digite o nome do livro 1: ");
        int livroAno1 = Teclado.leInt("Digite o ano de publicação: ");
        double livroPreco1 = Teclado.leDouble("Digite o preco do livro: ");
        int livroPaginas1 = Teclado.leInt("Digite a quant de páginas do livro: ");
        
        Livro sociedadeDoAnel = new Livro(livroNome1, livroAno1, livroPreco1, livroPaginas1);

        // String livroNome2 = Teclado.leString("Digite o nome do livro 2: ");
        // int livroAno2 = Teclado.leInt("Digite o ano de publicação: ");
        // double livroPreco2 = Teclado.leDouble("Digite o preco do livro: ");
        // int livroPaginas2 = Teclado.leInt("Digite a quant de páginas do livro: ");
        // Livro duasTorres = new Livro(livroNome2, livroAno2, livroPreco2, livroPaginas2);

        // String livroNome3 = Teclado.leString("Digite o nome do livro 3: ");
        // int livroAno3 = Teclado.leInt("Digite o ano de publicação: ");
        // double livroPreco3 = Teclado.leDouble("Digite o preco do livro: ");
        // int livroPaginas3 = Teclado.leInt("Digite a quant de páginas do livro: ");
        // Livro retornoRei = new Livro(livroNome3, livroAno3, livroPreco3, livroPaginas3);

        String clienteNome1 = Teclado.leString("Digite o nome do cliente 1: ");
        String clienteEmail1 = Teclado.leString("Digite seu email: ");
        int clienteSenha1 = Teclado.leInt("Digite sua senha: ");
        int clienteIdade1 = Teclado.leInt("Digite sua idade: ");
        char clienteGenero1 = Teclado.leChar("Digite seu gênero: ");
        Cliente cliente1 = new Cliente(clienteNome1, clienteEmail1, clienteSenha1, clienteIdade1,clienteGenero1);

        // String clienteNome2 = Teclado.leString("Digite o nome do cliente 1: ");
        // String clienteEmail2 = Teclado.leString("Digite seu email: ");
        // String clienteSenha2 = Teclado.leString("Digite sua senha: ");
        // int clienteIdade2 = Teclado.leInt("Digite sua idade: ");
        // char clienteGenero2 = Teclado.leChar("Digite seu gênero: ");
        // Cliente cliente2 = new Cliente(clienteNome2, clienteEmail2, clienteSenha2, clienteIdade2,clienteGenero2);

        // String clienteNome3 = Teclado.leString("Digite o nome do cliente 1: ");
        // String clienteEmail3 = Teclado.leString("Digite seu email: ");
        // String clienteSenha3 = Teclado.leString("Digite sua senha: ");
        // int clienteIdade3 = Teclado.leInt("Digite sua idade: ");
        // char clienteGenero3 = Teclado.leChar("Digite seu gênero: ");
        // Cliente cliente3 = new Cliente(clienteNome3, clienteEmail3, clienteSenha3, clienteIdade3,clienteGenero3);

        System.out.println(sociedadeDoAnel.calcularPrecoPorPagina());
        // System.out.println(duasTorres.calcularPrecoPorPagina());
        // System.out.println(retornoRei.calcularPrecoPorPagina());

        System.out.println(sociedadeDoAnel);
        // System.out.println(duasTorres);
        // System.out.println(retornoRei);

        cliente1.imprimeInformacoes();
        // cliente2.imprimeInformacoes();
        // cliente3.imprimeInformacoes();

    }
}

// Livro sociedadeDoAnel = new Livro("O Senhor dos Anéis - A Sociedade do Anel",
// 1954, 60.00, 423);

// Livro duasTorres = new Livro("O Senhor dos Anéis - As Duas Torres", 1954,
// 55.00, 352);

// Livro retornoRei = new Livro("O Senhor dos Anéis - O retorno do Rei", 1955,
// 75.00, 450);
