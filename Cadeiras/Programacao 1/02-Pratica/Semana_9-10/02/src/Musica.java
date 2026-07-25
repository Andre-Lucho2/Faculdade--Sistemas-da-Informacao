public class Musica {
    private String nome;

    public Musica(String nome) {
        this.nome = nome;
    };

    public Musica() {
    };

    public void reproduzir() {
        System.out.println(nome + "está tocando...");
    }

}
