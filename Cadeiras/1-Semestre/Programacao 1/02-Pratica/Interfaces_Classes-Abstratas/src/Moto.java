public class Moto extends VeiculoBase {
    public Moto(String modelo, String placa) {
        super(modelo, placa);
    }

    public void correr(){
        
    }

    @Override
    public void pagarPedagio() {
        System.out.println(modelo + " (Moto): Pagou R$20 de tributo.");
    }
}