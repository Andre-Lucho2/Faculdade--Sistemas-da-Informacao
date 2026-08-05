public class Circulo extends Figura {
    private double raio;

    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public Circulo(double x, double y) {
        super(x, y);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculaArea(double raio) {
        return (3.14 * raio);
    }

    public double calculaArea() {
        return (3.14 * this.raio);
    }

    @Override
    public String toString() {
        return "Circulo - raio= " + this.raio;
    }

}
