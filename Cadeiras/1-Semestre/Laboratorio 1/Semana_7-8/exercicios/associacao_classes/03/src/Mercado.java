public class Mercado {
    private Prateleira prateleira1;
    private Prateleira prateleira2;

    public Mercado(Prateleira prateleira1, Prateleira prateleira2) {
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }

    public Prateleira getPrateleira1() {
        return prateleira1;
    }

    public Prateleira getPrateleira2() {
        return prateleira2;
    }

    public void valorProdMaisCaroPrat() {
        Prateleira[] prateleiras = { this.prateleira1, this.prateleira2 };

        int contador = 1;
        for (Prateleira prat : prateleiras) {
            if (prat != null) {
                System.out
                        .println("A prateleira " + contador + " tem como o produto mais caro -> "
                                + prat.produtoMaisCaroArray());
            }
            contador++;
        }

    }

    public void valorMedioProdPrat() {
        Prateleira[] prateleiras = { this.prateleira1, this.prateleira2 };

        int contador = 1;
        for (Prateleira prat : prateleiras) {
            if (prat != null) {
                System.out
                        .println("A prateleira " + contador + " tem uma media nos valores dos produtos igual a: R$"
                                + prat.mediaPrecos());
            }
            contador++;
        }
    }

    public void verProdutosVencidosPrat(Data data) {
        Prateleira[] prateleiras = { this.prateleira1, this.prateleira2 };

        for (Prateleira prateleira : prateleiras) {
            if (prateleira != null) {
                for (Produto produto : prateleira.getTodosProdutos()) {
                    if (produto != null) {
                        if (produto.verificaProdutoVencido(data)) {
                            System.out.println("Produto Vencido -> " + produto);
                        } else {
                            System.out.println("Produto Válido -> " + produto.getNome());
                        }
                    }
                }
            }
        }
    }

}
