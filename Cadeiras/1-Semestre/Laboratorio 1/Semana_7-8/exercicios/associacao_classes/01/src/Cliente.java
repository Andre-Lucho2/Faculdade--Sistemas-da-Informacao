public class Cliente {
    private String nome, email, senha;
    private int idade;
    private char genero;
    private Livro livro;

    public Cliente(String nome, String email, String senha, int idade, char genero, Livro livro) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.genero = genero;
        this.livro = livro;
    }

    public Cliente(String nome, String email, String senha, int idade, char genero, String titulo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.genero = genero;
        this.livro = new Livro(titulo);
    }

    public Cliente(String nome, String email, String senha, int idade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // Encapsulamento
    public String getTituloLivro(){
        if(this.livro != null){
            return this.livro.getTitulo();
        }
        return "O cliente não possui nenhum livro";
    }

    public double getPrecoPorPaginaLivro(){
        if(this.livro != null){
            return this.livro.calcularPrecoPorPagina();
        }
        return 0.0;
    }

    public void imprimeInformacoes() {
        System.out.println(
                "Cliente [nome=" + nome + ", email=" + email + ", senha=" + senha + ", idade=" + idade + ", genero=" + genero + ", livro=" + livro + "]"
        );
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Email: %s | Senha: %s | Idade: %d | Sexo: %c | Livro: %s", nome, email, senha, idade, genero, getLivro());
    }
    

}
