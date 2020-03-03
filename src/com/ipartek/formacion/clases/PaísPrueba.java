package com.ipartek.formacion.clases;

import java.util.Scanner;

public class PaísPrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declara un array con dos países inicializados a Null
		País[] paises = new País[2];
		
		//dos objetos
		//españa, ncasos 27
		//francia, ncasos 6548
		//mostrar en consola los datos
		
		
		
		País España = new País();
		España.setNombre("España");
		España.setNcasos(27);
		paises[0] = España;
		
		País Francia = new País();
		Francia.setNombre("Francia");
		Francia.setNcasos(6548);
		paises[1]= Francia;
		
		for (int i = 0; i < paises.length; i++) {
			País paisActual=paises[i];
			System.out.println("El país "+paisActual+" tiene "+paises[i].getNcasos()+".");
		}
		
		/*System.out.println("El país es: "+España.getNombre());
		System.out.println("Hay "+España.getNcasos()+" casos de patata.");
		
		System.out.println("El país es: "+Francia.getNombre());
		System.out.println("Hay "+Francia.getNcasos()+" casos de patata.");
		*/
		sc.close();
	}

}
