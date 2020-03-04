package ejercicio.basico.principiantes.bloquesiete;

import java.util.Scanner;

public class NotaAlumnosMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numAlumnos=0;
		int nota=0;
		int notaTotal=0;
		int notaMedia=0;
		System.out.println("Dime el número de alumnos: ");
		numAlumnos=Integer.parseInt(sc.nextLine());
		double[] notas = new double[numAlumnos];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("¿Qué nota ha sacado el alumno número "+i+"?");
			nota=Integer.parseInt(sc.nextLine());
			notaTotal=notaTotal+nota;
		}
		notaMedia=notaTotal/numAlumnos;
		System.out.println("La nota media es "+notaMedia+".");
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[nota]>notaMedia) {//aquí casca
				System.out.println("El alumno número "+notas[i]+" ha sacado más que la media. Su nota es "+notas[nota]);
			}
		}
	sc.close();
	}

}
