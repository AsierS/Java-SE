package com.ipartek.formacion.metodos;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTestMio {

	/*
	@Test
	public void testSaludarString() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testSaludarStringString() throws Exception {
		assertEquals("es---Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_CASTELLANO));
	}
	
	@Test
	public void testSuma() {
		assertEquals(6, Utilidades.suma(3, 3));
		
		//más asserts que existen
		assertTrue(true);
		assertFalse(2>300);
		assertNull(null);
		//assertNotNull(object);
	}

	/*
	@Test
	public void testCalcularLetraDniInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularLetraDniString() {
		fail("Not yet implemented");
	}

	*/
}
