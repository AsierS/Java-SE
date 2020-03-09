package exceptions;

import java.io.IOException;

//import java.util.Scanner;

/*
 * Realizar un programa que lance un n�mero aleatorio del 1 al 6. 
 * Seg�n el n�mero sacado, se lanzara una excepci�n u otra de la siguiente lista:
�	1: ArithmeticException
�	2: NullpointerException
�	3: NumberFormatException
�	4: SecurityException
�	5: NegativeArrayException
�	6: IOException
Haciendo uso del try y del catch, mostrar un mensaje por pantalla y 
explicar cu�l es la excepci�n ocurrida. Repetir este proceso de manera 
indefinida, controlando dichas excepciones y sin dar pie 
a que el programa se cuelgue

 *
 */
public class ejercicioExceptionsCampus5 {

	public static void main(String[] args) throws Exception {
		double numAleatorio=0;
		numAleatorio=(Math.random()*6)+1;
		if (numAleatorio==1) {	
			throw new Exception("ArithmeticException");
		} else if (numAleatorio==2){
			throw new Exception("NullPointerException");
		} else if (numAleatorio==3){
			throw new Exception("NumberFormatException");
		} else if (numAleatorio==4){
			throw new Exception("SecurityException");
		} else if (numAleatorio==5){
			throw new Exception("NegativeArraySizeException");
		} else if (numAleatorio==6){
			throw new Exception("IOException");
		}
/*
			} catch (ArithmeticException e) {
				System.out.println("1) Excepci�n aritmetica");
				e.printStackTrace();

			} catch (NullPointerException e) {
				System.out.println("2) Excepci�n nullpointer");
				e.printStackTrace();

			} catch (NumberFormatException e) {
				System.out.println("3) Excepci�n NumberFormatException");
				e.printStackTrace();

			} catch (SecurityException e) {
				System.out.println("4) Excepci�n SecurityException");
				e.printStackTrace();

			} catch (NegativeArraySizeException e) {
				System.out.println("5) Excepci�n NegativeArraySizeException");
				e.printStackTrace();

				} catch (IOException e) {
					System.out.println("6) Excepci�n IOException");
					e.printStackTrace();
			} 

*/		
	}
}