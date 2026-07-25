// Classe abstrata que implementa parte do comportamento
public abstract class VeiculoBase implements Veiculo {
    protected String modelo;
    protected String placa;
    protected double velocidade;

    // Somente assinatura do método correr() - sem seu corpo == classe abstrata
    // As classes que herdarem seu conteúdo, terão obrigatoriamente que implementar esse método
    public abstract void correr();

    public VeiculoBase(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = 0;
    }

    // Parte da implementação da Interface:
    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println(modelo + " acelerou. Velocidade atual: " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 10);
        System.out.println(modelo + " freou. Velocidade atual: " + velocidade + " km/h.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Placa: " + placa);
    }

}
