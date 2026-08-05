public class Viola extends Cordas {

    public Viola(String marca) {
        super("Viola", marca, 4, "aço");
    }

    @Override
    public void tocar() {
        System.out.println("Viola toca sons mais encorpados tb possui arco");
    }
}