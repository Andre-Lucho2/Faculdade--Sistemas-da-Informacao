public class ExemploTeclado{
    public static void main(String[] args){
        /**
           A classe Teclado possui métodos para obter valores vindos do usuário através
           da digitação utilizando o teclado. A classe em questão possui os seguintes métodos:
           
           - leInt(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um inteiro. Caso o valor digitado seja inválido (ou seja, não for
           um inteiro), o programa apresentará um erro.
           
           - leDouble(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um double. Caso o valor digitado seja inválido (ou seja, não for
           um double), o programa apresentará um erro.
           
           - leString(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um texto.
           
           - leChar(String msg): este método imprime na tela a String msg e faz o programa parar
           até que o usuário digite um caractere. Caso o valor digitado seja inválido (ou seja, não for
           um char), o programa apresentará um erro.
           
           - leInt(): este método faz o programa parar até que o usuário digite um inteiro. Caso o valor 
           digitado seja inválido (ou seja, não for um inteiro), o programa apresentará um erro.
           
           - leDouble(): este método faz o programa parar até que o usuário digite um double. Caso o valor
           digitado seja inválido (ou seja, não for um double), o programa apresentará um erro.
           
           - leString(): este método faz o programa parar até que o usuário digite um texto.
           
           - leChar(): este método faz o programa parar até que o usuário digite um caractere. Caso o valor 
           digitado seja inválido (ou seja, não for um char), o programa apresentará um erro.
           
           Abaixo, exemplos de utilização da classe Teclado.
           **/
           
           //CHAMADAS AOS MÉTODOS COM IMPRESSÃO DE MENSAGEM:
           String texto1 = Teclado.leString("Digite um texto:");
           System.out.println("O texto digitado foi "+ texto1);
           
           int inteiro1 = Teclado.leInt("Digite um inteiro:");
           System.out.println("O inteiro digitado foi "+ inteiro1);
           
           double real1 = Teclado.leDouble("Digite um número real:");
           System.out.println("O real digitado foi "+ real1);
           
           char caractere1 = Teclado.leChar("Digite um caractere:");
           System.out.println("O caractere digitado foi "+ caractere1);
           
           //CHAMADAS AOS MÉTODOS SEM IMPRESSÃO DE MENSAGEM:
           //perceba que o cursos ficará piscando, aguardando a entrada de dados,
           //mas nenhuma mensagem será impressa
           String texto2 = Teclado.leString();
           System.out.println("O texto digitado foi "+texto2);
           
           int inteiro2 = Teclado.leInt();
           System.out.println("O inteiro digitado foi "+inteiro2);
           
           double real2 = Teclado.leDouble();
           System.out.println("O real digitado foi "+real2);
           
           char caractere2 = Teclado.leChar();
           System.out.println("O caractere digitado foi "+caractere2);
    }
}