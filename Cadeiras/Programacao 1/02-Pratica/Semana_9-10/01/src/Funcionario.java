public class Funcionario {
    private String nome;
    private double salario;
    protected int dependentes; // protected --> somente a prórpia classe e as classes que herdam da superclasse
                               // tem acesso a esse atributo

    public Funcionario(String nome, double salario, int dependentes) {
        this.nome = nome;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public Funcionario escolheFuncionario(String func) {
        Funcionario novoFunc;
        switch (func) {
            case "gerente":
                return novoFunc = new Gerente(nome, salario, dependentes);
            case "vendedor":
                return new Vendedor(nome, salario, dependentes);
            default:
                return novoFunc = new Funcionario(nome, salario, dependentes);
        }
    }

    public void exibeDados() {
        System.out.println("Funcionario: " + nome + ", salario= " + salario + ", dependentes= " + dependentes);
    }

}