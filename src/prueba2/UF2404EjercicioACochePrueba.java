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
		do {
			for (int i = 0; i < coches.length; i++) {
				contadorSeguridad++;
				//vamos a usar este objeto varias veces
				//cada vez vamos a arrancarlo a cero, pedir datos y guardarlos
				UF2404EjercicioACoche coche = new UF2404EjercicioACoche();
				//le pedimos datos
				System.out.println("Vamos a meter los datos del coche.");
				
				System.out.println("Dame la cilindrada");
				coche.setCilindrada(Float.parseFloat(sc.nextLine()));
				
				System.out.println("Dame la matrícula.");
				coche.setMatricula(sc.nextLine());
				
				System.out.println("Dame la marca");
				coche.setMarca(sc.nextLine());
				
				//le metemos el objeto al array
				coches[i] = coche;
				
				//sacamos datos por pantalla
				//TODO meterelo todo en un sólo for en vez de apañarlo con dos
				if (i==(numCoches-1)) {
					System.out.println("El éstas son las características de los coches.");
					for (int j = 0; j < contadorSeguridad; j++) {
						System.out.println(coches[j]);
					}
					
				}
				
			System.out.println("¿Quires continuar? Escribe 1 para seguir, 2 para salir.");
			continuar=Integer.parseInt(sc.nextLine());					
			}
		} while (continuar==1);
		
		/*
		//creamos un objeto de nombre coche0 (que luego sustituiremos por coche[i])
		//y le damos algunos datos (luego los pediremos por pantalla)
		UF2404EjercicioACoche coche0 = new UF2404EjercicioACoche();
		coche0.setMatricula("ZXC-78");
		coche0.setCilindrada(70);
		coche0.setModelo("El barato");
		
		
		UF2404EjercicioACoche coche1 = new UF2404EjercicioACoche();
		coche1.setMatricula("HJF-79");
		coche1.setCilindrada(200);
		coche1.setModelo("El caro");
		
		//le pedimos datos al usuario
		UF2404EjercicioACoche coche2 = new UF2404EjercicioACoche();
		System.out.println("Vamos a meter los datos del nuevo coche.");
		System.out.println("Introduce la matrícula.");
		coche2.setMatricula(sc.nextLine());
		System.out.println();
		
		
		
		//le mete los objetos al array
		coches[0] = coche0;
		coches[1] = coche1;
		coches[2] = coche2;
		
		//sacamos los datos por pantalla
		//podemos hacer esto con un for para cada uno de los objetos que tenemos
		System.out.println("El primer coche tiene estas características");
		System.out.println(coche0.toString());
		//System.out.println(coches[0]);
		System.out.println(coche1.toString());
		System.out.println(coches[2]);
		*/
		sc.close();//cerramos el scanner
	}//cerramos el main

}//cerramos la clase
