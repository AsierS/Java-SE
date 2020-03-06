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
			System.out.println("Mete un número.");
			int num=Integer.parseInt(sc.nextLine()); //cuando valga -99 salimos y no guardamos ese número
			if (num==-99) {
				System.out.println("Dejamos de preguntar por números");
				repetirBucle=false;
			} else {
				System.out.println("Guardamos el número en el array y seguimos preguntando");
				numleidos++;
				numsuma+=num;
			}
		} while (repetirBucle);
		nummedia=numsuma/numleidos;	
		System.out.println("Número de valores leídos: "+numleidos+". Suma: "+numsuma+". Media: "+nummedia);
		System.out.println("Valores leídos: "+ numeros +" +número valores>media");
		
		//3 métodos: leerValores(), calcularSuma(), mostrarResultados()

	}

}
