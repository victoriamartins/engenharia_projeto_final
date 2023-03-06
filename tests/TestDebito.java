package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import files.Debito;

class TestDebito {
	
	private Debito debito;
	
	@Before
	public void setUp() {
		debito = new Debito();
	}

	@Test
	void test() {
		setUp();
		
		int debitoNegativo = -10;
		int valorEsperado = 0;
		
		debito.setValor(debitoNegativo);

		assertEquals(valorEsperado, debito.getValor());
	}

}
