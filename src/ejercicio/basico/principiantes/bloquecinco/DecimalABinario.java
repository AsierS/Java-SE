package ejercicio.basico.principiantes.bloquecinco;

import java.util.Scanner;

public class DecimalABinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número para pasar a binario: ");
        int num1 = Integer.parseInt(sc.nextLine());
        int resto1;
        
        while (num1/2!=0 || num1==1) {
        	resto1=num1%2;
        	num1=num1/2;
        	System.out.println(resto1);
        }
		
		
		
		sc.close();
	}

}
