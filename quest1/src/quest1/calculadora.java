
package quest1;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,con;
        do{
        System.out.println("Digite 1 numero: ");
        num1 = in.nextInt();
        System.out.println("Digite 2 numero: ");
        num2 = in.nextInt();
        System.out.println("Digite a função que quer da calculadora mo:");
        System.out.println(" 1 - Soma\n 2 - Sub\n 3 - Multi: ");
        int cond = in.nextInt();
        System.out.println("O numero na calculadora é: ");
        if (cond == 1){
        System.out.println("Soma de:"+num1+"+"+num2+"é: "+(num1 + num2));
        }
        if (cond == 2){
        System.out.println("Subtração de:"+num1+"-"+num2+"é: "+(num1 - num2));
        }
        if (cond == 3){
        System.out.println("Multiplicação de"+num1+"x"+num2+"é: "+(num1 * num2));
        }
        else{
            System.out.println("ERRO GATIN MIAUUU!!");
        }
        System.out.println("Deseja Fazer de novo\n 1 -  sim\n 2 - não");
        con = in.nextInt();
        }while(con == 1);
        
    }
}
