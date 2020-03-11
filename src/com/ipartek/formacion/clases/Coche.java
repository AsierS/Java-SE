package com.ipartek.formacion.clases;

public class Coche extends Vehiculo {

	public Coche() {
		super();
		//this.NumeroPuertas = 5; cambia en Vehiculo a protected para que sea visible
		this.setNumeroPuertas(5);
		super.setNumeroRuedas(4); //en este caso this y super hacen lo mismo
	}

}
