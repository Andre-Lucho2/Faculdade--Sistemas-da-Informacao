public class CalcularDesconto {
    public static void main(String[] args) {
    int preco = 10;
     switch (preco) {
        case 10:
           System.out.println("O novo preço é: " + (preco*0.9));
           break;
        case 20:
           System.out.println("O novo preço é: " + (preco*0.8));
           break;
        case 50:
           System.out.println("O novo preço é: " + (preco*0.7));
           break;
        case 100:
           System.out.println("O novo preço é: " + (preco*0.6));
           break;
        default:
          System.out.println("Não há descontos disponíveis para esse valor!");
     }
    }
}
