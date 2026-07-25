public class Nadador extends Atleta {
    private String categoria;

    public Nadador(String nome, int idade, String categoria) {
        super(nome, idade);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String imprimeInfo() {
        return String.format("Nome: %s , \nidade: %d, \ncategoria: %s", super.nome, super.idade, this.categoria);
    }

}
