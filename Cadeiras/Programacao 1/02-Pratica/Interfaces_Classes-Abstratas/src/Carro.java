public class Carro extends VeiculoBase {
    public Carro(String modelo, String placa) {
        super(modelo, placa);
    }

    public void correr(){};


    @Override
    public void pagarPedagio() {
        System.out.println(modelo + " (Carro): Pagou R$50 de tributo.");
    }
}
