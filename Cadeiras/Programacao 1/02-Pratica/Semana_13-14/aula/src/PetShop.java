public class PetShop {
    private Cliente[] clientes;
    private Funcionario[] funcionarios;
    private Produto[] produtos;
    int locacaoCliente = 0;

    public PetShop(int quantCliente, int quantFuncionario, int quantProduto) {
        this.clientes = new Cliente[quantCliente];
        this.funcionarios = new Funcionario[quantFuncionario];
        this.produtos = new Produto[quantProduto];
    }

    public Cliente[] getClientes() {
        return this.clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Funcionario[] getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Produto[] getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public boolean cadastrarCliente(Cliente aCliente){
        if(locacaoCliente == clientes.length -1) return false; 
        // poupa entrar no for, se a array estiver cheia == não posso cadastrar novo
        
        for(int i = 0; i< clientes.length; i++){
            if(clientes[i] == null){
                clientes[i] = aCliente;
                locacaoCliente++;
                return true;
            } 
        }
        return false;
    }


    public boolean cadastrarFuncionario(Funcionario aFuncionario) {
        if (funcionarios[funcionarios.length - 1] != null) {
            System.out.println("O array de clientes está cheio. Não é possível adicionar mais clientes.");
            return false;
        }

        // Procura por um espaço vazio no array para adicionar o novo cliente
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = aFuncionario;
                return true;
            }
        }
        return false;
    }

    public boolean cadastrarProduto(Produto aProduto) {
        if (produtos[produtos.length - 1] != null) {
            System.out.println("O array de clientes está cheio. Não é possível adicionar mais clientes.");
            return false;
        }

        // Procura por um espaço vazio no array para adicionar o novo cliente
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = aProduto;
                return true;
            }
        }
        return false;
    }

    public String printClientes(){
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null){
                sb.append("Nome: " + clientes[i].getNome() + ", ");
                sb.append("Pets: ");
                
                for(Pet aPet : clientes[i].getPet()){
                    if(!clientes[i].hasPet()){
                        sb.append(aPet.getNome());
                    }
                sb.append("\n");
                }
            }
        }
        return "a";
    }

    public String printProdutos() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < produtos.length; i++) {
            sb.append(produtos[i].getNomeProduto() + ", ");
        }
        return sb.toString();
    }

    public Cliente buscaCliente(String aNome) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getNome().equals(aNome)) {
                return clientes[i];
            }
        }
        return null;
    }

    public Funcionario buscarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null; // Return null if no matching funcionario is found
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equals(nome)) {
                return produto;
            }
        }
        return null; // Return null if no matching produto is found
    }

    public boolean excluirCliente(Cliente aCliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (funcionarios[i] != null && clientes[i].equals(aCliente)) {
                funcionarios[i] = null; // Mark the element as removed (nullify it)
                return true; // Return true indicating successful removal
            }
        }
        return false; // Return false if the funcionario is not found or not removed
    }

    public boolean excluirFuncionario(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null && funcionarios[i].equals(funcionario)) {
                funcionarios[i] = null; // Mark the element as removed (nullify it)
                return true; // Return true indicating successful removal
            }
        }
        return false; // Return false if the funcionario is not found or not removed
    }

    public boolean excluirProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].equals(produto)) {
                produtos[i] = null; // Mark the element as removed (nullify it)
                return true; // Return true indicating successful removal
            }
        }
        return false; // Return false if the produto is not found or not removed
    }
}
