public class MinhaClasseDoWhile {
    public static void main(String[] args) {
      int i = 10;
      int sum = 0;
      do{
          sum = sum + i;
          i = i+1;
      }
      while (i <= 5);
      System.out.println(sum);  
    }
  }
