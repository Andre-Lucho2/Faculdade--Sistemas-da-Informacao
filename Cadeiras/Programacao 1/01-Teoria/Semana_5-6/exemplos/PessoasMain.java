public class PessoasMain {
    public static void main(String[] args) {
        // Criação do objeto "pessoa1" da classe Pessoa, com valores para nome, idade, peso e altura
        Pessoas pessoa1 = new Pessoas("João", 30, 80.0, 1.75);
        
        // Chama o método situacaoIMC() para pessoa1 e imprime a mensagem na tela
        System.out.println(pessoa1.situacaoIMC());
        // Saída: "Você está em seu peso normal"
        
        // Criação do objeto "pessoa2" da classe Pessoa, com valores para nome, idade, peso e altura
        Pessoas pessoa2 = new Pessoas("Maria", 25, 65.0, 1.60);
        
        // Chama o método situacaoIMC() para pessoa2 e imprime a mensagem na tela
        System.out.println(pessoa2.situacaoIMC());
        // Saída: "Você está em seu peso normal"
        
        // Criação do objeto "pessoa3" da classe Pessoa, com valores para nome, idade, peso e altura
        Pessoas pessoa3 = new Pessoas("Pedro", 40, 100.0, 1.80);
        
        // Chama o método situacaoIMC() para pessoa3 e imprime a mensagem na tela
        System.out.println(pessoa3.situacaoIMC());
        // Saída: "Obesidade grau I"
    }
}
