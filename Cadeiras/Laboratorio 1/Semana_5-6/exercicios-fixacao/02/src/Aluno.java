public class Aluno {
    private String nome;
    private int matricula;
    private double notaA;
    private double notaB;

    public Aluno(String nome, int matricula, double notaA, double notaB) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaA = notaA;
        this.notaB = notaB;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public double getNotaA() {
        return notaA;
    }
    public double getNotaB() {
        return notaB;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }
    public void setNotaB(double notaB) {
        this.notaB = notaB;
    }

    public double calculaMediaFinal(){
        double media = (this.notaA * 0.33) + (this.notaB * 0.67);
        return media;
    }

    public void imprimeInfo(){
        System.out.println(String.format("Nome: %s, Matricula: %d, Nota A: %.2f, Nota B: %.2f, Media Final: %.2f", nome, matricula, notaA, notaB, calculaMediaFinal()));
    }
}
