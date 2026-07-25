public class CadeiraComRodinhas extends Cadeira {
    private Data data;

    public CadeiraComRodinhas(Aluno aluno, Cor cor, Data data) {
        super(aluno, cor);
        this.data = data;
    }

    public CadeiraComRodinhas(Aluno aluno, Cor cor) {
        super(aluno, cor);
    }

    public Data getDAta() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cadeira Com Rodinhas: Aluno: " + super.getAluno() + ", cor: " + super.getCor()
                + "data última manutenção: " + this.data;
    }

}
