package ejercicio.basico.principiantes;

import java.util.Scanner;

// Ejercicio para hacer la media de 3 números que pediremos por pantalla
public class MediaNumeros {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		float media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número: ");
		numero1 = Integer.parseInt(sc.nextLine()); // lee una línea que el usuario introduce
		
		System.out.println("Dime el segundo número: ");
		numero2 = Integer.parseInt(sc.nextLine()); // lee una línea que el usuario introduce
		
		System.out.println("Dime el tercer número: ");
		numero3 = Integer.parseInt(sc.nextLine()); // lee una línea que el usuario introduce
		
		media = (numero1 + numero2 + numero3)/3.0f;
		System.out.println("La media es: " + media +".");
		
		sc.close();
	}

}
