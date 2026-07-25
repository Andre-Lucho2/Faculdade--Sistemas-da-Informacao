public class Calculadora {
    private String cor;
    private int memoria;

    public Calculadora(String cor){
        this.cor = cor;
        this.memoria = 0;
    }

    public String getCor() {
        return cor;
    }
    public int getMemoria() {
        return memoria;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double soma(double a, double b){
        return a + b;
    }
    public double subtrai(double a, double b){
        return a - b;
    }
    public double multiplica(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        return a / b;
    }

    public int elevaAoQuadrado(int a){
        return (int) Math.pow(a, 2);
    }
    public int elevaAoCubo(int a){
        return (int) Math.pow(a, 3);
    }

    public void imprimeInfo(){
        System.out.println("=== Informações da Calculadora ===");
        System.out.println("Cor: " + this.cor);
        System.out.println("Memória: " + this.memoria);
    }

    @Override
    public String toString() {
        return "Calculadora [Cor: " + this.cor + ", Memória: " + this.memoria + "]";
    }
}
