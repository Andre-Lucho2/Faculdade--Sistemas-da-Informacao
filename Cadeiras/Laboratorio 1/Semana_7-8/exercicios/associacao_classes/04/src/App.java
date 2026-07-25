public class App {
    public static void main(String[] args) throws Exception {
        Pagina pag = new Pagina(new Figura(new Cor(10, 57, 93)));

        pag.getFigura().getCor().setG(200);

    }
}
