package exceptions;

import java.util.Scanner;

/*
 *Realice un m�todo que reciba como argumento un String y 
 *un n�mero y muestre la letra de la posici�n indicada. 
 *Ll�melo pasando como par�metro  un String sin inicializar. 
 *Dicha llamada se encontrara dentro de un bloque try catch, que en caso de 
 *producirse una excepci�n por un paso de par�metros a null, no acabe con la 
 *ejecuci�n del programa. 
 *
 * 
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que 
 * el tama�o del string, capturara el error y nos solicitara meter un numero 
 * valido, indic�ndonos los valores en los que puede estar comprendido (para este 
 * apartado se le pasa como string la cadena de texto �La lluvia en Sevilla no es 
 * una maravilla�) 
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
