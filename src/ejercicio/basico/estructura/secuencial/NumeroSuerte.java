package ejercicio.basico.estructura.secuencial;

import java.util.Scanner;

public class NumeroSuerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dianacimiento;
		int mesnacimiento;
		int a�onacimiento;
		int totalnacimiento;
		int numsuerte;
		System.out.println("Introduzca su fecha de nacimiento seg�n lo especificado.");
		System.out.println("Introduzca el d�a:");
		dianacimiento = sc.nextInt();
		System.out.println("Introduzca el mes:");
		mesnacimiento = sc.nextInt();
		System.out.println("Introduzca el a�o:");
		a�onacimiento = sc.nextInt();

		totalnacimiento = dianacimiento + mesnacimiento + a�onacimiento;

		numsuerte = (totalnacimiento/1000) + (totalnacimiento/100%10) + (totalnacimiento/10%100) + (totalnacimiento/1%1000);
		System.out.println("Tu n�mero de la suerte es: " + numsuerte);
		//System.out.println(totalnacimiento/1000);
	    //System.out.println(totalnacimiento/100%10);
	    //System.out.println(totalnacimiento/10%100);
	    //System.out.println(totalnacimiento/1%1000);

	}

}
/*
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
 * 28 N�mero de la suerte: 28
 */