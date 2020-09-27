package quest1;
import java.util.Scanner;
public class menor {
    public static void main(String[] args) {
    System.out.println("Entre com a quantidade de números: ");
        Scanner entrada = new Scanner(System.in);
                // lendo a quantidade do array
                int quantidadeNumeros = entrada.nextInt();
		// setando para dentro do array a quantidade
		int[] numeros = new int[quantidadeNumeros];
                // inserindo os numeros dentro do array
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.printf("Entre com o %dº número:%n", (i+1));
			numeros[i] = entrada.nextInt();
		}
		
		int menor = Integer.MAX_VALUE;
                System.out.println(numeros.length);
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.printf("O menor número é: %d%n", menor);
	}
}
