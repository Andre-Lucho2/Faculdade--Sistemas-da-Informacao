public class Assento {
    
    private FlightTicket ticket;
    private int numeroAssento;
    
    public Assento(FlightTicket ticket, int numeroAssento) {
        this.ticket = ticket;
        this.numeroAssento = numeroAssento;
    }
    
    public FlightTicket getTicket() {
        return ticket;
    }
    public void setTicket(FlightTicket ticket) {
        this.ticket = ticket;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }
    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
}
