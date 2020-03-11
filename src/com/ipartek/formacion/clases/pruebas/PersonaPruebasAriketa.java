package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.AlumnoAriketa;
import com.ipartek.formacion.clases.PersonaAriketa;
import com.ipartek.formacion.clases.ProfesorAriketa;

public class PersonaPruebasAriketa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProfesorAriketa ander = new ProfesorAriketa();
		AlumnoAriketa luz = new AlumnoAriketa();
		AlumnoAriketa juno = new AlumnoAriketa();
		
		//System.out.println(ander.toString());
		
		//TODO array alumnos para meterle a cada uno el nombre y resto de datos
		
		
		ander.setAltura(170);
		ander.setEdad(30);
		ander.setNombre("Ander");
		ander.setSueldo(99999);
		
		luz.setNombre("Luz");
		luz.setEdad(20);
		luz.setEmail("patata@patata.com");
		//luz.setNota(8);
		luz.setGenero("Patata");
		
		// preguntar nota
		System.out.println("Dime la nota: ");
		luz.setNota(Integer.parseInt(sc.nextLine()));
		
		
		juno.setNombre("Juno");
		juno.setEdad(23);
		juno.setEmail("macarrones@patata.com");
		juno.setNota(10);
		juno.setGenero("Mujer");
		
		System.out.println("La altura es "+ander.getAltura());
		System.out.println("La edad es "+ander.getEdad());
		System.out.println("El nombre es "+ander.getNombre());
		System.out.println("El sueldo es "+ander.getSueldo());
		
		System.out.println("La altura es "+luz.getAltura());
		System.out.println("La edad es "+luz.getEdad());
		System.out.println("El nombre es "+luz.getNombre());
		System.out.println("La nota es "+luz.getNota());
		System.out.println("El género es "+luz.getGenero());
		
		System.out.println("La altura es "+juno.getAltura());
		System.out.println("La edad es "+juno.getEdad());
		System.out.println("El nombre es "+juno.getNombre());
		System.out.println("La nota es "+juno.getNota());
		System.out.println("El género es "+juno.getGenero());

	}

}
