public class Gerente extends Funcionario{
    private String departamento;
    private double comissao;
    
    public Gerente(String nome, double salario, String departamento, double comissao){
        super(nome, salario);
        this.departamento = departamento;
        this.comissao = comissao;

    }
    
}
