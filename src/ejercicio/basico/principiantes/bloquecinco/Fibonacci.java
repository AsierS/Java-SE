package ejercicio.basico.principiantes.bloquecinco;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=1;
		int num2=1;
		int n; //hacemos de 1 a N
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esto hace la serie Fibonacci de 1 a N. Mete N.");
		n=Integer.parseInt(sc.nextLine());
		
		System.out.println(num1);
		
		for (int i = 0; i <= n; i++) {
			num2=num1+num2;
			num1=num2-num1;
			System.out.println(num1);
		}
		
		sc.close();
		
	}

}
