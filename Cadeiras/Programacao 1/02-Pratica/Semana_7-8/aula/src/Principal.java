import java.util.Scanner;

public class Principal {

    // classe static --> não precisa instanciar para contruir um objeto --> ela esta disponível
    // Na Classe Main, sempre devemos ter classes estáticas!
    
    public static FlightTicket simulaCompraTicket(){
        // Fake com classes estáticas
        Pessoa passageiro = new Pessoa(Fake.generateRandomName(), Fake.gerarCPF());
        FlightTicket ticket = new FlightTicket("POA", "GRU", "", passageiro);
        
        return ticket;
    }

    public static FlightTicket compraManualTicket(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do passageiro: ");
        String nome = scan.nextLine();
        System.out.println("Informe o CPF do passageiro: ");
        String cpf = scan.nextLine();
        scan.close();

        FlightTicket flight = new FlightTicket(cpf, nome, cpf, null);

    }

    public static void main(String[] args) {
        Log.LogMessagewithColorBlue("===================================");
        Log.LogMessagewithColorBlue("DecoleMais - Vendas de Passagem aérea");
        Log.LogMessagewithColorBlue("===================================");
    
        FlightTicket ticket;
        
        int opcao = 1;
        Scanner scan = new Scanner(System.in);
        while (opcao != 0) {
            // Exibindo o menu
            System.out.println("----- Menu -----");
            System.out.println("1. Comprar passagem manualmente");
            System.out.println("2. Usar o simulador de compra de passagens");
            System.out.println("3. Imprimir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lendo a opção escolhida pelo usuário
            opcao = scan.nextInt();
            if (opcao == 2){
                ticket = simulaCompraTicket();
                System.out.println(ticket);
            } else if (opcao == 1){
                ticket = compraManualTicket();
                System.out.println(ticket);
                }
            // else if(opcao == 3){
            // }
            scan.close();

        }
    
    }
}