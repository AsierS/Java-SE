package ejercicio.basico.principiantes.bloquecinco;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Dame un n�mero N.");
		num=Integer.parseInt(sc.nextLine());

		System.out.println("�sta es la tabla de multiplicar del n�mero "+num);
		for (int i = 1; i < 11; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		sc.close();
	}

}
