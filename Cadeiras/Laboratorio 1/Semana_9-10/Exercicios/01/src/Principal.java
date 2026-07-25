import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da nova sala:");
        String nomeSala = input.next();

        Sala sala1 = new Sala(nomeSala, null, null, null, null);

        System.out.println(sala1);

        for (int i = 0; i < (sala1.cadeiras.length); i++) {
            System.out.println("Aluno: " + (i + 1));
            System.out.println("Entre com um novo nome de aluno:");
            String nomeAluno = input.next();
            System.out.println("Qual é a idade aluno?");
            int idadeAluno = input.nextInt();
            System.out.println(
                    "Que tipo de cadeira ele irá ocupar? Digite 'mesa' para ele ocupar uma Cadeira com mesa; ou digite 'rodinha' para ele ocupar uma cadeira com Rodas");
            String tipoCadeira = input.next();

            if (tipoCadeira.equals("mesa")) {
                sala1.cadeiras[i] = new CadeiraComMesa(null, new Cor(3, 102, 220), 30, 30);
                // sala1.setCadeira(i, new CadeiraComMesa(null, null, 30, 30)); *
                sala1.entraAluno(new Aluno(nomeAluno, idadeAluno), "mesa");
                System.out.println(sala1.toString());
            } else if (tipoCadeira.equals("rodinha")) {
                sala1.cadeiras[i] = new CadeiraComRodinhas(null, new Cor(220, 39, 3), new Data(01, 04, 2026));
                // sala1.setCadeira(i, new CadeiraComRodinhas(null, null, new Data(01, 04,
                // 2026)));
                sala1.entraAluno(new Aluno(nomeAluno, idadeAluno), "rodinha");
                System.out.println(sala1.toString());
            }

            System.out.println("-------------------------");

            // * método p setar dinamicamente a posição da cadeira no array.
        }

        System.out.println("A sala está cheia...");

        System.out.println("-------------------------");

        // Procurando nome aluno e sua cadeira:
        System.out.println("Digite o nome do aluno a ser procurado:");
        String nomeAluno = input.next();

        String alunoProcurado = sala1.procuraAluno(nomeAluno);

        if (alunoProcurado != null) {
            Cadeira cadeiraAluno = sala1.procuraCadeira(alunoProcurado);
            Cor corCadeira = cadeiraAluno.getCor();

            JFrame a = new JFrame();
            a.setSize(200, 200);
            a.setBackground(new Color(corCadeira.getR(), corCadeira.getG(), corCadeira.getB()));
            a.setVisible(true);
        } else {
            System.out.println("Aluno não encontrado na sala.");

        }
        input.close();
    }
}
