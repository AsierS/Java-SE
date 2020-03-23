package com.ipartek.formacion.clases.animales;

import java.util.Scanner;

public class Perro extends Mamífero {
	public void guau() {
		int espera=1;
		Scanner sc = new Scanner(System.in);//abrimos el scanner
		System.out.println("1)Podemos hacer más cosas que un sysout con esto.");
		System.out.println("2)Lo que pasa es que como esto es un perro");
		System.out.println("3)Hace que perdamos tiempo.");
		System.out.println("4)De hecho, al estar antes que el resto, parece que esto casca.");
		System.out.println("5)Pulsa un número entero para seguir u otra cosa si quieres romper esto.");
		espera=Integer.parseInt(sc.nextLine());
		sc.close();
		
	}
}
