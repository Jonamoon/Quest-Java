package principal;

import contribuintes.Contribuinte;
import java.time.LocalDate;

public class CalculaBeneficios {
    public static void main(String[] args) {
       Contribuinte c1 = new Contribuinte("João da Silva","001-X",LocalDate.of(2012, 4,25),0.11,true,5500);
       Contribuinte c2 = new Contribuinte("Maria Cunha","002-9",LocalDate.of(2011, 6,30),0.10,true,3000);
       Contribuinte c3 = new Contribuinte("Manoel José","003-4",LocalDate.of(1978, 6,30),0.08,true,1500);
       c1.imprimirContribuicaoMensal();
        System.out.println("");
       c2.imprimirContribuicaoMensal();
        System.out.println("");
       c3.imprimirContribuicaoMensal();
    }
}
