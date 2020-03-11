package com.ipartek.formacion.clases;

public class PersonaAriketa {

	// 1. Atributos
	protected String nombre;
	protected int altura;
	protected int edad;
	protected String genero;
	protected String raza;
		
	// 2. Constructores (String color, String matricula)
	public PersonaAriketa() {
		super();
		this.nombre="";
		this.altura=0;
		this.edad=0;
		this.genero="";
		this.raza="";
	}
	
	//3 Constructor sobrecargado
	public PersonaAriketa(String nombre, int altura, int edad, String genero, String raza) {
		super();
		this.nombre="";
		this.altura=0;
		this.edad=0;
		this.genero="";
		this.raza="";
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}
