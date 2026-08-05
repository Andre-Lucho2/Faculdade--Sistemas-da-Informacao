public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void metodoX(){
        System.out.println("algo");
    }

    public void metodoX(int par){
        System.out.println("algo" + par);
    }

}
