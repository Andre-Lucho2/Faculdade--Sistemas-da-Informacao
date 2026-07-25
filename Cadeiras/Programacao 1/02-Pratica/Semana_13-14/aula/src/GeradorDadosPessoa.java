import java.util.Random;

public class GeradorDadosPessoa {
    private static String[] nomes = {"João","Maria","Pedro","Ana","Lucas","Lara","Miguel","Sophia","Gustavo","Isabel"};
    private static String[] sobrenomes = {"Silva","Santos","Pereira","Ferreira","Oliveira","Ribeiro","Carvalho","Gomes","Mendes","Costa"};
    private static String[] ruas = {"Via Appia","Via Veneto","Via del Corso","Via Condotti","Via Margutta","Via dei Fori Imperiali","Via Giulia","Via Nazionale","Via Cavour","Via della Conciliazione"};
    private static Random random = new Random();

    public static String gerarNomeAleatorio() {
        String prefixo = nomes[random.nextInt(nomes.length)];
        String sufixo = sobrenomes[random.nextInt(sobrenomes.length)];
        return prefixo + " " + sufixo;
    }

    public static String gerarEndereco() {
        return ruas[random.nextInt(ruas.length)] +  " , " + random.nextInt(100) + 1;
    }

    public static int gerarIdadeAleatorio() {
        return random.nextInt(15) + 1;
    }
}
