package ejercicio.basico.principiantes.bloquetres;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		/*
		 * Programa que lea dos n�meros por teclado y 
		 * muestre el resultado de la divisi�n del 
		 * primer n�mero por el segundo.
		 * Se debe comprobar que el divisor no puede ser cero.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
        float num1 = sc.nextInt();
        System.out.println("Introduce otro n�mero: ");
        float num2 = sc.nextInt();
        
        if (num2==0) {
        	System.out.println("No se puede dividir entre cero, es ilegal.");
        } else {
        	System.out.println(num1+"/"+num2+"="+num1/num2);
        }
        sc.close();
	}

}
