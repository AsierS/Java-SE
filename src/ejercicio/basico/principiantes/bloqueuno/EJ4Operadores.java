package ejercicio.basico.principiantes.bloqueuno;

/**
 * see https://puntocomnoesunlenguaje.blogspot.com/2018/09/ejercicios-sobre-operadores-logicos.html
 * @author Curso
 *
 */
 
public class EJ4Operadores {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=false;
		boolean z=true;
		System.out.println("(X && Y) || (X && Z) = "+((x&&y) || (x&&z)));
	}

}
