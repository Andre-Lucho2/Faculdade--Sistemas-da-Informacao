public class Teste {
    public static void main(String[] args) {
        // Funcionario01
        String nomeFunc1 = Teclado.leString("Digite o nome do funcionário 01:");
        String enderecoFunc1 = Teclado.leString("Digite o endereço do funcionário 01:");
        char sexoFunc1 = Teclado.leChar("Digite o gênero do funcionário 01:");

        // Funcionario02
        String nomeFunc2 = Teclado.leString("Digite o nome do funcionário 012:");
        String enderecoFunc2 = Teclado.leString("Digite o endereço do funcionário 02:");
        char sexoFunc2 = Teclado.leChar("Digite o gênero do funcionário 02:");
        String corCalculadoraFunc2 = Teclado.leString("Digite uma cor para a calculadora do funcionario 02:");

        // Empresa
        String nomeEmpresa = Teclado.leString("Digite o nome da Empresa:");

        // Instância Objetos
        FuncionarioCaixa funcionario1 = new FuncionarioCaixa(nomeFunc1, enderecoFunc1, sexoFunc1, "azul");
        Empresa empresa1 = new Empresa(nomeEmpresa,funcionario1, nomeFunc2, enderecoFunc2, sexoFunc2, corCalculadoraFunc2);

        //Prints 
        funcionario1.imprimeInfo();
        // System.out.println(funcionario1.soma(2,2));
        // System.out.println(funcionario1.subtrai(5,4));
        // System.out.println(funcionario1.multiplica(2,3));
        // System.out.println(funcionario1.divide(6,3));

        empresa1.imprimeInfo();
    }
}
