public class Pessoa {
    private double peso;
    private double altura;

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String situacaoIMC() {
        double imc = calcularIMC();

        if (imc > 30.0) {
            return "Problema";
        } else {
            return "Normal";
        }
    }
}