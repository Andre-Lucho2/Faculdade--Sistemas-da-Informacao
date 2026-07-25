import banco.Conta;
import banco.Cliente;
import banco.Agencia;
import banco.Banco;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("123456-7", 1000.0);
        Conta conta2 = new Conta("765432-1", 2000.0);
        Cliente cliente1 = new Cliente("João", "Rua A, 123", conta1);
        Cliente cliente2 = new Cliente("Maria", "Rua B, 456", conta2);
        Agencia agencia1 = new Agencia();
        Agencia agencia2 = new Agencia();
        agencia1.adicionarCliente(cliente1);
        agencia2.adicionarCliente(cliente2);
        Banco banco = new Banco();
        banco.adicionarAgencia(agencia1);
        banco.adicionarAgencia(agencia2);
        System.out.println(banco.toString());
    }
}