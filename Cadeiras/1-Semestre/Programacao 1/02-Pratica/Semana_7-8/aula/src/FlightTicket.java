public class FlightTicket {
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private String voucherNumero;
    private Pessoa passageiro;

    public FlightTicket(String aeroportoOrigem, String aeroportoDestino, String voucherNumero, Pessoa passageiro) {
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.voucherNumero = voucherNumero;
        this.passageiro = passageiro;
    }

    public String toString(){
        return ("Origem: " + this.aeroportoOrigem);
    }
    
}
