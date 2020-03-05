package prueba;

public class JugandoConString {

	public static void main(String[] args) {

		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = " AaAnN 5 ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;

		// TODO contar numeros y espacios en blanco

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			// Contar (Vocales o Consonates) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if isLetter

		} // for

		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);

		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		// separar string en array para acceder a cada dato
		String lineaCVS = "jose;froilan;16;35.000";
		String[] arraylineaCVS = lineaCVS.split(";");
		System.out.println("Nombre: "+ arraylineaCVS[0]+". Apellido: "+arraylineaCVS[1]+
				". Edad: "+arraylineaCVS[2]+". Sueldo anual: "+arraylineaCVS[3]+".");

		
		// buscar posicion de una letra concreta
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('d'));
		System.out.println("La última a está en la posción " + buscarLetra.lastIndexOf('a'));
		System.out.println("¿Que pasa si no encuentra? " + buscarLetra.indexOf('z'));

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre       es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// TODO cambiar numeros por letras y ademas pasar todo a MAYSUCULAS
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";


		String dni = "12345678";
		
		char numerito;
		int num;
		int total=0;;
		for (int i = 0; i < dni.length(); i++) {

			numerito = dni.charAt(i);
			num=Character.getNumericValue(numerito);
			total=total+num;
			System.out.println("En la posicion " + i + " tenemos caracter " + numerito);
			System.out.println("El valor es "+num);
			
		}
		System.out.println("El total es "+total);

		// TODO buscar por interenet como se calcula la letra

	}

}
