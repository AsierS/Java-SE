package ejercicio.basico.principiantes.antiguos;

import java.util.Scanner;

// for) 0...N --- while) 0...N --- do while) 1...N
public class MediaNumerosFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float temperatura,min=999999,max=-2000,total=0;
		int contador=0;
	 	
		final String[] DIASEMANA = {"lunes", "martes", "mi�rcoles", "jueves", "viernes", "s�bado", "domingo"};
		
		for (int i=0; i < DIASEMANA.length; i++) {
			System.out.println("Dime la temperatura (en �) del "+DIASEMANA[i]+".");
			temperatura=Float.parseFloat(sc.nextLine());
			
			if (temperatura<min) {
				min=temperatura;
			}
			if (temperatura>max) {
				max=temperatura;
			}
			total=temperatura+total;
			contador++;
		}
		
		System.out.println("La temperatura m�nima es: "+min+"�.");
		System.out.println("La temperatura m�xima es: "+max+"�.");
		System.out.println("La temperatura media es: "+total/contador+"�.");
		
		sc.close();
	}
}