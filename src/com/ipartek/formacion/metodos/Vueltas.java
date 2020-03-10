package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];
		int numBilletes=0;
		// TODO vuestro marron
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			if (importe%BILLETES_MONEDAS[i]==0) {
				numBilletes=(int) (importe/BILLETES_MONEDAS[i]);
				vueltas[i]=numBilletes;
				if (importe-BILLETES_MONEDAS[i]>=0) {
					importe=importe-BILLETES_MONEDAS[i];
				}
				
			}
			System.out.println(vueltas[i]);
		}
		
//dividimos con / para sacar el entero, eso es la cantidad de billetes de ese tipo que necesitamos
//si el resto es 0, ya está. si el resto no es 0, hay que seguir
		//si, por ejemplo, es 1, hayq ue meter eso en el array en esa posición y luego restarlo de lo que debes
//
		return vueltas;

	}

	public static float calcularVueltas(float importe, float entregado) throws Exception {
		// TODO vuestro marron

		return 0;
	}

}
