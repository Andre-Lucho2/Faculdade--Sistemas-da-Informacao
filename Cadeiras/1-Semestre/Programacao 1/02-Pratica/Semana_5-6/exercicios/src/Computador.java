// 2.
public class Computador {
  private String marca;
  private double velocidade;
  private int anoFabricacao;
  private boolean novo;

  public Computador(String marca, double velocidade, int anoFabricacao, boolean novo) {
    this.marca = marca;
    this.velocidade = velocidade;
    this.anoFabricacao = anoFabricacao;
    this.novo = novo;
  }

  public Computador(String marca, int anoFabricacao) {
    this.marca = marca;
    this.anoFabricacao = anoFabricacao;
  }
}