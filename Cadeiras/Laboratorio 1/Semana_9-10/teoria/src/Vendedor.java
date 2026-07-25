public class Vendedor extends Funcionario {
    private double meta;

    public Vendedor(String nome, double salario, int dependentes) {
        super(nome, salario, dependentes);
    }

    public Vendedor(String nome, double salario, int dependentes, double meta) {
        super(nome, salario, dependentes);
        this.meta = meta;
    }

    public void exibeDados() {
        System.out.println("Vendedor: " + super.getNome() + ", salario= " + super.getSalario() + ", dependentes= "
                + super.getDependentes() + ", meta: " + this.meta);
    }

    public void verMeta() {
        System.out.println(this.meta);
    }

}