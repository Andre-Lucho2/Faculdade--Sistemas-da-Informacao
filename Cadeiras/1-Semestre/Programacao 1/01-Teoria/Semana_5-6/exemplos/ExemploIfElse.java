// Importa a classe Scanner do pacote java.util
import java.util.Scanner;

// Cria a classe ExemploIfElse
public class ExemploIfElse {

    // Define o método main, que é o ponto de entrada do programa
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário a partir do console
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário que digite sua idade e lê a entrada usando o objeto Scanner
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Testa se a idade é maior ou igual a 18 e imprime a mensagem correspondente
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        // Fecha o objeto Scanner
        scanner.close();
    }
}