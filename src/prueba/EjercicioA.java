package prueba;

import java.util.Scanner;

/**
 * Ejercicio para Lorem Ipsum....
 * 
 * @author ur00
 *
 */
public class EjercicioA {

	public static void main(String[] args) {

		int alturaTotal=0;
		int alturaMedia=0;
		int alturaMax=0;
		int alturaMin=999999;
		
		System.out.println("Empezamos");
		int[] alturas = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Dime un numero:");
			int altura = Integer.parseInt(sc.nextLine());
			alturas[i] = altura;
			alturaTotal=(int) (alturaTotal+alturas[i]);
			if(alturas[i]>alturaMax) {
				alturaMax=alturas[i];
			}
			
			if(alturas[i]<alturaMin) {
				alturaMin=alturas[i];
			}

			
			// TODO altura maxima
			// TODO altura minima

		} // for
		
		alturaMedia=alturaTotal/alturas.length;
		System.out.println("La altura media es "+alturaMedia+".");
		System.out.println("La máxima es "+alturaMax+".");
		System.out.println("La mínima es "+alturaMin+".");
		System.out.println("Agur Venur");

		sc.close();

	}// main

}// clase
