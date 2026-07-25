public class Funcionario extends Pessoa{
    // Atributos da classe
    
    private double salario;

    // Construtor da classe
    public Funcionario(String nome, String endereco, double salario) {
        super(nome, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Salário: " + salario);
    }
}
