public class Cordas extends Instrumento {
    protected int numeroDeCordas;
    protected String tipoDeCordas;

    public Cordas(String nome, String marca, int numeroDeCordas, String tipoDeCordas) {
        super(nome, marca);
        this.numeroDeCordas = numeroDeCordas;
        this.tipoDeCordas = tipoDeCordas;
    }

    @Override
    public void afinar() {
        System.out.println(nome + " está sendo afinado ajustando as cordas.");
    }

    public void mostrarDetalhes() {
        mostrarInfo();
        System.out.println("Número de cordas: " + numeroDeCordas);
        System.out.println("Tipo de corda: " + tipoDeCordas);
    }
}