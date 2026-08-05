import java.util.Locale;
import java.util.Scanner;

public class SobreMimTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/**
O programa pede que o usuário informe seu nome, sobrenome, idade e altura, e depois imprime essas informações.
Foram adicionados blocos try-catch-finally para tratamento de possíveis exceções, como:
não informar valores numéricos, usar vírgula ao invés de ponto na altura, ou não informar nome e sobrenome.
O bloco try é usado para o código que pode gerar exceções, 
o bloco catch é usado para capturar a exceção e mostrar uma mensagem de erro ao usuário, 
e o bloco finally é usado para fechar o objeto Scanner, independente do que aconteça no código.
**/