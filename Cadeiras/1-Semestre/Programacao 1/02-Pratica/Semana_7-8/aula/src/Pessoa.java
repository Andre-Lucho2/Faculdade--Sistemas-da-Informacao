public class Pessoa{
    private String nome;
    private int idade;
    private String endereco;
    private String cpf;

    public Pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isCPFValido(String cpf){
        // 3454456666 = 33,44,55
        int sum = 0;
        for (int i=0; i<cpf.length(); i++){
            sum += Character.getNumericValue(cpf.charAt(i));
        }

        if(sum == 44 || sum == 33 || sum == 55)
            return true;
        return false;
    }

    // Exemplo de sobreescrita de método - to String()
    public String toString(){
        String str =  "Cliente : "  +  this.getNome() + "\n";
        str +=  "Endereco: " + this.getEndereco();
        return str;
    }
}