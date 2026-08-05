public class App2 {

    public static void main(String[] args) {
        Funcionario func = new Funcionario("Andre", 5000, 0);

        Funcionario vendedor = func.escolheFuncionario("vendedor");
        vendedor.exibeDados();

        Vendedor vendedor1 = (Vendedor) vendedor;
        vendedor1.verMeta();

        ((Vendedor) vendedor).verMeta();
    }
}
