package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class BinStringTest {

	private BinString binString;
	
	public BinStringTest(){
		binString = new BinString();
	}
	
	@Test
	public void  sumarTest(){
		// Test de la función sumar
		int expected = 0;
		assertEquals(expected, binString.sumar(""));
		expected = 100;
		assertEquals(expected, binString.sumar("d"));
		expected = 292;
		assertEquals(expected, binString.sumar("aba"));
	}
	
	@Test
	public void aBinarioTest() {
		// Test de la función aBinario
		assertEquals("1000", binString.aBinario(8));	
		
	}
	
	@Test
	public void convertirTest() {
		// Test de la función convertirTest
		assertEquals( "111000", binString.convertir("8"));
		assertEquals( "1000001", binString.convertir("A"));
		
	}
	
	
}
