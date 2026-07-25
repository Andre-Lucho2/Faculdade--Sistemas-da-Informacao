public class App {
    public static void main(String[] args) throws Exception {
        Figura circulo1 = new Circulo(5.0);
        Circulo circulo2 = (Circulo) circulo1;
        Circulo circulo3 = new Circulo(5.0);

        Figura retangulo1 = new Retangulo(10.0, 5.0, 6.0, 3.0);
        Retangulo retangulo2 = (Retangulo) retangulo1;

        Figura lado = new Figura(6.0);

        if (circulo2 instanceof Figura) {
            System.out.println("Essa figura é um circulo de área= " + circulo2.calculaArea());
        }
        if (circulo3 instanceof Figura)
            System.out.println(circulo3.calculaArea(lado.getX()));

    }
}

/*
 * 
 * Gerente poliG3 = (Gerente) poliGerente2;
 * poliG3.nomeiaSecretario("Alice3");
 * 
 * // ou
 * ((Gerente) poliGerente2).nomeiaSecretario("Alice2");
 * 
 * 
 */