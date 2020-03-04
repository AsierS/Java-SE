package ejercicio.basico.principiantes.bloquetres;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		/*
		 * Programa que lea dos números por teclado y 
		 * muestre el resultado de la división del 
		 * primer número por el segundo.
		 * Se debe comprobar que el divisor no puede ser cero.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
        float num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        float num2 = sc.nextInt();
        
        if (num2==0) {
        	System.out.println("No se puede dividir entre cero, es ilegal.");
        } else {
        	System.out.println(num1+"/"+num2+"="+num1/num2);
        }
        sc.close();
	}

}
