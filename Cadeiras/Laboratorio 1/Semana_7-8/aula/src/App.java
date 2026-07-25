public class App {
    public static void main(String[] args) throws Exception {
        
        // 1
        Pessoa andre = new Pessoa("Andre", 44);

        Carro carroPessoa = new Carro("Renault", "Clio", 2008);
        // // instanciando o obj 'carroPessoa'

        Pessoa pessoaComCarro = new Pessoa("Fulano", 40, carroPessoa);
        // // instanciando o obj 'pessoaComCarro' associado ao obj 'carroPessoa'

        // // Qd instancio o obj 'pessoaComCarro' e passo como parâmetro o objeto 'carroPessoa' estou APONTANDO esse carroPessoa para o ENDEREÇO DE MEMÓRIA da instância 'carroPessoa'

        // // 2
        // // Outra forma de instanciar um obj de Pessoa associando a classe Carro:
        Pessoa novaPessoaComCarro = new Pessoa("outra pessoa", 20, new Carro("Fiat", "Uno", 1990));
        

        // Carro novo = new Carro("Renault", "Clio", 2010);
        // // instanciando o obj Carro 'novo' (sem associacao)

        // Carro velho = new Carro("Volks", "Siena");
        // // instanciando o obj Carro 'velho' (sem associacao)

        // // System.out.println(andre);
        // System.out.println(pessoaComCarro);
        // // System.out.println(pessoaComCarro.getCarro());

        // System.out.println(novaPessoaComCarro);



        // System.out.println(velho); // usa o valor padrão do tipo 'int' para o ano
    }
}
