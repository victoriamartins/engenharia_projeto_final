package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import files.Item;
import files.Livro;

class TestItem {
	
	private Livro l1;
	private Item i1;
	int prazo;
	
	@Before
	public void setUp() {
		prazo = 10;
		l1 = new Livro(1, 2010, "123-321", prazo, false);
		i1 = new Item(l1);
	}

	@Test
	void test() {
		setUp();
		
		Calendar data_obtida = i1.calculaDataDevolucao();
		Calendar data_esperada = Calendar.getInstance();
		
		data_esperada.add(Calendar.DATE, prazo);
		
		assertEquals(data_esperada.get(5), data_obtida.get(5)); // confere dia
		assertEquals(data_esperada.get(6), data_obtida.get(6)); // confere mes
		assertEquals(data_esperada.get(7), data_obtida.get(7)); // confere ano
	}
}
