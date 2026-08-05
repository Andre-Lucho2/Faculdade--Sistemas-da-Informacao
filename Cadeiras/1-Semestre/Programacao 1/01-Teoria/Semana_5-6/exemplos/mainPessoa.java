public class MainPessoa {
    public static void main(String[] args) {
        // Cria três objetos Pessoa com diferentes pesos e alturas
        Pessoa pessoa1 = new Pessoa(70.0, 1.75);
        Pessoa pessoa2 = new Pessoa(85.0, 1.80);
        Pessoa pessoa3 = new Pessoa(65.0, 1.70);

        // Calcula o IMC de cada pessoa e imprime na tela
        double imc1 = pessoa1.calcularIMC();
        double imc2 = pessoa2.calcularIMC();
        double imc3 = pessoa3.calcularIMC();
        System.out.println("O IMC da pessoa 1 é " + imc1);
        System.out.println("O IMC da pessoa 2 é " + imc2);
        System.out.println("O IMC da pessoa 3 é " + imc3);

        // Obtém a situação do IMC de cada pessoa e imprime na tela
        String situacao1 = pessoa1.situacaoIMC();
        String situacao2 = pessoa2.situacaoIMC();
        String situacao3 = pessoa3.situacaoIMC();
        System.out.println("A situação do IMC da pessoa 1 é " + situacao1);
        System.out.println("A situação do IMC da pessoa 2 é " + situacao2);
        System.out.println("A situação do IMC da pessoa 3 é " + situacao3);
    }
}