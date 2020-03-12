package prueba2;

import java.util.Scanner;

/**
 * Realizar un programa que nos cree una lista de coches, 
 * para ello deberá almacenarse dentro de esta lista 
 * los objetos de tipo coche que crearemos
 * La clase coche tendrá los siguientes atributos: 
 * matricula, marca,  modelo, color, potencia, cilindrada
 *
 * Para rellenar la lista se creara un menú que nos 
 * solicitara introducir los datos por teclado, y una vez leídos todos, 
 * se guardaran en un objeto que se añadirá a la lista y
 *  nos pedirá que indiquemos si queremos introducir un vehículo más o no.
 *
 * Una vez que no queramos introducir más coches, 
 * nos mostrara todo el contenido en pantalla
 *
 * @author Curso
 *
 */
public class UF2404EjercicioACochePrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCoches=0; //para indicar la longitud del array que crearemos
		
		// crear un array de coches
		System.out.println("¿Cuántos coches quieres crear?");
		numCoches=Integer.parseInt(sc.nextLine());
		UF2404EjercicioACoche[] coches = new UF2404EjercicioACoche[numCoches];
		
		int contadorSeguridad=0;
		int continuar=0;
		//do {
			for (int i = 0; i < coches.length; i++) {
				contadorSeguridad++;
				//vamos a usar este objeto varias veces
				//cada vez vamos a arrancarlo a cero, pedir datos y guardarlos
				UF2404EjercicioACoche coche = new UF2404EjercicioACoche();
				//le pedimos datos
				System.out.println("Vamos a meter los datos del coche.");
				
				System.out.println("Dame la matrícula.");
				coche.setMatricula(sc.nextLine());
				
				System.out.println("Dame la marca.");
				coche.setMarca(sc.nextLine());
				
				System.out.println("Dame el modelo.");
				coche.setModelo(sc.nextLine());
				
				System.out.println("Dame la potencia.");
				coche.setPotencia(Integer.parseInt(sc.nextLine()));
				
				System.out.println("Dame la cilindrada");
				coche.setCilindrada(Float.parseFloat(sc.nextLine()));
				
				//le metemos el objeto al array
				coches[i] = coche;
				
				//le damos al usuario la oportunidad de escapar
				System.out.println("¿Quires continuar? Escribe 1 para seguir, 2 para salir.");
				continuar=Integer.parseInt(sc.nextLine());
				if (continuar!=1) {
					//si sale, printamos los datos que ha metido y salimos
					System.out.println("El éstas son las características de los coches.");
					for (int j = 0; j < contadorSeguridad; j++) {
						System.out.println(coches[j]);
					}
					break;
				}
				
				//cuando ha llenado el array sacamos datos por pantalla
				if (i==(numCoches-1)) {
					System.out.println("El éstas son las características de los coches.");
					for (int j = 0; j < contadorSeguridad; j++) {
						System.out.println(coches[j]);
					}
					
				}
			}
				
		//} while (continuar==1);
		
		sc.close();//cerramos el scanner
	}//cerramos el main

}//cerramos la clase
