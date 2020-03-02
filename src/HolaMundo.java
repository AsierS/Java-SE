/*
 * Esto es un comentario en bloque.
 * Podemos escribir varias líneas.
 */

/**
 * JavaDoc es para documentar el código fuente o src
 * 
 * @author Curso
 * 
 */
 
public class HolaMundo {
	
	//Las clases empiezan con mayúscula y las variables con minúscula.

	public static void main(String[] args) {
		/*
		 * String es el tipo de la variable.
		 * persona es el nombre de la variable.
		 * Patata es el valor de la variable.
		 */
		String persona = "Patata";
		System.out.println("Hola, " + persona + ".");
		
		int edad = 715;
		System.out.println("Mi edad es " + edad + " años.");
		
		float altura = 1.70f;
		//float otraAltura = (float)1.70;
		//Hay que poner una f al final o float al inicio
		System.out.println("Mi altura es " + altura + "m.");
		
		boolean isBuenDia = true;
		if (isBuenDia) {
			System.out.println("Hoy tengo un buen día.");
		} else {
			System.out.println("Hoy es un día de cacota.");
		}	
	} // final del método main
} // final de la clase