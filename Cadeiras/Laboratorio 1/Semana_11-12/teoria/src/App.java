public class App {
    public static void main(String[] args) throws Exception {
        // 1.
        int[] idade; // variavel que aponta(ponteiro) para uma lista de int

        int[] dias = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(dias);
        // imprime um endereço de memória

        // 2.
        int[] lista = new int[5];
        // atribuindo uma lista com 5 elementos de valor 0
        System.out.println(lista.length);

        
        for (int i = 0; i < lista.length; i++){
            System.out.println("Índice: " + i + ", valor" + lista[i]);
        }
        
        lista = dias;

        // apaga o ponteiro anterior e recebe o endereço de memória que dias está apontando

        for (int i = 0; i < lista.length; i++){
            System.out.println("Índice: " + i + ", valor" + lista[i]);
        }
    }
}
/*
Sobre rest e Spread:

Não, Java não possui um operador spread como o do JavaScript (...), mas é possível obter um efeito parecido usando varargs (... na declaração de parâmetros) ou métodos utilitários para "espalhar" elementos de arrays ou coleções.

*/