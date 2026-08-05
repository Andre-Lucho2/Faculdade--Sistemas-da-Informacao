public class PrincipalProduto{
    public static void main(String[] args){
        String nomeProduto = Teclado.leString("Digite o nome do seu produto:");
        double precoProduto = Teclado.leDouble("Digite o preço do seu produto:");
        
        Produto p = new Produto(nomeProduto, precoProduto);
        
        p.imprimeInformacoes();
    }
}