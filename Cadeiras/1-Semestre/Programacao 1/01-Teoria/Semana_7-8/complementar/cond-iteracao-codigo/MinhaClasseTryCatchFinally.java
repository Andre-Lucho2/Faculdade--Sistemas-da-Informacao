public class MinhaClasseTryCatchFinally {
    public static void main(String[] args) {
      try{
        int x = 10;
        int y = 0; // alteração aqui
        int z;
        z = x/y;

        String texto = "abc123";
        int numero;
        try {
            numero = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("erro na formatação numerica.");
            numero = 0;
        }

        System.out.println(z);
        System.out.println(numero); // imprimir o número convertido
      }
      catch (ArithmeticException e){
        System.out.println("Erro na operação aritmética.");
      }   
      catch (Exception e){
        System.out.println("Um erro ocorreu.");
      }
      finally{
        System.out.println("Bloco try-catch finalizado.");
      }
    }
}