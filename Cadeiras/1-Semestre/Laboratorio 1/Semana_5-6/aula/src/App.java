import java.util.Scanner;

public class App {
    // nome da classe do Sistema deve ser o mesmo do arquivo dele
    public static void main(String[] args) {
        int idade = 15;

        System.out.println("Hello, World!");

        if(idade > 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        Pessoa variavelPessoa = new Pessoa("Felipe", 20);
        // Tipo Pessoa = instanciando o construtor de Pessoa(argumentos)
        
        System.out.println("O nome da pessoa é: " + variavelPessoa.getNome());


        // entrada de dados por teclado
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Informe o valor do bis: ");
        // double valorBIs = sc.nextDouble();

        // System.out.printf("Valor eh %.2f",valorBIs);



    }
    

}
