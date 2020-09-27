package quest1;
import java.util.Scanner;
public class potenciacão {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Base: ");
        int base = in.nextInt();
        System.out.println("Digite o Expoente: ");
        int expo = in.nextInt();
        int r = 1;
        for(int c = 1;c <= expo; c++){
            r = r * base;
        }
        System.out.println(+base+" Elevado ao expoente "+expo+" é: "+r);
        
    }
}
