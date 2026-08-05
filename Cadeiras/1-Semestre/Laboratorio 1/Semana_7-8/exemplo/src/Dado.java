public class Dado {
    private int lados;

    public Dado(int lados){
        this.lados = lados;
    }

    public void jogarDado(){
        System.out.println("Jogando o Dado...");
    }

    @Override
    public String toString(){
        return String.format("Dado com %d lados", lados);
    }
}
