public class App {
    public static void main(String[] args) throws Exception {
        Funcionario func1 = new Funcionario("André", 5000, 0);
        func1.exibeDados();

        Gerente gerente1 = new Gerente("Alex", 4000, 2, "Alice");

        gerente1.exibeDados();

        // Polimorfismo
        Funcionario poliGerente2 = new Gerente("Ricardo", 4200, 2);

        Funcionario poliVendedor = new Vendedor("José", 3000, 0);

        // 1)
        poliGerente2.exibeDados(); // exibe os dados do método sobreescrito

        // 2)
        // poliGerente2.nomeiaSecretario("Alice2"); // erro

        // 3)
        Gerente poliG3 = (Gerente) poliGerente2;
        poliG3.nomeiaSecretario("Alice3");

        // ou
        ((Gerente) poliGerente2).nomeiaSecretario("Alice2");

        /*
         * 1) Upcasting
         * A const "poliGerente2" do tipo Funcionario recebe uma nova instância de
         * Gerente --> chamamos isso de Upcasting (subclasse se passando por uma
         * superclasse)
         * 
         * acima, poliGerente2 está apontando para a classe Gerente
         * 
         * Como isso é possível?
         * Pq Gerente também é um Funcionário, já que ele herda seus atributos e métodos
         * Chamamos isso de Polimorfismo
         * 
         * 
         * 2)
         * poliGerente2 é um Funcionário(superclasse) que está apontando para a classe
         * Gerente (subclasse)
         * Então, poliGerente2 não é um Gerente -- logo, não pode chamar métodos +
         * específicos
         * 
         * 
         * 3) Downcasting
         * Coerção - força o Funcionário 'poliG3' a se passar por Gerente e dai chamar
         * sua classe específica(Gerente)
         * 
         * 
         * OBS.: Utilizamos geralmente o polimorfismo para classes com metodos
         * sobreescritos.....
         * para métodos específicos --> Downcasting
         */

    }
}
