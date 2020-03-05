package prueba;

import java.util.Scanner;

/**
 * Comentar la jugada....
 * @see url de la página chachi
 * @author ur00
 * 
 */
public class EjercicioB {

	static Scanner sc = new Scanner(System.in);;
	public static void main(String[] args) {
		int opcion = 0;
		boolean continuar = true;
		
		do {

			System.out.println("1. Calcular letra DNI");
			System.out.println("2. Convertir de pies a metros");
			System.out.println("3. salir");
			System.out.println("Por favor selecciona una opcion del 1 al 3");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				letraDni();
				break;

			case 2:
				calcularPies();
				break;

			case 3:
				System.out.println("Hasta pronto");
				continuar = false;
				break;

			default:
				System.out.println("Por favor selecciona una opcion valida");
				break;

			}// switch

		} while (continuar);

		sc.close();

	}// main

	private static void calcularPies() {
		int pies;
		int metros;
		System.out.println("pedir pies para convetior a metros");
		pies=Integer.parseInt(sc.nextLine());
		metros=pies*4;
		System.out.println(pies+" pies son "+metros+" metros.");
	}

	private static void letraDni() {
		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		System.out.println("pedir DNI para sacar la letra");
		int numeroDni=Integer.parseInt(sc.nextLine());
		//String dniTexto = "12345678";
		//int numeroDni = Integer.parseInt(dniTexto);

		int restoDivision = numeroDni % 23;

		System.out.println("La letra es " + LETRA_DNI[restoDivision]);
	}

}// clase
