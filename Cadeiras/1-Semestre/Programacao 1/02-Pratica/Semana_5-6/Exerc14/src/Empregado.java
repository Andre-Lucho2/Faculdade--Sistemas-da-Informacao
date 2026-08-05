public class Empregado {
  private String nome;
  private char turno;
  private double salario;

  public Empregado(String nome, char turno, double salario) {
    this.nome = nome;
    this.salario = salario;
    if (turno == 'n' || turno == 'N') {
      turno = 'N';
      this.turno = turno;
    } else {
      this.turno = turno;
    }
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void setTurno(char turno) {
    this.turno = turno;
  }

  public void aumentaSalario(double aumento) {
    this.salario += aumento;
  }

  public double calculaSalarioComAdicionalN() {
    return this.salario + this.salario * 0.3;
  }

  public double calculaAdicionalNoturno() {
    return this.salario * 0.3;
  }

  // public void imprimeInformacoes() {
  // System.out.println("Nome: " + nome);
  // System.out.println("Turno: " + turno);
  // System.out.println("Salário: " + salario);
  // System.out.println("Adicional noturno: " + calculaAdicionalNoturno());
  // }

  @Override
  public String toString() {
    return String.format("Nome: %s | Turno: %c | Salário: %.2f | Adicional Noturno: %.2f | Salário Final: %.2f", nome,
        turno, salario, calculaAdicionalNoturno(), calculaSalarioComAdicionalN());
  }
}
