package quest1;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.print("Digite a Nota:");
        float nota = oi.nextFloat();
        System.out.print("Digite o nome:");
        String nome = oi.nextLine();
        System.out.println("A nota é" + nota);
        System.out.printf("Seu nome é: %s A nota é %.1f", nome , nota);
    }
    
}
