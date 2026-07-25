public class App {

    // Questão 4:
    String[] nomes = { "Ana", "Carlos", "Joao", "Felipe" };

    public static int exercicio4(String[] array, String busca) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(busca))
                return 0;
        }
        return -1;
    }

    // Questão 6:
    public static int[] exercicio6(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int cont = 0;

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            cont++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[cont] = array2[i];
            cont++;
        }
        return array3;
    }

    // Questão 6.1:
    public static int[] exercicio6_1(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int cont = 0;

        for (int i = 0; i < array1.length; i++) {
            array3[cont++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[cont++] = array2[i];
        }
        return array3;
    }

    // Questão7
    public static int[] exercicio7(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        return array3;
    }

    public static void main(String[] args) throws Exception {
    }

}
