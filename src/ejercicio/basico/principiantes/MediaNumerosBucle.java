package ejercicio.basico.principiantes;

import java.util.Scanner;

// for) 0...N --- while) 0...N --- do while) 1...N
public class MediaNumerosBucle {

	public static void main(String[] args) {
		/*int numero1, numero2, numero3;
		float media;
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Dime el primer número: ");
		numero1 = Integer.parseInt(sc.nextLine()); // lee una línea que el usuario introduce
		
		System.out.println("Dime el segundo número: ");
		numero2 = Integer.parseInt(sc.nextLine()); // lee una línea que el usuario introduce
		
		System.out.println("Dime el tercer número: ");
		numero3 = Integer.parseInt(sc.nextLine()); // lee una línea que el usuario introduce
		
		media = (numero1 + numero2 + numero3)/3.0f;
		System.out.println("La media es: " + media +".");
		
		sc.close();
		*/
		Scanner sc = new Scanner(System.in);
		boolean terminar = true;
		float numero, total=0,contador=0;
		
		do {
			System.out.println("Dime un número: ");
			numero=Float.parseFloat(sc.nextLine());
			total=total+numero;
			
			System.out.println("¿Quieres terminar? Escribe 'sí'");
			String linea = sc.nextLine();
			if ( linea.equalsIgnoreCase("sí")) {
				terminar = false;
			}
			contador++;
			//terminar=Boolean.parseBoolean(sc.nextLine());
		} while(terminar!=false);
		
		System.out.println("El total es: "+total+".");
		System.out.println("La media es: "+ total/contador+".");
		
		sc.close();
	}

}
