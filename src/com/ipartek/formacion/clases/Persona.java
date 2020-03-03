package com.ipartek.formacion.clases;

public class Persona {
	//Atributos, siempre son private para que no se puedan cambiar desde fuera de ésta clase.
	//para cambiarlos se crean métodos públicos de nombre getter y setter.
	//A esto se le llama encapsulación.
	private String nombre;
	private int edad;
	
	//constructor, se llama igual que la clase.
	public Persona() {
		super();
		this.nombre="Anónimo";
		this.edad=18;
	}
	
	//getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int _edad) {
		if (_edad<0) {
			this.edad=0;
		} else {
			this.edad = _edad;
		}
	}
	
	//Otras funciones 
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	
}