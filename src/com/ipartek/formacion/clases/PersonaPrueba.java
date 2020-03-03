package com.ipartek.formacion.clases;

public class PersonaPrueba {

	public static void main(String[] args) {
		//usamos la palabra reservada new para instanciar objetos
		Persona adam = new Persona();
		Persona eva = new Persona();
		
		adam.setNombre("Adam");
		adam.setEdad(45);
		
		System.out.println("Mi nombre es: "+adam.getNombre());
		System.out.println("Tengo "+adam.getEdad()+" años.");
		
		System.out.println("ADAM: "+adam); //sysout hace .string sólo
		System.out.println("EVA: "+eva.toString());
	}
}