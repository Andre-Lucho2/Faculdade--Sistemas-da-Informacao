package banco;

public class Banco {
    private String nome;
    private Data dataFundacao;
    private Data dataAberturaConta;

    public Banco(String nome, Data dataFundacao, Data dataAberturaConta) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.dataAberturaConta = dataAberturaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Data getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(Data dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    @Override
    public String toString() {
        return "Banco: " + nome + "\n" +
                "Data de fundação: " + dataFundacao + "\n" +
                "Data de abertura da conta: " + dataAberturaConta;
    }
}
