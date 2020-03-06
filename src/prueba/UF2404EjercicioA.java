package prueba;

import java.util.Scanner;

/**
 * <ol>
 * 	<li>Realizar un programa en java que realice la siguiente función: Crear un array de 5 notas que almacenara en formato double.</li>
 * 	<li>Una vez creado dicho array se rellenaran  dichos elementos leyéndolo desde el teclado.</li>
 * 	<li>Una vez creado el contenido, se calculara la media de las notas así como se mostraran las notas más altas y más bajas de dicho array.</li>
 * </ol>
 *@author Curso
 */
public class UF2404EjercicioA {

	public static void main(String[] args) {

		double notaTotal=0;
		double notaMedia=0;
		double notaMax=-8; //suponemos que las notas van de 0 a 10
		double notaMin=999999;
		
		System.out.println("Vamos a calcular la nota media.");
		double[] notas = new double[5];
		Scanner sc = new Scanner(System.in);//abrimos el scanner

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Dime la nota:");
			int nota = Integer.parseInt(sc.nextLine());
			notas[i] = nota;
			notaTotal=(int) (notaTotal+notas[i]);
			if(notas[i]>notaMax) {
				notaMax=notas[i];
			}
			
			if(notas[i]<notaMin) {
				notaMin=notas[i];
			}

		} // for
		
		notaMedia=notaTotal/notas.length;
		System.out.println("La nota media es "+notaMedia+".");
		System.out.println("La máxima es "+notaMax+".");
		System.out.println("La mínima es "+notaMin+".");

		sc.close();//cerramos el scanner
	}//main

}//clase
