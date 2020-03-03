package com.ipartek.formacion.bucles;

public class PaisesCoronaVirusConObjetos {
	private String nombre;
	private boolean paisesInfectados;
	private int numeroInfectados;
	
	public PaisesCoronaVirusConObjetos() {
		super();
		this.nombre="";
		this.paisesInfectados=false;
		this.numeroInfectados=0;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isPaisesInfectados() {
		return paisesInfectados;
	}

	public void setPaisesInfectados(boolean paisesInfectados) {
		this.paisesInfectados = paisesInfectados;
	}

	public int getNumeroInfectados() {
		return numeroInfectados;
	}

	public void setNumeroInfectados(int numeroInfectados) {
		this.numeroInfectados = numeroInfectados;
	}
	
	@Override
	public String toString() {
		return "Países [nombre=" + nombre + ", paisesInfectados=" + paisesInfectados + "numeroInfectados: "+numeroInfectados+"]";
	}

}