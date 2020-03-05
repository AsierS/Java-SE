package prueba;

import java.util.Scanner;

/**
 * Queremos sacar un menú por pantalla
 * Las opciones del menú van a ser:
 * 1) decir la letra del DNI
 * 2) decir si un número es par o impar
 * 3) codificar o descodificar un string
 * 4) salir
 * @author Curso
 *
 */
public class MenuPrueba {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcion=0;
		boolean continuar = true;
		do {
			System.out.println("1) Sacar la letra del DNI.");
			System.out.println("2) Comprobar si un número es par o impar.");
			System.out.println("3) Codificar o descodificar una línea.");
			System.out.println("4) Salir del programa.");
			
			opcion=Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				sacarLetraDNI();
				break;
			case 2:
				parOImpar();
				break;
			case 3:
				codificar();
				break;
			case 4:
				System.out.println("Nos vemos. Salvo que yo no tengo ojos. Vamos, márchate.");
				continuar=false;
				break;
			}
			
		} while (continuar);
		
		sc.close();
	}

	private static void codificar() {
		int textoCodificar;
		
		System.out.println("¿Quieres codificar el texto? 1 para sí, 2 para no.");
		textoCodificar = Integer.parseInt(sc.nextLine());
		if (textoCodificar==1) {
			System.out.println("Vamos a codificar un texto. Dame una frase para trabajar.");
			String descodificado=sc.nextLine();
			String codificado=descodificado;
			
			codificado=codificado.replace('e', '3');
			codificado=codificado.replace('a', '4');
			codificado=codificado.replace('o', '0');
			codificado=codificado.replace('i', '1');
			System.out.println(codificado);
		} else {
			System.out.println("Vamos a descodificar un texto. Dame una frase para trabajar.");
			String codificado=sc.nextLine();
			String descodificado=codificado;
			
			descodificado=descodificado.replace('3', 'e');
			descodificado=descodificado.replace('4', 'a');
			descodificado=descodificado.replace('0', 'o');
			descodificado=descodificado.replace('1', 'i');
			System.out.println(descodificado);
		}
		
	}

	private static void parOImpar() {
		System.out.println("Dime el número con el que trabajar.");
		int num=Integer.parseInt(sc.nextLine());
		if (num%2==0) {
			System.out.println("El número "+num+" es par.");
		} else {
			System.out.println("El número "+num+" es impar.");
		}
		
	}

	private static void sacarLetraDNI() {
			final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
					'V', 'H', 'L', 'C', 'K', 'E' };
			System.out.println("Dime el DNI para sacar la letra.");
			int numeroDni=Integer.parseInt(sc.nextLine());
			int restoDivision = numeroDni % 23;
			System.out.println("La letra es del DNI "+numeroDni+" es " + LETRA_DNI[restoDivision]+".");
		}

}
