package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import files.Aluno;
import files.Debito;

class TestAluno {
	
	private Aluno aluno, invalido;
	private Debito debito;
	
	@Before
	public void setUp() {
		aluno = new Aluno(0, "Nome Exemplo", "123", "Bandeirantes-PR");
		debito = new Debito();
		
		invalido = new Aluno(1, "Nome Exemplo", "123", "Bandeirantes-PR");
	}

	@Test
	void semDebito() {
		setUp();
		boolean estado_debito = aluno.verificaDebito();
		assertEquals(false, estado_debito);
	}
	
	@Test
	void comDebito() {
		setUp();
		debito.setValor(10);
		aluno.setDebito(debito);
		boolean estado_debito = aluno.verificaDebito();
		assertEquals(true, estado_debito);
	}

	@Test
	void alunoValido() {
		setUp();
		assertEquals(true, aluno.verificaAluno());
	}
	
	@Test 
	void alunoInvalido() {
		setUp();
		assertEquals(false, invalido.verificaAluno());
	}
}
