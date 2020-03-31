package app.clinica;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static private Scanner sc;
	static private int ids = 1; // Nos va a servir para gestionar los IDs para los animales
	static private ArrayList<Animales> animales;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		animales = new ArrayList<Animales>();
		int opcion = 0;

		//creamos un gato de prueba para tener algo guardado
		Animales gato = new Animales();
		gato.setEdad(13);
		gato.setEspecie("Gatete");
		gato.setId(1);
		gato.setRaza("Atigrado");

		animales.add(gato);
		

		do {
			System.out.println("Introduce un número según lo que quieras hacer:");
			System.out.println("1) Registrar nueva mascota");
			System.out.println("2) Buscar mascotas por id");
			System.out.println("3) Ver historial de la mascota");
			System.out.println("4) Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {

			case 1:
				//Vamos a registrar un animal nuevo.
				Animales animal = new Animales();
				System.out.println("Introduzca el nombre del bicho:");
				animal.setNombre(sc.nextLine());
				System.out.println("Introduzca la especie:");
				animal.setEspecie(sc.nextLine());
				System.out.println("Introduzca la raza:");
				animal.setRaza(sc.nextLine());
				System.out.println("Introduzca la edad:");
				animal.setEdad(Integer.parseInt(sc.nextLine()));
				animal.setId(ids);
				animales.add(animal);

				ids++;
				
				break;

			case 2:
				System.out.println("Introduce una ID para buscar a tu animal");
				int id = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < animales.size(); i++) {
					Animales idAniamles=animales.get(i);
					if(id==idAniamles) { //no consigo comparar la id que mete el usuario con
										//la id que ya tenemos guardada
						System.out.println("Éste es tu bicho.");
					} else {
						System.out.println("Tu bicho no se encuentra en ésta clínica.");
					}
				}
				break;

			case 3:
				System.out.println("Introduce el nombre del bicho para sacar su id:");
				String nombre = sc.nextLine();
				for (int i = 0; i < animales.size(); i++) {
					if (nombre.equalsIgnoreCase(animales.get(i).getNombre())) {
						System.out.println(animales.get(ids));//esto casca pero no sé cómo solucionarlo
					}
				}
				break;

			default:
				break;
			}
		} while (opcion != 4);
		System.out.println("Has acabado de mirar mascotas. Adiós.");

	}

}
