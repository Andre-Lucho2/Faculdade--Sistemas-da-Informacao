public class App {
    public static void main(String[] args) throws Exception {
        Empregado emp = new Empregado("Andre", 'n', 3000.00);

        // System.out.println(emp.calculaAdicionalNoturno());
        System.out.println(emp.toString());

        emp.aumentaSalario(1000.00);

        System.out.println(emp.toString());

        MaterialEscolar mat;
        mat = new MaterialEscolar(3321, "caderno", 100);
        System.out.println(mat);

    }
}
