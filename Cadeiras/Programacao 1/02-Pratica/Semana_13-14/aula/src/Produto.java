public class Produto {
    private String nomeProduto;
    private float vlrProduto;
    private String descricao;

    public Produto(String nomeProduto, float vlrProduto, String descricao){
        this.descricao= descricao;
        this.nomeProduto =nomeProduto;
        this.vlrProduto = vlrProduto;
    }

    public Produto(String nomeProduto, double vlrProduto){
        this.nomeProduto =nomeProduto;
        this.vlrProduto = (float) vlrProduto;
    }


    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getVlrProduto() {
        return this.vlrProduto;
    }

    public void setVlrProduto(float vlrProduto) {
        this.vlrProduto = vlrProduto;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
