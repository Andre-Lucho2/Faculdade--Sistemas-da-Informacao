
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void lerFile(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        br.close();
    }
    public static void main(String[] args) {
        
        //exceção não verificada
        int x = 10/0;

        // excecao verificada
        try {
            lerFile("caminho");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
