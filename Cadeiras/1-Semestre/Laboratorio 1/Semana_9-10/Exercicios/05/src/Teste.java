import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Competicao comp = new Competicao("Correr Cansa", null);
        comp.setData(new Data(19, 05, 2026));
        // System.out.println(comp.imprimeInfo());

        Nadador nadador1 = new Nadador("Cielo", 23, "borboleta");
        // System.out.println(nadador1.imprimeInfo());

        Corredor corredor1 = new Corredor("Pedro", 91, 0, comp);
        Data novaData = corredor1.getCompeticao().getData();
        novaData.setMes(02);
        // System.out.println(novaData);

        Competicao comp2 = new Competicao("São Silvestre", new Data(01, 01, 2026));
        Atleta atleta1 = new Corredor("Augusto", 100, 70.0, comp2);
        // System.out.println(atleta1.imprimeInfo());

        // Corredor poliAtleta1 = (Corredor) atleta1;
        // System.out.println(poliAtleta1.imprimeInfo());

        Atleta a;
        int opcao;
        Scanner input = new Scanner(System.in);
        InformacoesAtletas infoAtletas = new InformacoesAtletas();

        System.out
                .println("Digite uma das opcões:\n 1. Criar um Nadador \n2. Criar um Corredor \nOutro valor: Sair");
        opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o nome do atleta: ");
            String nome = input.next();
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.println("Digite a categoria de nado: ");
            String categoria = input.next();
            a = new Nadador(nome, idade, categoria);
            ((Nadador) a).setCategoria("livre");

        } else if (opcao == 2) {
            System.out.println("Digite o nome do atleta: ");
            String nome = input.next();
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.println("Digite o peso do atleta: ");
            double peso = input.nextDouble();
            a = new Corredor(nome, idade, peso, new Competicao("São Silvestre", new Data(01, 01, 2027)));
            ((Corredor) a).setPeso(89.0);
        } else {
            a = null;
            System.out.println("Opção inválida...");
        }

        input.close();

        if (a != null) {
            infoAtletas.imprimeExclusivosAtleta(a);
            System.out.println(a.imprimeInfo());
        }

    }
}