public class Livro {
    private String titulo, autor;
    private int anoPublicacao, paginas;
    private double preco;
    
    public Livro(String titulo, String autor, int anoPublicacao, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.paginas = paginas;
        this.preco = preco;
    }

    public Livro(String titulo, String autor, int anoPublicacao, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.paginas = paginas;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoPorPagina(){
        double precoPorPagina = this.preco/this.paginas;
        return precoPorPagina;
    }

    @Override
    public String toString(){
        return String.format("Livro - Titulo: %s | Autor: %s | Ano Publicacao: %d | N Páginas: %d | Preco: %.2f", titulo, autor, anoPublicacao, paginas, preco);
    }
}
