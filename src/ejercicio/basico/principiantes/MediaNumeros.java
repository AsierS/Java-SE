package ejercicio.basico.principiantes;

import java.util.Scanner;

// Ejercicio para hacer la media de 3 n�meros que pediremos por pantalla
public class MediaNumeros {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		float media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer n�mero: ");
		numero1 = Integer.parseInt(sc.nextLine()); // lee una l�nea que el usuario introduce
		
		System.out.println("Dime el segundo n�mero: ");
		numero2 = Integer.parseInt(sc.nextLine()); // lee una l�nea que el usuario introduce
		
		System.out.println("Dime el tercer n�mero: ");
		numero3 = Integer.parseInt(sc.nextLine()); // lee una l�nea que el usuario introduce
		
		media = (numero1 + numero2 + numero3)/3.0f;
		System.out.println("La media es: " + media +".");
		
		sc.close();
	}

}
