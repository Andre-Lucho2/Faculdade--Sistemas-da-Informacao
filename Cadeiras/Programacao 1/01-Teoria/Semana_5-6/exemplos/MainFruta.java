
public class MainFruta {
    public static void main(String[] args) {
        // Criando uma instância de Fruta
        Fruta f = new Fruta("Morango", 6.98);

        // Acessando e alterando o atributo preco
        f.setPreco(5.76);

        // Acessando o atributo nome e armazenando em uma variável
        String nomeFruta = f.getNome();

        // Chamando o método calculaPreco e armazenando o resultado em uma variável
        double precoComImposto = f.calculaPreco(0.10);

        // Imprimindo os resultados
        System.out.println("Nome da fruta: " + nomeFruta);
        System.out.println("Preço da fruta: " + f.getPreco());
        System.out.println("Preço da fruta com imposto: " + precoComImposto);
    }
}