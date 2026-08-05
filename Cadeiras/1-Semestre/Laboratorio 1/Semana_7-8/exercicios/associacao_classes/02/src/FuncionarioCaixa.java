public class FuncionarioCaixa {
    private String nome, endereco;
    private char genero;
    private Calculadora calculadora;
    
    public FuncionarioCaixa(String nome, String endereco, char genero, String cor) {
        this.nome = nome;
        this.endereco = endereco;
        this.genero = genero;
        this.calculadora = new Calculadora(cor);
    }
    public FuncionarioCaixa(){
        this.nome = null;
        this.endereco = null;
        this.genero = ' ';
        this.calculadora = null;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double soma(double a, double b){
        return this.calculadora.soma(a, b);
    }
    public double subtrai(double a, double b){
        return this.calculadora.subtrai(a, b);
    }
    public double multiplica(double a, double b){
        return this.calculadora.multiplica(a, b);
    }
    public double divide(double a, double b){
        return this.calculadora.divide(a, b);
    }

    public int elevaAoQuadrado(int a){
        return this.calculadora.elevaAoQuadrado(a);
    }
    public int elevaAoCubo(int a){
        return this.calculadora.elevaAoCubo(a);
    }

    public void imprimeInfo() {
        System.out.println("FuncionarioCaixa [nome:" + nome + ", endereco:" + endereco + ", genero:" + genero + ", calculadora: "
                + calculadora + "]");
    }
    @Override
    public String toString() {
        return "FuncionarioCaixa [nome=" + nome + ", endereco=" + endereco + ", genero=" + genero + ", calculadora=" + calculadora + "]";
    }

}
