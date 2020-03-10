package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

	private static final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
			'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

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
	 * @throws Exception 
	 */
	static String saludar(String nombre, String idioma) throws Exception {
		if (IDIOMA_CASTELLANO.equals(idioma) || IDIOMA_EUSKERA.equals(idioma) || IDIOMA_INGLES.equals(idioma)) {
			System.out.println(idioma+"---"+ nombre);
			// si es void el retorno, no hay return
		} else {
			throw new Exception("El idioma "+idioma+" está mal.");
		}
		return idioma;
		
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) throws Exception {
		String sDni = String.valueOf(dni);
		return calcularLetraDni(sDni);
	}

	// DRY Dont Repeat Yourself
	// sobercarga, no es sobre-escritura @override
	// sobrecraga es el mismo nombre de metodo, mismo retorno, pero diferentes
	// parametros
	static char calcularLetraDni(String dni) throws Exception {
		char letra = ' ';
		int numeroDni = 0;
		if (dni != null && dni.length() == 8) {
			numeroDni = Integer.parseInt(dni);
			int restoDivision = numeroDni % 23;
			letra = LETRA_DNI[restoDivision];
		} else {
			throw new Exception("No es un DNI valido " + dni);
		}
		return letra;
	}

	public static int[] bubbleShort(int[] aDesordenado) {
		//int[] aDesordenado1 = { 0, 3, 1, 8 };
		//comparamos posición con posición+1
				//si es más pequeño no hace nada
				//si es mayor, lo cambia de posición
		int control=-200;
		for (int j = 0; j < aDesordenado.length; j++) {//Ponemos ésta línea y lo hace con un for
		//do {//el do while nos vale ahora porque el array es pequeñito, quitamos ésta línea para hacerlo con el for
			for (int i = 0; i < aDesordenado.length-1; i++) {
					if (aDesordenado.length+1>=aDesordenado.length) {
						//try {
							int valorauxiliar=aDesordenado[i];
							if (valorauxiliar>aDesordenado[i+1]) {
								control=aDesordenado[i];
								aDesordenado[i]=aDesordenado[i+1];
								aDesordenado[i+1]=control;
							}
						//} catch (Exception e) {
							
							//e.printStackTrace();
						}
					//System.out.println("Esta es la vuelta "+i+". Array: "+aDesordenado[i]);
				}
		//} while (aDesordenado[0]<=aDesordenado[1]&&aDesordenado[1]<=aDesordenado[2]&&aDesordenado[2]<=aDesordenado[3]);//el do while nos vale ahora porque el array es pequeñito, quitamos ésta línea para hacerlo con el for
				}//Ponemos ésta línea y lo hace con un for
		//System.out.println(aDesordenado[]);
		
		//int[] aDesordenado = { 0, 3, 1, 8 };
		//int[] aOrdenado = Utilidades.bubbleShort(aDesordenado);
//comparamos posición con posición+1
		//si es más pequeño no hace nada
		//si es mayor, lo cambia de posición
		int[] aOrdenado=aDesordenado;
		return aOrdenado;
		}
}
