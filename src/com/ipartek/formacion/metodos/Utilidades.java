package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * 
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 */
	static void saludar(String nombre, String idioma) {
		System.out.println("Hola  " + nombre);
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) {
		// TODO cacular la letra vosotros
		return 'x';
	}

	static char calcularLetraDni(String dni) {
		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		int numeroDni=0;
		do {
			if (dni.length()==8) {
				System.out.println("Esto tiene 8 caracteres.");
				try {
					numeroDni=Integer.parseInt(dni);
				} catch (Exception e) {
					System.out.println("Has metido letras. Tienes que meter números.");
				}
			} else {
				System.out.println("Esto está mal, no tiene 8 números.");
			}
		} while(numeroDni==0);
		
		int restoDivision = numeroDni % 23;
		return LETRA_DNI[restoDivision];
	}

}
