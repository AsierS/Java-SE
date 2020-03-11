package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Vehiculo;

public class ConfiguradorVehiculos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehiculo v1 = new Vehiculo();
		
		// preguntar por consola como quiere el Vehiculo
		System.out.println("Vamos a configurar el veh�culo.");
		
		// preguntar color
		System.out.println("Dime el color: ");
		v1.setColor(sc.nextLine());
		
		// preguntar matricula
		System.out.println("Dime la matr�cula: ");
		v1.setMatricula(sc.nextLine());
		
		// preguntar puertas y resto de atributos
		System.out.println("Dime el n�mero de puertas: ");
		v1.setNumeroPuertas(Integer.parseInt(sc.nextLine()));
		
		// mostrar uno a uno todos los atriibutos por consola
		System.out.println("Vamos a ense�ar los atributos.");
		System.out.println("El color es: "+v1.getColor());
		System.out.println("La matr�cula es: "+v1.getMatricula());
		System.out.println("El n�mero de ruedas es: "+v1.getNumeroRuedas());
		System.out.println("El n�mero de puertas es: "+v1.getNumeroPuertas());
		System.out.println("La potencia es: "+v1.getPotencia());

		sc.close();
	}

}
