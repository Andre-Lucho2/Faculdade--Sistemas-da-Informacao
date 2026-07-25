public class Corredor extends Atleta {
    private double peso;
    private Competicao competicao;

    public Corredor(String nome, int idade, double peso, Competicao competicao) {
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }

    public String imprimeCompeticao() {
        return String.format("Competição- %s, Data competição: %s", this.competicao.getNome(),
                this.competicao.getData().imprimeInfo());

    }

    public String imprimeInfo() {
        return String.format("Nome: %s, \nidade: %d, \npeso: %f, %s", super.nome,
                super.idade, this.peso, this.imprimeCompeticao());
    }

}
