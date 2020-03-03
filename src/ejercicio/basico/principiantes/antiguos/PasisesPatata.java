package ejercicio.basico.principiantes.antiguos;

import java.util.Scanner;

// for) 0...N --- while) 0...N --- do while) 1...N
//array países. preguntamos por algo. si es que sí->tal. si es que no->tal otra cosa
public class PasisesPatata {

	public static void main(String[] args) {
		final String[] PAISES = {"Noruega", "Alemania", "República Checa", "Italia"};
		boolean[] paisesPatatizados = {false, false, false, false};
		int[] numeroPatatas = {0, 0, 0, 0};
		String hayInfectados;
		int numeroInfectados=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < PAISES.length; i++) {
			System.out.println("¿Hay infectados de patata en " + PAISES[i] +"?");
			hayInfectados=sc.nextLine();
			if ("sí".equalsIgnoreCase(hayInfectados)) {
				
				System.out.println("¿Cuántos infectados de patata hay en " + PAISES[i] +"?");
				//numeroPatatas[i]=Integer.parseInt(sc.nextInt());
				int pregunta2 = Integer.parseInt(sc.nextLine());
				
				paisesPatatizados[i]=true;
				numeroPatatas[i]=pregunta2;
				
				numeroInfectados += numeroPatatas[i];
			} else if("sí".equalsIgnoreCase(hayInfectados)) {
				paisesPatatizados[i]=false;
			}
		}
		
		for (int i=0; i < PAISES.length; i++) {
			if (paisesPatatizados[i]==true && numeroPatatas[i]>2) {
					System.out.println(PAISES[i]+" está infectado.");
					System.out.println("Aquí hay "+numeroPatatas[i]+" infectados.");
			} else {
				System.out.println(PAISES[i]+" no está infectado.");
			}
		}
		System.out.println("El total de infectados es de "+numeroInfectados+" personas.");
		sc.close();
			
		//paisesPatatizados[1]=true;
		//numeroInfectados[1]=5;
		
		//recorrer países y preguntar si existe algún caso de patata
		//si hay, preguntamos número de infectados
		//mostramos países libres
		//mostramos países infectados junto con el número de ellos
		//total infectados
	}
}