package com.ipartek.formacion.clases;

import java.util.Scanner;

public class Pa�sPrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declara un array con dos pa�ses inicializados a Null
		Pa�s[] paises = new Pa�s[2];
		
		//dos objetos
		//espa�a, ncasos 27
		//francia, ncasos 6548
		//mostrar en consola los datos
		
		
		
		Pa�s Espa�a = new Pa�s();
		Espa�a.setNombre("Espa�a");
		Espa�a.setNcasos(27);
		paises[0] = Espa�a;
		
		Pa�s Francia = new Pa�s();
		Francia.setNombre("Francia");
		Francia.setNcasos(6548);
		paises[1]= Francia;
		
		for (int i = 0; i < paises.length; i++) {
			Pa�s paisActual=paises[i];
			System.out.println("El pa�s "+paisActual+" tiene "+paises[i].getNcasos()+".");
		}
		
		/*System.out.println("El pa�s es: "+Espa�a.getNombre());
		System.out.println("Hay "+Espa�a.getNcasos()+" casos de patata.");
		
		System.out.println("El pa�s es: "+Francia.getNombre());
		System.out.println("Hay "+Francia.getNcasos()+" casos de patata.");
		*/
		sc.close();
	}

}
