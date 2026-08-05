public static void calculaMedia2(){
    Aluno a = new Aluno(0, 0);
    a.calculaMedia(0, 0);
}



public class Aluno {
    private int peso1;
    private int peso2;

    public Aluno(int peso1, int peso2){
        this.peso1 = peso1;
        this.peso2 = peso2;
    }

    public void calculaMedia(int peso1, int peso2){
        System.out.println((peso1 * peso2)/2);
    }

}
