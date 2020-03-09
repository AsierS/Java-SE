package exceptions;

import java.util.Scanner;

/*
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ 
 * y luego calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa 
 * con la división por cero. 
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. 
 * Añada excepciones para recoger estas excepciones y avisar del problema al usuario
 *
 */
public class ejercicioExceptionsCampus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		int resultado;
		
		System.out.println("Introduce un número: ");
		try {
			a=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto tenía que ser un número.");
			//e.printStackTrace();
		}
		
		System.out.println("Introduce otro número: ");
		try {
			b=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto tenía que ser otro número.");
			//e.printStackTrace();
		}

		resultado=a/b;
		System.out.println("El resultado es "+resultado+".");
		sc.close();
	}

}
