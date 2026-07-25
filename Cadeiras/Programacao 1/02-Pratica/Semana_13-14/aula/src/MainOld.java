import java.util.Scanner;

class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomePet = "";
        String tipoPet = "";
        int idadePet = 0;

        boolean continuarCadastro = true;

        while (continuarCadastro) {
            System.out.println("Digite o nome do pet:");
            nomePet = scanner.nextLine();

            System.out.println("Digite o tipo do pet:");
            tipoPet = scanner.nextLine();

            System.out.println("Digite a idade do pet:");
            try {
                idadePet = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida. Insira um número válido.");
                continue;
            }

            System.out.println("Cadastro do pet concluído:");
            System.out.println("Nome: " + nomePet);
            System.out.println("Tipo: " + tipoPet);
            System.out.println("Idade: " + idadePet);

            System.out.println("Deseja cadastrar outro pet? (S/N)");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S")) {
                continuarCadastro = false;
            }
        }

        System.out.println("Cadastro de pets encerrado.");
        scanner.close();
    }
}