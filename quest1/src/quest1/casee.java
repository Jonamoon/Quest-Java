package quest1;
import java.util.Scanner;
public class casee {  
    public static void main(String[] args) {
        System.out.println("Digite a media: ");
        Scanner in = new Scanner(System.in);
        int nota = in.nextInt();
        
        switch(nota){
            case 1: 
                System.out.println("Vc é um lixo!!");
            case 5:
                System.out.println("Parabens por alguma coisa");
            case 55:
                System.out.println("xuxa eterna rainha sempre, a mulher");
        
        }
        
    }
}
