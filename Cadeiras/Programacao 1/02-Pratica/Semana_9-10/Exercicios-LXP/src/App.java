public class App {
    public static void main(String[] args) throws Exception {

        Arquivo meuArquivo = new ArquivoBinario(7);

        ArquivoBinario ab = (ArquivoBinario) meuArquivo;
        
        System.out.println(ab.mC());

        ArquivoBinario b = new ArquivoBinario(1);

        System.out.println(b.mA());
        
        // ArquivoBinario.mC()
    }
}
