// Classe Principal
public class Freeway {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota Corolla", "ABC-1234");
        Veiculo moto = new Moto("Honda CB500", "XYZ-5678");
        Veiculo caminhao = new Caminhao("Volvo FH", "JKL-9876");

        Pedagio pedagio = new Pedagio();

        System.out.println("🔹 Iniciando cobrança de tributos na Freeway...\n");

        carro.exibirInfo();
        pedagio.cobrarTributo(carro);
        carro.acelerar();
        carro.frear();
        
        System.out.println();

        moto.exibirInfo();
        pedagio.cobrarTributo(moto);
        moto.acelerar();
        moto.frear();
        
        System.out.println();

        caminhao.exibirInfo();
        pedagio.cobrarTributo(caminhao);
        caminhao.acelerar();
        caminhao.frear();
    }
}
