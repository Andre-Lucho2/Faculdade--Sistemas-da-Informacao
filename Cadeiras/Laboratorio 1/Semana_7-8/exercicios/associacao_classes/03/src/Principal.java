public class Principal {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("amaciante", 10.25, 2014, 04, 10);
        Produto produto2 = new Produto("creme dental", 4.90, 2015, 05, 05);
        Produto produto3 = new Produto("leite condensado", 7.40, 2012, 12, 04);

        Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);

        Prateleira prateleira2 = new Prateleira();
        Produto cortina = new Produto("cortina", 167.98, 2025, 10, 13);

        prateleira2.setProduto1(cortina);

        Mercado mercado = new Mercado(prateleira1, prateleira2);

        // mercado.verProdutosVencidosPrat(new Data(2023, 04, 25));
        // mercado.valorMedioProdPrat();
        mercado.valorProdMaisCaroPrat();
    }
}
