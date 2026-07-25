public class Classica extends Musica {
    private Cordas instrumento1;
    private Cordas instrumento2;
    private Cordas instrumento3;

    public Classica(String nome) {
        super(nome);

        this.instrumento1 = new Violino("Strad");
        this.instrumento2 = new Viola("Yamaha");
        this.instrumento3 = new Viola("Yamaha");
    }

    @Override
    public void reproduzir() {
        instrumento1.afinar();
        instrumento1.tocar();

        instrumento2.afinar();
        instrumento2.tocar();

        instrumento3.afinar();
        instrumento3.tocar();

        Log.printBlue("Classica", "Tocando a nona sinfonia de Beethoven");
    }

}
