package ejercicio.basico.estructura.secuencial;
import java.util.*;
public class Velocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int velocidad;
	     System.out.println("Introduzca velocidad en Km/h: ");
	     velocidad = sc.nextInt();
	     System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s");
	}
 
}
