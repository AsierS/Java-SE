package ejercicio.basico.principiantes.bloqueochoarraylist;
/**
 * @see http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejercicios-resueltos-con-arraylist-en-java.html
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AritmeticaArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList();
		boolean repetirBucle = true;
		int numleidos=0;
		int numsuma=0;
		int nummedia=0;
		do {
			System.out.println("Mete un n�mero.");
			int num=Integer.parseInt(sc.nextLine()); //cuando valga -99 salimos y no guardamos ese n�mero
			if (num==-99) {
				System.out.println("Dejamos de preguntar por n�meros");
				repetirBucle=false;
			} else {
				System.out.println("Guardamos el n�mero en el array y seguimos preguntando");
				numleidos++;
				numsuma+=num;
			}
		} while (repetirBucle);
		nummedia=numsuma/numleidos;	
		System.out.println("N�mero de valores le�dos: "+numleidos+". Suma: "+numsuma+". Media: "+nummedia);
		System.out.println("Valores le�dos: "+ numeros +" +n�mero valores>media");
		
		//3 m�todos: leerValores(), calcularSuma(), mostrarResultados()

	}

}
