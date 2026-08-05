package banco;


import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Cliente> clientes;

    public Agencia() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        String resultado = "Agencia:\n";
        for (Cliente cliente : clientes) {
            resultado += cliente.toString() + "\n";
        }
        return resultado;
    }
}