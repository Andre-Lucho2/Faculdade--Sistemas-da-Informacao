public class App {
    public static void main(String[] args) throws Exception {
        Funcionario listaFunc[] = new Funcionario[5];

        Gerente gerent1 = new Gerente();
        Vendedor vended1 = new Vendedor();

        listaFunc[0] = gerent1;
        listaFunc[1] = vended1;

        for(Funcionario func : listaFunc){
            System.out.println(func);
            if(func != null && func instanceof Vendedor){
                // downcasting + metodo especifico
            }
        }
    }
}
