package ejercicio.basico.principiantes.bloquecuatro;

import java.util.Scanner;

public class UnoNWhileForDoWhile {

	public static void main(String[] args) {
		// que pida por teclado el valor de un número N y muestre por pantalla todos los números desde 1 hasta N

		Scanner sc = new Scanner(System.in);
		System.out.println("Esto hace de 1 a N. Introduzca el número N: ");
	    int n = sc.nextInt();
		
	    int contador=1;
		do {
			System.out.println("Do: "+contador);
			contador++;
		} while (contador<n+1);
		
		contador=1;
		for (int i = 1; i < n+1; i++) {
			System.out.println("For: "+i);
		}
		
		contador=1;
		while (contador<n+1) {
			System.out.println("While: "+contador);
			contador ++;
		}
		sc.close();
	}

}
