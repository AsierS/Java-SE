package exceptions;

import java.util.Scanner;

/*
 *Realice un método que reciba como argumento un String y 
 *un número y muestre la letra de la posición indicada. 
 *Llámelo pasando como parámetro  un String sin inicializar. 
 *Dicha llamada se encontrara dentro de un bloque try catch, que en caso de 
 *producirse una excepción por un paso de parámetros a null, no acabe con la 
 *ejecución del programa. 
 *
 * 
 * Así mismo, se controlara también que si el numero pasado es mayor que 
 * el tamaño del string, capturara el error y nos solicitara meter un numero 
 * valido, indicándonos los valores en los que puede estar comprendido (para este 
 * apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es 
 * una maravilla”) 
 *
 */
public class ejercicioExceptionsCampus3 {

	public static void main(String[] args) {
		String tochoTexto;
		try {
			char a=letraEnPosicion("LA slluevi en SEcvilla es una maraibvilla", 3);
			System.out.println(a);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Estamos en el catch del NullPointerException.");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static char letraEnPosicion(String tochoTexto, int posicion) {
		return tochoTexto.charAt(posicion);
	}
}
