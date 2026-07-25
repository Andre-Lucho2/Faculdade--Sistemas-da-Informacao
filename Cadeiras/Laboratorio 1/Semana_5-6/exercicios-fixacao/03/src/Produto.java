
public class Produto {
	private String nome, descricao;
	private double valor;
	private int quantEstoque;
	public Produto(String nome, String descricao, double valor, int quantEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.quantEstoque = quantEstoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantEstoque() {
		return quantEstoque;
	}
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	
	
}
