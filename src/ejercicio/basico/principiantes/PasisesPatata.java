package ejercicio.basico.principiantes;

import java.util.Scanner;

// for) 0...N --- while) 0...N --- do while) 1...N
//array pa�ses. preguntamos por algo. si es que s�->tal. si es que no->tal otra cosa
public class PasisesPatata {

	public static void main(String[] args) {
		final String[] PAISES = {"Noruega", "Alemania", "Rep�blica Checa", "Italia"};
		boolean[] paisesPatatizados = {false, false, false, false};
		int[] numeroPatatas = {0, 0, 0, 0};
		boolean hayInfectados = false;
		int numeroInfectados;
		int numeroInfectadosTotal=0;
		Scanner sc = new Scanner(System.in);

		for (int i=0; i < PAISES.length; i++) {
			System.out.println("�Hay infectados de patata en " + PAISES[i] +"? True si hay, false si no.");
			hayInfectados=Boolean.getBoolean(sc.nextLine());
			System.out.println(hayInfectados);
			if (hayInfectados==true) {
				paisesPatatizados[i]=true;
				System.out.println("�Cu�ntos infectados de patata hay en " + PAISES[i] +"?");
				numeroPatatas=sc.nextLine();
				numeroInfectadosTotal += numeroInfectados;
			} else if(hayInfectados==false) {
				paisesPatatizados[i]=false;
			}
		}
		for (int i=0; i < PAISES.length; i++) {
			if (paisesPatatizados[i]==true) {
				System.out.println(PAISES[i]+" est� infectado.");
				System.out.println("Aqu� hay "+numeroPatatas[i]+" infectados.");
			} else {
				System.out.println(PAISES[i]+"no est� infectado.");
			}
			
				
		}
			
		//paisesPatatizados[1]=true;
		//numeroInfectados[1]=5;
		
		//recorrer pa�ses y preguntar si existe alg�n caso de patata
		//si hay, preguntamos n�mero de infectados
		//mostramos pa�ses libres
		//mostramos pa�ses infectados junto con el n�mero de ellos
		//total infectados
	}
}