package exceptions;

import java.util.Scanner;

/*
 *
 *Realice un programa que nos solicite por teclado dos números, 
 *y leerlos usando la clase Scanner mediante la función nextLine().
 * Transformar ambos strings a números enteros usando la siguiente 
 * sentencia Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try
 *  catch y procesar para que no se produzca una interrupción y finalización del
 *   programa si alguno de los números leídos no puede convertirse, retomando el 
 *   control en el punto del fallo, hasta que se solucione
 */
public class ejercicioExceptionsCampus2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a=0;
		//int b=1;
		int resultado;
		
		int a=1;
		do {
		System.out.println("Introduce un número: ");
		try {
			a=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto tenía que ser un número.");
			a=0;
			//e.printStackTrace();
		}
		} while(a==0);
		
		int b=1;
		do {
		System.out.println("Introduce otro número: ");
		try {
			b=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto tenía que ser otro número.");
			b=0;
			//e.printStackTrace();
		}
		} while(b==0);

		resultado=a/b;
		System.out.println("El resultado es "+resultado+".");
		sc.close();
	}

}
