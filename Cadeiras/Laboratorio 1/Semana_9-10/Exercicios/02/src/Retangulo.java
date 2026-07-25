public class Retangulo extends Figura {
    private double base;
    private double altura;
    private String algo;

    public Retangulo(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double x, double y) {
        super(x, y);
    }

    public Retangulo(double x) {
        super(x);
    }

    public Retangulo(double base, double altura, String algo) {
        this.base = base;
        this.altura = altura;
        this.algo = algo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea(double base, double altura) {
        return (base * altura);
    }

    @Override
    public String toString() {
        return "Retangulo- base= " + this.base + ", altura= " + altura;
    }

}
