package com.ipartek.formacion.bucles;

public class Pais {

	private String nombre;
	private int infectados;
	//private boolean isInfectado;

	public Pais() {
		super();
		this.nombre = "";
		this.infectados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getInfectados() {
		return infectados;
	}

	public void setInfectados(int _infectados) {
		this.infectados = _infectados;
	}

	/*public boolean isInfectado() {

		return this.infectados > 0;
	}*/

	/*public void setInfectado(boolean isInfectado) {
		this.isInfectado = isInfectado;
	}*/

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", infectados=" + infectados + "]";
	}

}
