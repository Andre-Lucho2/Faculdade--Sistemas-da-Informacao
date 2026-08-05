public class Produto {
  private String nome, descricao;
  private double valor;
  private int estoque;

  public Produto(String nome, String descricao, double valor, int estoque) {
    this.nome = nome;
    this.descricao = descricao;
    this.valor = valor;
    this.estoque = estoque;
  }

  public Produto(String nome, int estoque) {
    this.nome = nome;
    this.estoque = estoque;

  }

}
