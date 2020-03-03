package ejercicio.basico.principiantes.antiguos;

import java.util.Scanner;

// for) 0...N --- while) 0...N --- do while) 1...N
//array pa�ses. preguntamos por algo. si es que s�->tal. si es que no->tal otra cosa
public class PasisesPatata {

	public static void main(String[] args) {
		final String[] PAISES = {"Noruega", "Alemania", "Rep�blica Checa", "Italia"};
		boolean[] paisesPatatizados = {false, false, false, false};
		int[] numeroPatatas = {0, 0, 0, 0};
		String hayInfectados;
		int numeroInfectados=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < PAISES.length; i++) {
			System.out.println("�Hay infectados de patata en " + PAISES[i] +"?");
			hayInfectados=sc.nextLine();
			if ("s�".equalsIgnoreCase(hayInfectados)) {
				
				System.out.println("�Cu�ntos infectados de patata hay en " + PAISES[i] +"?");
				//numeroPatatas[i]=Integer.parseInt(sc.nextInt());
				int pregunta2 = Integer.parseInt(sc.nextLine());
				
				paisesPatatizados[i]=true;
				numeroPatatas[i]=pregunta2;
				
				numeroInfectados += numeroPatatas[i];
			} else if("s�".equalsIgnoreCase(hayInfectados)) {
				paisesPatatizados[i]=false;
			}
		}
		
		for (int i=0; i < PAISES.length; i++) {
			if (paisesPatatizados[i]==true && numeroPatatas[i]>2) {
					System.out.println(PAISES[i]+" est� infectado.");
					System.out.println("Aqu� hay "+numeroPatatas[i]+" infectados.");
			} else {
				System.out.println(PAISES[i]+" no est� infectado.");
			}
		}
		System.out.println("El total de infectados es de "+numeroInfectados+" personas.");
		sc.close();
			
		//paisesPatatizados[1]=true;
		//numeroInfectados[1]=5;
		
		//recorrer pa�ses y preguntar si existe alg�n caso de patata
		//si hay, preguntamos n�mero de infectados
		//mostramos pa�ses libres
		//mostramos pa�ses infectados junto con el n�mero de ellos
		//total infectados
	}
}