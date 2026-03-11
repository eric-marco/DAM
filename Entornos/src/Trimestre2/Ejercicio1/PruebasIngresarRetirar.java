package Trimestre2.Ejercicio1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class PruebasIngresarRetirar {

	private Cuenta cuenta;

	@Before
	void setUp() {
		cuenta = new Cuenta("Cuenta Prueba", 1000);
	}

	@After
	void endUp() {
		cuenta = null;
	}

	// Pruebas para ingresar dinero

	@Test
	void testIngresarNormal() {
		System.out.println("Probando: ingresar 500€");
		cuenta.ingresar(500);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	@Test
	void testIngresarCero() {
		System.out.println("Probando: ingresar 0€");
		cuenta.ingresar(0);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	@Test
	void testIngresarNegativo() {
		System.out.println("Probando: ingresar -200€");
		cuenta.ingresar(-200);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	// Pruebas para retirar dinero

	@Test
	void testRetirarNormal() {
		System.out.println("Probando: retirar 500€");
		cuenta.retirar(500);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	@Test
	void testRetirarDemasiado() {
		System.out.println("Probando: retirar 1500€ (tengo 1000€)");
		cuenta.retirar(1500);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	@Test
	void testRetirarNegativo() {
		System.out.println("Probando: retirar -300€");
		cuenta.retirar(-300);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	@Test
	void testRetirarCero() {
		System.out.println("Probando: retirar 0€");
		cuenta.retirar(0);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}

	@Test
	void testRetirarTodo() {
		System.out.println("Probando: retirar todo (1000€)");
		cuenta.retirar(1000);
		System.out.println("Saldo después: " + cuenta.getSaldo());
	}
}