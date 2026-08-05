public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, int ano, int mes, int dia) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = new Data(ano, mes, dia);
    }

    public Produto() {
        this.dataValidade = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean verificaProdutoVencido(Data data) {
        if (data.getData().isAfter(this.dataValidade.getData())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | preco: " + preco + " | Data de validade: " + dataValidade;
    }

}
