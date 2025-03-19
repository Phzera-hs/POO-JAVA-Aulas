

public class TesteBicicleta {

    public static void main(String[] args) {
        bicicleta caloi = new bicicleta();
        caloi.nome = "caloi";
        caloi.marcha = 5;
        caloi.modelo = "ABC-123";

        bicicleta monark = new bicicleta();
        monark.nome = "bruta";
        monark.marcha = 3;
        monark.modelo = "circular";

        
        caloi.imprimir();
        monark.imprimir();
    }


}
