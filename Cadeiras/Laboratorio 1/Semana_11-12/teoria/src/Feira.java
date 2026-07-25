public class Feira {
    private String nome;
    private String[] frutas;
    // frutas é do tipo array de strings

    public Feira(String nome, int quantidadeFrutas){
        this.nome = nome;
        this.frutas = new String[quantidadeFrutas];
        // this.frutas --> recebendo nova instância tipo Array com o seu length passado no momento da contrução de um 
        // novo objeto tipo Feira

        for(int i = 0; i < frutas.length; i++){
            frutas[i] = "";
        }
        // estou percorrendo o array e preenchendo ele com "" vazia
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getFrutas() {
        return frutas;
    }
    public void setFrutas(String[] frutas) {
        this.frutas = frutas;
    }
    // No momento do set, frutas será totalmente substituido por um novo array completo(lista) que será passado
    

    // 1. popula o primeiro index vazio com um novo elem.
    public void insereFruta(String novaFruta){
        for(int i = 0; i < frutas.length; i++){
            if(frutas[i] == ""){
                frutas[i] = novaFruta;
                break;
            }
        }
        // percorrendo o array frutas e , qd encontrar o primeiro index vazio, 
        // insere novo elem. e sai do laço.
    }
    
    // 2. popula o primeiro index vazio com um novo elem e retorna true or false (+ completo).
    public boolean insereFruta2(String novaFruta){
        if(novaFruta == ""){
            return false; // se o novo elem for vazio, não há sentido em add, pois o array já é composto por elem vazios
        } else {
            for(int i = 0; i < frutas.length; i++){
                if(frutas[i] == ""){
                    frutas[i] = novaFruta;
                    return true; // preencehu a posição vazia e retornou feedback == true
                }
            }
            return false; // percorreu todo o array e não achou lugar vazio == false
        }
    }


}
