package exceptions;

import java.util.Scanner;

/*
 *
 *Realice un programa que nos solicite por teclado dos n�meros, 
 *y leerlos usando la clase Scanner mediante la funci�n nextLine().
 * Transformar ambos strings a n�meros enteros usando la siguiente 
 * sentencia Integer.parseInt(numeroLeido). Agrupar el c�digo entre un bloque try
 *  catch y procesar para que no se produzca una interrupci�n y finalizaci�n del
 *   programa si alguno de los n�meros le�dos no puede convertirse, retomando el 
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
		System.out.println("Introduce un n�mero: ");
		try {
			a=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto ten�a que ser un n�mero.");
			a=0;
			//e.printStackTrace();
		}
		} while(a==0);
		
		int b=1;
		do {
		System.out.println("Introduce otro n�mero: ");
		try {
			b=Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Esto ten�a que ser otro n�mero.");
			b=0;
			//e.printStackTrace();
		}
		} while(b==0);

		resultado=a/b;
		System.out.println("El resultado es "+resultado+".");
		sc.close();
	}

}
