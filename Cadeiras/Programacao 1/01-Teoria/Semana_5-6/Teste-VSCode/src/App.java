import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Artigo artigo = new Artigo("Java Sem Complicações", new Autor("André"), LocalDate.of(2026, 3, 30), new Categoria("Backend"));
        
        // System.out.println(artigo);

    }

}
