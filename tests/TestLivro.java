package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import files.Livro;

class TestLivro {
	
	private Livro exemplar, nao_exemplar;
	private boolean estado;

	@Before
	public void setUp() {
		estado = true;
		exemplar = new Livro(2, 1998, "ABC-DEF", 12, estado);
		nao_exemplar = new Livro(2, 1998, "ABC-DEF", 12, !estado);
	}
	
	@Test
	void testNaoExemplar() {
		setUp();
		boolean disponibilidade = nao_exemplar.isDisponivel();
		assertEquals(true, disponibilidade);
	}
	
	@Test
	void testExemplar() {
		setUp();
		boolean disponibilidade = exemplar.isDisponivel();
		assertEquals(false, disponibilidade);
	}

}
