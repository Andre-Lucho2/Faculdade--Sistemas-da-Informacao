public class Violino extends Cordas {

    public Violino(String marca) {
        super("Violino", marca, 4, "nylon");
    }

    @Override
    public void tocar() {
        System.out.println("Violino toca notas agudas com arco");
    }
}