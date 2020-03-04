package ejercicio.basico.principiantes.bloquesiete;

import java.util.Scanner;

public class DiezNumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] numeros = new int[10];
		float total=0;
		
		System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("Número[" + i + "]=");
            numeros[i]=Integer.parseInt(sc.nextLine());
            if (i%2==0) {
            	total=total+numeros[i];
            }
        }
        System.out.println("La media es "+total/5);
        
        sc.close();

	}
        
}
