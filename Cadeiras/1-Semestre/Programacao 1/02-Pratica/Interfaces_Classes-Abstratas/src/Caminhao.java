// Caminhão herdando de VeiculoBase
public class Caminhao extends VeiculoBase {
    public Caminhao(String modelo, String placa) {
        super(modelo, placa);
    }

    /*
    Por EXTENDER uma CLASSE ABSTRATA, é obrigatório ter 
    a implementação do método aqui! */
    public void correr(){
        System.out.println("Correndo...");
    };

    @Override
    public void pagarPedagio() {
        System.out.println(modelo + " (Caminhão): Pagou R$100 de tributo.");
    }
}

/*
Obs.:
--------

Qd tenho uma classe que herda de uma superclasse, não tenho a obrigação 
de implementar um método da classe-pai; apenas tenho disponível */ 


