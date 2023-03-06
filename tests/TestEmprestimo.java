package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import files.Aluno;
import files.Emprestimo;
import files.Livro;

class TestEmprestimo {
	
	private Aluno aluno;
	private List<Livro> livro1, livro2, livro3, livro4;
	private Emprestimo emprestimo;
	
	@BeforeClass
	public void setUp() {
		aluno = new Aluno(20, "A", "100.100.001-10", "Bandeirantes-PR");
		
		Livro l1 = new Livro(10, 2010, "120-120", 1, false);
		Livro l2 = new Livro(10, 2010, "120-120", 2, false);
		Livro l3 = new Livro(10, 2010, "120-120", 3, false);
		Livro l4 = new Livro(10, 2010, "120-120", 10, false);
		
		livro1 = new ArrayList<Livro>();
		livro1.add(l1);
		
		livro2 = new ArrayList<Livro>();
		livro2.add(l1);
		livro2.add(l2);
		
		livro3 = new ArrayList<Livro>();
		livro3.add(l1);
		livro3.add(l2);
		livro3.add(l3);
		
		livro4 = new ArrayList<Livro>();
		livro4.add(l1);
		livro4.add(l2);
		livro4.add(l3);
		livro4.add(l4);
	}
	
	@Test
	void emprestimoUmLivro() {
		setUp();
		
		emprestimo = aluno.emprestar(livro1);
		
		Calendar dataEsperada = Calendar.getInstance();
		dataEsperada.add(Calendar.DATE, 1);
		
		assertEquals(emprestimo.getDataPrevista(), dataEsperada.getTime());
	}
	
	@Test
	void emprestimoDoisLivros() {
		setUp();
		emprestimo = aluno.emprestar(livro2);
		
		Calendar dataEsperada = Calendar.getInstance();
		dataEsperada.add(Calendar.DATE, 2);
		
		assertEquals(emprestimo.getDataPrevista(), dataEsperada.getTime());
	}
	
	@Test
	void emprestimoTresLivros() {
		setUp();
		emprestimo = aluno.emprestar(livro3);
		
		Calendar dataEsperada = Calendar.getInstance();
		dataEsperada.add(Calendar.DATE, 5);
		
		assertEquals(emprestimo.getDataPrevista(), dataEsperada.getTime());
	}
	
	@Test
	void emprestimoQuatroLivros() {
		setUp();
		emprestimo = aluno.emprestar(livro4);
		
		Calendar dataEsperada = Calendar.getInstance();
		dataEsperada.add(Calendar.DATE, 14);
		
		assertEquals(emprestimo.getDataPrevista(), dataEsperada.getTime());
	}
	
	@Test
	void alteracoesPosEmprestimo () {
		setUp();
		emprestimo = aluno.emprestar(livro2);
		
		Calendar dataEsperada = Calendar.getInstance();
		dataEsperada.add(Calendar.DATE, 2);
		
		// verifica se alterou a data do item 0
		assertEquals(emprestimo.itensEmprestimo.get(0).getDataPrevista(), dataEsperada.getTime());
		// verifica se alterou a data do item 1
		assertEquals(emprestimo.itensEmprestimo.get(1).getDataPrevista(), dataEsperada.getTime());
		
		// verifica se alterou a disponibilidade do item 0
		assertEquals(false, livro2.get(0).isDisponivel());
		// verifica se alterou a disponibilidade do item 1
		assertEquals(false, livro2.get(1).isDisponivel());
	}
}
