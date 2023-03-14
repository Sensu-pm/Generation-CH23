package pruebasJunit.jada.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pruebasJunit.jada.app.Calculadora;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private static final Calculadora Null = null;
	private Calculadora ct;
	private Calculadora ct1= Null;
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecutando Before--->, configurandoBefore()");
	}

	@AfterEach
	public void configurandoAfter() {


		System.out.println("Ejecutando AfterEach ----> configurandoAfter()");
		System.out.println("********************----->");
	}
	
	  @Test
	public void CalculadoraNull() {
		  ct1 = new Calculadora();
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("ejecutando primer test ---> calculadora");
		
	}
	
	@Test
	public void CalculadoraNotNull() {
		assertNotNull( ct, "La clase esta instanciada");
		System.out.println("Ejecutando segundo test ---->");

	}
	/**************************Primeras Pruebas*******************************/
	private void primerosAssert() {
		/*
		 * 1- Indicar que se va a evaluar
		 * 2- Indicar lo que se va a realizar
		 *3- Evaluar con el assert indicado
		 *
		 *
		 */
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(7, 3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test ----> primeroAssert()");
	
	}
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, ct.sumar(10, 10));
		System.out.println("Ejecutando cuarto test-----> primeroAssert()");
	}
	
	/**************************Tipos de test*******************************/
	@Test
	public void tiposAsserts() {
		assertTrue(1==1);
		assertEquals("Generation", "Generatio");
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = new Calculadora();
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.2, .5);		
		
	}
	private void validandosuma() {
		assertEquals(11, ct.sumar(5, 6));

	}
	private void validandoResta() {
		assertEquals(11, ct.Restar(56, 6));

	}
	private void validandoRestaNegativa() {
		assertEquals(-10, ct.Restar(7, 26));
}
}