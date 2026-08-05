public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 1.
        // Arrays são do tipo estático, imutável

        int[] idade; // variavel que aponta(ponteiro) para uma lista de int

        int[] dias = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(dias);
        // imprime um endereço de memória

        // 2.
        int[] lista = new int[5];
        // atribuindo uma lista com 5 elementos de valor 0
        System.out.println(lista.length);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Índice: " + i + ", valor" + lista[i]);
        }

        lista = dias;

        // apaga o ponteiro anterior e recebe o endereço de memória que dias está
        // apontando

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Índice: " + i + ", valor" + lista[i]);
        }

    }
}
