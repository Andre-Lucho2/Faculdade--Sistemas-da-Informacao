public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("andre", 44, 9);

        pessoa.setDado(new Dado(5));

        System.out.println(pessoa.getDado1());


        System.out.println(pessoa.getDado());
        pessoa.jogarDado();
        // pessoa.getDado().jogarDado(); não orientado a objetos

    }
}
