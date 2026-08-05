import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomePet = "";
        String tipoPet = "";
        int idadePet = 0;

        boolean continuarCadastro = true;
        int clientesCadastrados = 0;
        Log.printInBlue("Informe o numero de clientes: ");
        int numClientes = Teclado.leInt();
        Log.printInBlue("Informe o numero de Funcionarios:  ");
        int numFuncionarios = Teclado.leInt();
        Log.printInBlue("Informe o numero de Produtos: ");
        int numProdutos = Teclado.leInt();

        PetShop petShop = new PetShop(numClientes, numFuncionarios, numProdutos);
        int cont = 0;
        while (cont < numClientes) {
            String nome = GeradorDadosPessoa.gerarNomeAleatorio();
            Log.printInBlue("Quantos pets o " + nome + " possui ? ");
            int numPets = Teclado.leInt();

            Cliente cliente = new Cliente(
                    nome,
                    GeradorDadosPessoa.gerarIdadeAleatorio(),
                    GeradorDadosPessoa.gerarEndereco(), numPets);
            petShop.cadastrarCliente(cliente);
            int contPet = 0;
            while (contPet < 10) {
                cliente.inserirPet(new Pet(GeradorDadosPet.gerarRacaAleatorio(),
                        GeradorDadosPet.gerarNomeAleatorio(),
                        GeradorDadosPet.gerarIdadeAleatorio()));
                contPet++;
            }
            cont++;
        }
        cont = 0;
        while (cont < numFuncionarios) {
            Funcionario funcionario = new Funcionario(
                    GeradorDadosPessoa.gerarNomeAleatorio(),
                    GeradorDadosPessoa.gerarEndereco(), 600);
            petShop.cadastrarFuncionario(funcionario);
            cont++;
        }
        cont = 0;
        while (cont < numProdutos) {
            Produto produto = new Produto(
                    GeradorDadosProduto.gerarNomeProdutoAleatorio(),
                    GeradorDadosProduto.gerarPrecoAleatorio());
            petShop.cadastrarProduto(produto);
            cont++;
        }

        int op = -1;

        while (op != 0) {
            switch (op) {
                case 1:
                    System.out.println(petShop.printProdutos());
                    break;
                case 2:
                    System.out.println(petShop.printClientes());
                    break;
                case 3:
                    Log.printInBlue("Qual o produto a ser procurar");
                    String str = Teclado.leString();
                    Produto prod = petShop.buscarProduto(str);
                    if (prod != null)
                        System.out.println("Valor do produto: " + prod.getVlrProduto());
                    else
                        System.out.println("Produto não encontrado ");
                    break;
                case 4:
                    Log.printInBlue("Procura Cliente: ");
                    String str2 = Teclado.leString();

                    Cliente cliente = petShop.buscaCliente(str2);
                    if (cliente != null)
                        System.out.println("Valor do produto: " + cliente);
                    else
                        System.out.println("Cliente não encontrado ");

                    break;
                default:
                    System.out.println("Operação não reconhecida.");
            }

            Log.printInRed("Qual opção seguir:  ");
            Log.printInGreen("1 - Imprimir os produtos");
            Log.printInGreen("2 - Imprimir os Clientes");
            Log.printInGreen("3 - Buscar produto");
            Log.printInGreen("4 - Buscar Cliente");
            Log.printInGreen("0 - sair");

            op = Teclado.leInt();
        }
        scanner.close();
    }
}