/*
 * Esto es un comentario en bloque.
 * Podemos escribir varias l�neas.
 */

/**
 * JavaDoc es para documentar el c�digo fuente o src
 * 
 * @author Curso
 * 
 */
 
public class HolaMundo {
	
	//Las clases empiezan con may�scula y las variables con min�scula.

	public static void main(String[] args) {
		/*
		 * String es el tipo de la variable.
		 * persona es el nombre de la variable.
		 * Patata es el valor de la variable.
		 */
		String persona = "Patata";
		System.out.println("Hola, " + persona + ".");
		
		int edad = 715;
		System.out.println("Mi edad es " + edad + " a�os.");
		
		float altura = 1.70f;
		//float otraAltura = (float)1.70;
		//Hay que poner una f al final o float al inicio
		System.out.println("Mi altura es " + altura + "m.");
		
		boolean isBuenDia = true;
		if (isBuenDia) {
			System.out.println("Hoy tengo un buen d�a.");
		} else {
			System.out.println("Hoy es un d�a de cacota.");
		}	
	} // final del m�todo main
} // final de la clase