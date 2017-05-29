package com.practicas.ede;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LineaTest {
	Linea linea;
	double delta = 0.001;
	double x0=1,x1=3,y0=2,y1=4;
	
	@Before
	public void setUp()
	{
		linea = new Linea(1,2,3,4);
	}
	
	@Test
	public void getPendienteTest( ) {
		double valorReal = linea.getPendiente();
		double valorEsperado = (4 - 2) / (3 - 1);
		
		assertEquals(valorEsperado,valorReal,delta);
	}

	@Test
	public void getDistanciaTest() {
		double valorReal = linea.getDistancia();
		double valorEsperado = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
		
		assertEquals(valorEsperado,valorReal,delta);
	}

	@Test
	public void esParalelaAOtraTest() {
		Linea l = new Linea(1,2,3,4);
		boolean valorReal = linea.esParalelaAOtra(l);
	
		assertTrue(valorReal);
	
	}

}
