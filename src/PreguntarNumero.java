import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime un n�mero: ");
		Scanner teclado = new Scanner(System.in);
 
		int numero = teclado.nextInt(); // lee un n�mero que el usuario introduce

		teclado.close(); // cerramos el teclado
		System.out.println("El n�mero es " + numero + ".");
	}
}