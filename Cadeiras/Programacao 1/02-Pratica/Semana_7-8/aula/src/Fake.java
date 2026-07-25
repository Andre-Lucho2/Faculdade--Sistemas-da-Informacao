import java.util.Random;

/*
 * O objetivo de static não é implementar imutabilidade mas sim o 
 * de declarar o membro (método, "campo", "propriedade", "atributo"...) 
 * em uma classe em vez de publicar em um objeto (uma instância da classe).
 */
public class Fake {
    private static final Random random = new Random();

    private static final String[] names = { "John", "Alice", "Michael", "Emily", "David", "Sophia", "Daniel",
            "Olivia" };
    private static final String[] surnames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis",
            "Garcia" };

    private static final String[] funcoes = { "Comissário", "Comissario chefe", "piloto", "copiloto", "Aeromoça",
            "mecânico de voo" };

    public static String generateRandomName() {
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static String generateRandomSurname() {
        int randomIndex = random.nextInt(surnames.length);
        return surnames[randomIndex];
    }

    public static String generateRandomFullName() {
        String randomName = generateRandomName();
        String randomSurname = generateRandomSurname();
        return randomName + " " + randomSurname;
    }

    public static String generateRandomFuncoes() {
        int randomIndex = random.nextInt(funcoes.length);
        return funcoes[randomIndex];
    }

    public static String gerarCPF() {
        // StringBuilder cpf = new StringBuilder();
        String cpf = "";

        for (int i = 0; i < 11; i++)
            ;
        {
            // cpf.append(random.nextInt(10));
            cpf += random.nextInt(10);
        }
        return cpf;
    }
}
