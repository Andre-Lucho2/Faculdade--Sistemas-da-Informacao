import banco.Banco;
import banco.Data;

public class Main {
    public static void main(String[] args) {
        Data dataFundacao = new Data(12, 3, 2000);
        Data dataAberturaConta = new Data(1, 1, 2022);
        Banco banco = new Banco("Banco X", dataFundacao, dataAberturaConta);
        System.out.println(banco);
    }
}