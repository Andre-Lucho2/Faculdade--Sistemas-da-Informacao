import java.util.Scanner; // importa a classe Scanner da biblioteca padrão do Java

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite um número inteiro: "); // exibe uma mensagem para o usuário
        int num = sc.nextInt(); // lê um número inteiro digitado pelo usuário
        System.out.println("Você digitou o número " + num); // exibe o número digitado pelo usuário
        sc.close(); // fecha o objeto Scanner para liberar os recursos
    }

}