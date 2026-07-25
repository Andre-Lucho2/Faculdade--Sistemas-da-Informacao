public class Gerente extends Funcionario {
    private String nomeSecretario;

    public Gerente(String nome, double salario, int dependentes) {
        super(nome, salario, dependentes);
    }

    // opcional
    public Gerente(String nome, double salario, int dependentes, String nomeSecretario) {
        super(nome, salario, dependentes);
        this.nomeSecretario = nomeSecretario;
    }

    public void nomeiaSecretario(String nomeSecretario) {
        this.nomeSecretario = nomeSecretario;
    }

    public void exibeDados() {
        System.out.println("Gerente: " + super.getNome() + ", salario: " +
                super.getSalario() + ", dependentes: "
                + super.getDependentes() + ", secretário: " + this.nomeSecretario);
    }
}
