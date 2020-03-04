package ejercicio.basico.principiantes.bloquesiete;

import java.util.Scanner;

public class NotaAlumnosMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numAlumnos=0;
		int notaTotal=0;
		int notaMedia=0;
		System.out.println("Dime el n�mero de alumnos: ");
		numAlumnos=Integer.parseInt(sc.nextLine());
		double[] notas = new double[numAlumnos];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("�Qu� nota ha sacado el alumno n�mero "+i+"?");
			notas[i]=Integer.parseInt(sc.nextLine());
			notaTotal=(int) (notaTotal+notas[i]);
		}
		notaMedia=notaTotal/numAlumnos;
		System.out.println("La nota media es "+notaMedia+".");
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]>notaMedia) {
				System.out.println("El alumno n�mero "+i+" ha sacado m�s que la media, que es "+notaMedia+". Su nota es "+notas[i]+".");
			}
		}
	sc.close();
	}

}
