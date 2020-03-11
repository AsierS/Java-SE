package com.ipartek.formacion.clases;

public class ProfesorAriketa extends PersonaAriketa {
	private double sueldo;
	private String materia;
	
	public ProfesorAriketa() {
		super();
		this.sueldo=0;
		this.materia="";
		
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
