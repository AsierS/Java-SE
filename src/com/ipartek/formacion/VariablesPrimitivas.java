package com.ipartek.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {
		/*
		 * Las variables primitivas siempre empiezan por min�scula y tienen valor
		 * inicial. Salen en granate.
		 */
 
		// booleanos
		boolean tienesPatatas = true; // el valor por defecto es false

		// enteros
		byte bite = 0;
		short corto = 0;
		int entero = 0;
		long largo = 0;

		// reales - n�mero con coma
		float numeroReal = 2f; // es necesaria la f
		double todaviaMasGrande = 6;

		// caracteres
		char letra = 'a'; // hay que usar comillas simples, '
		char letraA = 65;

		/*
		 * Wrappers: son clases que nos ayudan a trabajar con las variables primitivas
		 * Empiezan siempre con may�sculas.
		 * 
		 * int -> Integer
		 * boolean -> Boolean 
		 * char -> Character
		 */
		
		System.out.println("Un int ocupa " + Integer.SIZE + " bits.");
		System.out.println("Valor m�nimo " + Integer.MIN_VALUE + " bits.");
		System.out.println("Valor m�ximo " + Integer.MAX_VALUE + " bits.");
		
		
		String numeroEnFormatoTexto = "23";
		int numero2 = 2;
		
		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(numero2 + " + " + numeroEnFormatoTexto + " = " + total);
		
	} // main

} // clase
