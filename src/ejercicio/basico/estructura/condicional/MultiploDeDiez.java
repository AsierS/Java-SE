package ejercicio.basico.estructura.condicional;

import java.util.Scanner;

public class MultiploDeDiez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduzca el n�mero que quieras comprobar:");
		numero = sc.nextInt();

		sc.close();

		if (numero % 10 == 0) {
			System.out.println("El n�mero " + numero + " es m�ltiplo de 10.");
		} else {
			System.out.println("El n�mero " + numero + " no es m�ltiplo de 10.");
		}
	}

}