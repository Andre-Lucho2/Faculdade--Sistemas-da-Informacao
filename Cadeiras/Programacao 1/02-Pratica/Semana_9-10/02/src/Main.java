import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int tipo = 0;
        Musica music;
        for (int i = 0; i < 5; i++) {
            tipo = random.nextInt(2); // range entre 0-2
            if (tipo == 0) {
                music = new Classica("Beethoven");
            } else if (tipo == 1) {
                music = new Rock();
            } else {
                music = new Jazz();
            }

            // polimorfismo
            music.reproduzir();

        }

    }
}
