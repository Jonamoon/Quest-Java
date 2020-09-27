
package quest1;
import java.util.Scanner;
public class NewClass2 {
    public static void main(String[] args) {
        System.out.println("Digite a idade do seu cachorro em meses: ");
        Scanner in = new Scanner(System.in);
        int c_idade = in.nextInt();
        c_idade = c_idade * 12;
        System.out.println("A idade do cachorro em anos humanos é: "+ c_idade );
    }
}
