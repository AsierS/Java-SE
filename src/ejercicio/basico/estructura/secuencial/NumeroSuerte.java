package ejercicio.basico.estructura.secuencial;

import java.util.Scanner;

public class NumeroSuerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dianacimiento;
		int mesnacimiento;
		int añonacimiento;
		int totalnacimiento;
		int numsuerte;
		System.out.println("Introduzca su fecha de nacimiento según lo especificado.");
		System.out.println("Introduzca el día:");
		dianacimiento = sc.nextInt();
		System.out.println("Introduzca el mes:");
		mesnacimiento = sc.nextInt();
		System.out.println("Introduzca el año:");
		añonacimiento = sc.nextInt();

		totalnacimiento = dianacimiento + mesnacimiento + añonacimiento;

		numsuerte = (totalnacimiento/1000) + (totalnacimiento/100%10) + (totalnacimiento/10%100) + (totalnacimiento/1%1000);
		System.out.println("Tu número de la suerte es: " + numsuerte);
		//System.out.println(totalnacimiento/1000);
	    //System.out.println(totalnacimiento/100%10);
	    //System.out.println(totalnacimiento/10%100);
	    //System.out.println(totalnacimiento/1%1000);

	}

}
/*
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, año) y calcule su número de la suerte. El número de la suerte se calcula
 * sumando el día, mes y año de la fecha de nacimiento y a continuación sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
 * 28 Número de la suerte: 28
 */