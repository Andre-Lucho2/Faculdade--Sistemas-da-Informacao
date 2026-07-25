public class ExemploComparacaoStrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        // Comparando as Strings usando o operador ==
        if(str1 == str2) {
            System.out.println("str1 e str2 são o mesmo objeto");
        } else {
            System.out.println("str1 e str2 não são o mesmo objeto");
        }

        if(str1 == str3) {
            System.out.println("str1 e str3 são o mesmo objeto");
        } else {
            System.out.println("str1 e str3 não são o mesmo objeto");
        }

        // Comparando as Strings usando o método equals()
        if(str1.equals(str2)) {
            System.out.println("str1 e str2 possuem o mesmo valor");
        } else {
            System.out.println("str1 e str2 não possuem o mesmo valor");
        }

        if(str1.equals(str3)) {
            System.out.println("str1 e str3 possuem o mesmo valor");
        } else {
            System.out.println("str1 e str3 não possuem o mesmo valor");
        }
    }
}
