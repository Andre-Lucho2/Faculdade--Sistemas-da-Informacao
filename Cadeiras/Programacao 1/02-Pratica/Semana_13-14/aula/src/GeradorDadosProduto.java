import java.util.Random;

public class GeradorDadosProduto {
    private static String[] categorias = { "Ração", "Brinquedo", "Coleira", "Shampoo", "Gaiola", "Roupa" };
    private static String[] tipos = { "Premium", "Econômico", "Orgânico", "Natural" };
    private static Random random = new Random();

    public static String gerarNomeProdutoAleatorio() {
        String categoria = categorias[random.nextInt(categorias.length)];
        String tipo = tipos[random.nextInt(tipos.length)];
        return tipo + " de " + categoria;
    }

    public static double gerarPrecoAleatorio() {
        return 5.0 + random.nextDouble() * 45.0; // Preço aleatório entre 5.0 e 50.0
    }
}
