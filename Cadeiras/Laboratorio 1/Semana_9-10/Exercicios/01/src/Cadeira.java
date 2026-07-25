public class Cadeira {
    private Aluno aluno;
    private Cor cor;

    public Cadeira(Aluno aluno, Cor cor) {
        this.aluno = aluno;
        this.cor = cor;
    }

    public Cadeira(Cor cor) {
        this.cor = cor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Cadeira: cor= " + this.cor + ", " + this.aluno;
    }

}
