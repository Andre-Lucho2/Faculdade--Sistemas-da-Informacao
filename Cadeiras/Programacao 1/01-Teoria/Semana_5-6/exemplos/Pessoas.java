public class Pessoas {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoas(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String situacaoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Você está abaixo do peso ideal";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Parabéns - você está em seu peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Você está acima de seu peso sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}