package exceptions;

import java.util.Scanner;

/*
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� 
 * y luego calcule �a/b�. Pruebe a introducir b=0 y ver que hace el programa 
 * con la divisi�n por cero. 
 * Pruebe a introducir b=�Carlos� para ver c�mo se comporta el programa. 
 * A�ada excepciones para recoger estas excepciones y avisar del problema al usuario
 *
 */
public class ejercicioExceptionsCampus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		int resultado;
		
		System.out.println("Introduce un n�mero: ");
		try {
			a=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto ten�a que ser un n�mero.");
			//e.printStackTrace();
		}
		
		System.out.println("Introduce otro n�mero: ");
		try {
			b=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto ten�a que ser otro n�mero.");
			//e.printStackTrace();
		}

		resultado=a/b;
		System.out.println("El resultado es "+resultado+".");
		sc.close();
	}

}
