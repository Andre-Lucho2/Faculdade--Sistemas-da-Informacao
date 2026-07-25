package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Agencia> agencias;

    public Banco() {
        agencias = new ArrayList<>();
    }

    public void adicionarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    @Override
    public String toString() {
        String resultado = "Banco:\n";
        for (Agencia agencia : agencias) {
            resultado += agencia.toString() + "\n";
        }
        return resultado;
    }
}