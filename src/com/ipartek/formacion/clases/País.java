package com.ipartek.formacion.clases;

public class País {
	//int ncasos
	//string nombre
	
	//cuando se hace, el nombre es "" y el ncasos es 0
	
	//crear getter y setter; crear tostring
	private String nombre;
	private int ncasos;
	
	//constructor, se llama igual que la clase.
	public País() {
		super();
		this.nombre="";
		this.ncasos=0;
	}
	
	//getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNcasos() {
		return ncasos;
	}

	public void setNcasos(int _ncasos) {
		this.ncasos=_ncasos;
	}
	
	//Otras funciones 
	@Override
	public String toString() {
		return "País [nombre=" + nombre + ", Número de casos=" + ncasos + "]";
	}

	
	
}
