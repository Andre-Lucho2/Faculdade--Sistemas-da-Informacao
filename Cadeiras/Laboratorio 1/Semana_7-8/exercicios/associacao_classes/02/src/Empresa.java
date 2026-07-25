public class Empresa {
    private String nome;
    private FuncionarioCaixa funcionario1;
    private FuncionarioCaixa funcionario2;

    public Empresa(String nome, FuncionarioCaixa funcionario1, String nomeFunc, String enderecoFunc, char generoFunc, String corCalculadora) {
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = new FuncionarioCaixa(nomeFunc, enderecoFunc, generoFunc, corCalculadora);
    }
    public Empresa(String nome){
        this.nome = nome;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }
    public Empresa(){
        this.nome = "";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioCaixa getFuncionario1() {
        return funcionario1;
    }
    public void setFuncionario1(FuncionarioCaixa funcionario1) {
        this.funcionario1 = funcionario1;
    }

    public FuncionarioCaixa getFuncionario2() {
        return funcionario2;
    }
    public void setFuncionario2(FuncionarioCaixa funcionario2) {
        this.funcionario2 = funcionario2;
    }

    public void imprimeInfo(){
        System.out.println(
                "Empresa [nome: " + nome + ", funcionario1: " + funcionario1 + ", funcionario2: " + funcionario2 + "]"
        );
    }
    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", funcionario1=" + funcionario1 + ", funcionario2=" + funcionario2 + "]";
    }
    
    
}
