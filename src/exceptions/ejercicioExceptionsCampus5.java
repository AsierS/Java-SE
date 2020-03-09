package exceptions;

import java.io.IOException;

//import java.util.Scanner;

/*
 * Realizar un programa que lance un número aleatorio del 1 al 6. 
 * Según el número sacado, se lanzara una excepción u otra de la siguiente lista:
•	1: ArithmeticException
•	2: NullpointerException
•	3: NumberFormatException
•	4: SecurityException
•	5: NegativeArrayException
•	6: IOException
Haciendo uso del try y del catch, mostrar un mensaje por pantalla y 
explicar cuál es la excepción ocurrida. Repetir este proceso de manera 
indefinida, controlando dichas excepciones y sin dar pie 
a que el programa se cuelgue

 *
 */
public class ejercicioExceptionsCampus5 {

	public static void main(String[] args) throws Exception {
		double numAle2=0;
		numAle2=(Math.random()*6)+1;
		int numAleatorio=(int) numAle2;
		if (numAleatorio==1) {
			System.out.println("ArithmeticException");
			try {
				throw new ArithmeticException("ArithmeticException");
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (numAleatorio==2){
			System.out.println("NullPointerException");
			try {
				throw new NullPointerException("NullPointerException");
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (numAleatorio==3){
			System.out.println("NumberFormatException");
			try {
				throw new NumberFormatException("NumberFormatException");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (numAleatorio==4){
			System.out.println("SecurityException");
			try {
				throw new SecurityException("SecurityException");
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (numAleatorio==5){
			System.out.println("NegativeArraySizeException");
			try {
				throw new NegativeArraySizeException("NegativeArraySizeException");
			} catch (NegativeArraySizeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (numAleatorio==6){
			System.out.println("IOException");
			try {
				throw new IOException("IOException");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  else {
			throw new Exception("Excepción genérica.");
		}
	}
}