public class Livro {
    private String titulo;
    private int anoPublicacao;
    private double preco;
    private int paginas;

    public Livro(String titulo, int anoPublicacao, double preco, int paginas){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.paginas = paginas;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }

    public int getPaginas(){
        return this.paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public double calcularPrecoPorPagina(){
        double precoPorPagina = this.preco / this.paginas;
        return precoPorPagina;
    }
    
    @Override
    public String toString(){
        return String.format("Livro - Titulo: %s | Ano de Publicacao: %d | Preço: %.2f | Número de Páginas: %d | Preço por página: %.2f", titulo, anoPublicacao, preco, paginas, calcularPrecoPorPagina());
    }

    
}



/*
Transformando Tipos primitivos
---------------------------------
casting implícito de int para double == o tipo int cabe em double --> convertido automaticamente.

Casting explicito - tranformar um double em int

Ex. 
int novoPreco = (int) this.preco;

*/    
