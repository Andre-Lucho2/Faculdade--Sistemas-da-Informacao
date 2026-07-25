public class CadeiraComMesa extends Cadeira {
    private double largura;
    private double profundidade;

    public CadeiraComMesa(Aluno aluno, Cor cor, double largura, double profundidade) {
        super(aluno, cor);
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public CadeiraComMesa(Aluno aluno, Cor cor) {
        super(aluno, cor);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Cadeira com mesa: " + super.getAluno() + ", cor: " + super.getCor() + ", largura: "
                + this.largura + ", profundidade: " + this.profundidade;
    }

}
