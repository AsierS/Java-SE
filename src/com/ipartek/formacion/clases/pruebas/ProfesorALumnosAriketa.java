package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.AlumnoProfe;
import com.ipartek.formacion.clases.PersonaProfe;
import com.ipartek.formacion.clases.ProfesorProfe;

public class ProfesorALumnosAriketa {

	public static void main(String[] args) {

		ProfesorProfe profesor = new ProfesorProfe();
		profesor.setNombre("Einstein");
		profesor.setMateria("Fisica cuantica");

		// crear un array de Alumnos
		AlumnoProfe[] alumnos = new AlumnoProfe[3];

		AlumnoProfe jaimito = new AlumnoProfe();
		jaimito.setNombre("Jaimito");
		jaimito.setGenero(PersonaProfe.GENERO_MASCULINO);
		jaimito.setNota(AlumnoProfe.NOTA_MAX);

		AlumnoProfe jaimita = new AlumnoProfe();
		jaimita.setNombre("Jaimita");
		jaimita.setGenero(PersonaProfe.GENERO_FEMENINO);
		jaimita.setNota(9);

		AlumnoProfe hodei = new AlumnoProfe();
		hodei.setNombre("hodei");
		hodei.setGenero(PersonaProfe.GENERO_INDEFINIDO);
		hodei.setNota(7);

		alumnos[0] = jaimito;
		alumnos[1] = jaimita;
		alumnos[2] = hodei;

		System.out.println("El profesor " + profesor.getNombre() + " imparte la materia de: " + profesor.getMateria());
		System.out.println("Sus alumnos son:");
		for (AlumnoProfe alumno : alumnos) {
			System.out.println(alumno.getNombre() + " nota: " + alumno.getNota());
			// System.out.println(alumno.toString());
		}

		// TODO mostrar Alumno con Nota maxima
		int notaMax=0;
		String nombreAlumnoConNotaMax="";
		for (AlumnoProfe alumno : alumnos) {
			if (notaMax<alumno.getNota()) {
				notaMax=alumno.getNota();
				nombreAlumnoConNotaMax=alumno.getNombre();
			}
		}
		System.out.println("La nota máxima es de "+nombreAlumnoConNotaMax+" y es de "+notaMax+".");
		
		// TODO mostrar media de las notas
		int notaTotal=0;
		int notaMedia=0;
		for (AlumnoProfe alumnoProfe : alumnos) {
			notaTotal += alumnoProfe.getNota();
		}
		notaMedia=notaTotal/alumnos.length;
		System.out.println(notaMedia);

	}

}
