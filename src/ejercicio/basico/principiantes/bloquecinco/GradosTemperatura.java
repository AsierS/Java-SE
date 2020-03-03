package ejercicio.basico.principiantes.bloquecinco;
// venimos de: http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
import java.util.Scanner;

public class GradosTemperatura {

	public static void main(String[] args) {
		// lee una temperatura expresada en grados centígrados y la convierte a grados kelvin. 
		
		Scanner sc = new Scanner(System.in);
		do {
			
		
		System.out.println("Introduce grados centígrados: ");
	    float gradosC = sc.nextInt();
	    float gradosK=gradosC+273;
	    System.out.println(gradosC+" ºC -> "+gradosK+"ºK.");

	    System.out.println("¿Quieres salir? S para sí.");
	    String car =sc.nextLine();
        } while(true);
		
	    //sc.close();
	}

}
