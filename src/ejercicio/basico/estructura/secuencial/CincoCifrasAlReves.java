package ejercicio.basico.estructura.secuencial;

import java.util.Scanner;

public class CincoCifrasAlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numerochachi;
		System.out.println("Introduzca un número de cinco cifras: ");
		numerochachi = sc.nextInt();

		System.out.println(numerochachi % 10);
		System.out.println(numerochachi % 100);
		System.out.println(numerochachi % 1000);
		System.out.println(numerochachi % 10000);
		System.out.println(numerochachi % 100000);
	}
}
/*
 * Programa Java que lea un número entero N de 5 cifras y muestre sus cifras
 * igual que en el ejemplo. Por ejemplo para un número N = 12345 La salida debe
 * ser:
 * 
 * 5 45 345 2345 12345
 */