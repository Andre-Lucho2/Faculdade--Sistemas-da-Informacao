public class ArquivoTexto extends Arquivo{
    private int x;

    public ArquivoTexto(int a, int b){
        super(a); // int t
        this.x = b;
    }

    @Override
    public int mA(){
        return super.mA() * 2;
        // return this.x *2;
    }

    @Override
    public void mB(){}

    // Exclusivo
    public void mC(){}

}

