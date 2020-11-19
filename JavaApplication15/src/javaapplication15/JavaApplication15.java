
package javaapplication15;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        String[] linhaLida = linha.split(" ");
        Integer num = 0;
        boolean numValido = true;
        for(String i : linhaLida) {
    		numValido = true;
        	try {
        		num = Integer.parseInt(i);
        	} catch(NumberFormatException e) {
        		System.out.println("Formato de número inválido!");
        		numValido = false;
        	} finally {
        		if(numValido) {
        			System.out.println(num*10);
        		}
        	}
        }
        scanner.close();
	}
    
}
