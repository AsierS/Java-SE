package com.ipartek.formacion.clases;

public class Pa�s {
	//int ncasos
	//string nombre
	
	//cuando se hace, el nombre es "" y el ncasos es 0
	
	//crear getter y setter; crear tostring
	private String nombre;
	private int ncasos;
	
	//constructor, se llama igual que la clase.
	public Pa�s() {
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
		return "Pa�s [nombre=" + nombre + ", N�mero de casos=" + ncasos + "]";
	}

	
	
}
