package poojava;

public class Poojava {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.modelo = "Caneta azul bic";
        c1.carga = 1;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
