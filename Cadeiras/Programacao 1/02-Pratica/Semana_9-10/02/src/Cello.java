public class Cello extends Cordas {

    public Cello(String marca) {
        super("Cello", marca, 4, "aço");
    }

    @Override
    public void tocar() {
        System.out.println("Cello toca sons graves e possui um arco de crina");
    }
}
