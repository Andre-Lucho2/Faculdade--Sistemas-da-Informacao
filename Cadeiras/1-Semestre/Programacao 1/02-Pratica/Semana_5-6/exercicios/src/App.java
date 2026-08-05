public class App {
    public static void main(String[] args) {
        Computador comp = new Computador("renault", 4.4, 1990, true);

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setNumeroConta(1234);
        conta1.setSaldoAtual(100.00);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setNumeroConta(8765);
        conta2.setSaldoAtual(-98.00);

        ContaCorrente conta3 = new ContaCorrente();
        conta3.setNumeroConta(3342);
        conta3.setSaldoAtual(3445.80);

        // System.out.println("Numero da Conta: " + conta1.getNumeroConta() + " | Saldo
        // atual: " + conta1.getSaldoAtual());

        // usando o método nativo toString() sobreescrito - não há necessidate dos
        // getters
        // nem de invocar o método toString() diretamente
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

    }
}
