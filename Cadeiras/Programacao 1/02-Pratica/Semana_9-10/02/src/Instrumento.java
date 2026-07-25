public class Instrumento {
    protected String nome;
    protected String marca;

    public Instrumento(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public void tocar() {
        System.out.println(nome + " está sendo tocado.");
    }

    public void afinar() {
        System.out.println(nome + " está sendo afinado.");
    }

    public void mostrarInfo() {
        System.out.println("Instrumento: " + nome);
        System.out.println("Marca: " + marca);
    }
}

// classes que herdam protected não precisam de getters e setters