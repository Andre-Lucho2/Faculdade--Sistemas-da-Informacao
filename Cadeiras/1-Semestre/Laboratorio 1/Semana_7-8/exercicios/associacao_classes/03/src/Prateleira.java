import java.util.Arrays;
import java.util.Objects;

public class Prateleira {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    public Prateleira(Produto produto1, Produto produto2, Produto produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }

    public Prateleira(Produto produto1, Produto produto2) {
        this.produto1 = produto1;
        this.produto2 = produto2;
    }

    public Prateleira(Produto produto1) {
        this.produto1 = produto1;
    }

    public Prateleira() {
        this.produto1 = null;
        this.produto2 = null;
        this.produto3 = null;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }

    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }

    public Produto[] getTodosProdutos() {
        return new Produto[] { this.produto1, this.produto2, this.produto3 };
    }

    public Produto produtoMaisCaro() {
        Produto maisCaro = null;

        if (this.produto1 != null) {
            maisCaro = this.produto1;
        }

        if (this.produto2 != null) {
            if (maisCaro == null || this.produto2.getPreco() > maisCaro.getPreco()) {
                maisCaro = this.produto2;
            }
        }
        if (this.produto3 != null) {
            if (maisCaro == null || this.produto3.getPreco() > maisCaro.getPreco()) {
                maisCaro = this.produto3;
            }
        }

        return (maisCaro != null) ? maisCaro : new Produto();
    };

    public Produto produtoMaisCaroArray() {
        Produto[] produtos = { this.produto1, this.produto2, this.produto3 };
        Produto maisCaro = null;

        for (Produto prod : produtos) {
            if (prod != null) {
                if (maisCaro == null || prod.getPreco() > maisCaro.getPreco()) {
                    maisCaro = prod;
                }
            }
        }

        return (maisCaro != null) ? maisCaro : new Produto();
    }

    // método compara somente se nenhum dos 3 elementos for vazio:

    // public Produto produtoMaisCaro1(){
    // double p1 = this.getProduto1().getPreco();
    // double p2 = this.getProduto2().getPreco();
    // double p3 = this.getProduto3().getPreco();

    // if(produto1 != null && produto2 != null && produto3 !=null){
    // double maiorPreco = Math.max(p1, Math.max(p2, p3));

    // int opcao = (maiorPreco == p1) ? 1 : (maiorPreco == p2 ? 2 : 3);

    // switch (opcao) {
    // case 1:
    // return this.produto1;
    // case 2:
    // return this.produto2;
    // default:
    // return this.produto3;
    // }

    // }
    // return new Produto();
    // }

    public double mediaPrecos() {
        Produto[] produtos = { this.produto1, this.produto2, this.produto3 };
        int contador = 0;
        double soma = 0.0;

        for (Produto p : produtos) {
            if (p != null) {
                soma += p.getPreco();
                contador++;
            }
        }

        if (contador > 0) {
            return soma / contador;
        }

        return 0.0;
    }

    public double mediaPrecosComMetodoArray() {
        Produto[] produtos = { this.produto1, this.produto2, this.produto3 };

        return Arrays.stream(produtos)
                .filter(Objects::nonNull) // Remove os espaços vazios (null)
                .mapToDouble(Produto::getPreco) // Extrai apenas o preço de cada produto
                .average() // Tenta calcular a média
                .orElse(0.0); // Se não houver produtos, retorna 0.0
    }

    @Override
    public String toString() {
        return "Prateleira: produto1: " + produto1 + ", produto2: " + produto2 + ", produto3: " + produto3 + "]";
    }

}
