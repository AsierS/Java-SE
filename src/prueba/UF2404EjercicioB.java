package prueba;

import java.util.Scanner;

/**
 *<ol>
 *	<li>Crear un proyecto en modo consola que nos muestre un menú de 3 opciones</li>
 *	<li>	Calcular la letra del dni</li>
 *	<li>	Calcular medida de cm a pulgadas</li>
 *	<li>	Salir</li>
 *	<li>	Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el usuario escoge cada una de las funciones, que permita introducir los datos correspondientes por teclado para poder dar el resultado</li>
 *</ol>
 * @author Curso
 *
 */
public class UF2404EjercicioB {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean continuar=true;
		int opcion;
		do {
			System.out.println("Elige la opción que prefieras");
			System.out.println("1) Calcular la letra del DNI.");
			System.out.println("2) Pasar de cm a pulgadas.");
			System.out.println("3) Salir.");
			
			opcion=Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
				case 1:
					sacarLetraDNI();
					break;
				case 2:
					pasarCentimetrosAPulgadas();
					break;
				case 3:
					System.out.println("Nos vemos. Salvo que yo no tengo ojos. Vamos, márchate.");
					continuar=false;
					break;
			}			
		} while (continuar);//do while
		sc.close();
	}//main
	private static void pasarCentimetrosAPulgadas() {
		double cm;
		double pulgadas;
		System.out.println("Vamos a pasar de centímetros a pulgadas. Dime un número: ");
		cm=Integer.parseInt(sc.nextLine());
		pulgadas=cm*0.39370;
		System.out.println(cm+" centímetros son "+pulgadas+" pulgadas.");
		
	}//fin de pasarCentimetrosAPulgadas()
	private static void sacarLetraDNI() {
		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		System.out.println("Dime el DNI para sacar la letra.");
		int numeroDni=Integer.parseInt(sc.nextLine());
		int restoDivision = numeroDni % 23;
		System.out.println("La letra es del DNI "+numeroDni+" es " + LETRA_DNI[restoDivision]+".");
		
	}//fin de sacarLetraDNI()

}//clase
