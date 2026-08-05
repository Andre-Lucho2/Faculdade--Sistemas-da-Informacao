import java.util.Random;

public class GeradorDadosPet {
    private static String[] prefixos = { "Daisy", "Zoey", "Bacon", "Sherlock", "Cher", "Batman", "Buzz" };
    private static String[] sufixos = { " Batata", " Pumba", " Popeye", " Poodle", " Winnie", " Travolta" };
    private static String[] raca = { " Hound", " Akita", " Beagle", " Boxer", " Bull Terrier", " Borzoi" };
    private static Random random = new Random();

    public static String gerarNomeAleatorio() {
        String prefixo = prefixos[random.nextInt(prefixos.length)];
        String sufixo = sufixos[random.nextInt(sufixos.length)];
        return prefixo + " " +  sufixo;
    }

    public static String gerarRacaAleatorio() {
        return raca[random.nextInt(raca.length)];
    }

    public static int gerarIdadeAleatorio() {
        return random.nextInt(15) + 1;
    }
}
