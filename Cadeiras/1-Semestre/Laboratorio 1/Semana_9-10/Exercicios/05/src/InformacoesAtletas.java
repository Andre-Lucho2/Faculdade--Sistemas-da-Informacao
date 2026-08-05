public class InformacoesAtletas {
    private Nadador nadador;
    private Corredor corredor;

    public void imprimeExclusivosAtleta(Atleta a) {
        if (a instanceof Nadador) {
            System.out.println("É um nadador, e sua categoria é " + nadador.getCategoria());
        } else if (a instanceof Corredor) {
            System.out.println("É um corredor, e o peso deste corredor é " + corredor.getPeso());
        } else {
            System.out.println("O atleta não é um nadador, nem um corredor");
        }
    }
}
