package files;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static List<Reserva> reservas = new ArrayList<Reserva>();

	public static void main(String[] args) {
		
		Aluno a = new Aluno(20, "A", "100.100.001-10", "Bandeirantes-PR");
		
		if (verificacoesAluno(a)) {
			List<Livro> livros = new ArrayList<Livro>();
			
			livros.add(new Livro(10, 2010, "12301", 10, false));
			
			livros = verificacoesLivro(livros);
			Emprestimo e = a.emprestar(livros);
			
			imprimeDadosEmprestimo(e);
		}
		
	}
	
	public static void imprimeDadosEmprestimo(Emprestimo e) {
		System.out.println("Livros emprestados: ");
		for (int i = 0; i < e.itensEmprestimo.size(); i++) {
			System.out.println(e.itensEmprestimo.get(i).livro.titulo.isbn);
		}
		System.out.println("Data de empréstimo: " + e.dataEmprestimo);
		System.out.println("Data prevista para devolução: " + e.dataPrevista);
	}
	
	public static boolean verificacoesAluno(Aluno aluno) {
		boolean verificacaoAluno =  aluno.verificaAluno();
		boolean verificacaoDebito =  aluno.verificaDebito();
		
		if (!verificacaoAluno) {
			System.out.println("Cadastro inválido.");
			return false;
		}
		if (verificacaoDebito) {
			System.out.println("Este aluno possui débito.");
			return false;
		}
		return true;
	}
	
	public static List<Livro> verificacoesLivro(List<Livro> livros) {
		// verifica disponibilidade e exemplar
		for (int i = 0; i < livros.size(); i++) {
			if (!livros.get(i).verificarLivro()) {
				livros.remove(i);
				i--;
			}
		}
		
		// verifica reservas
		for (int i = 0; i < reservas.size(); i++) {
			for (int j = 0; j < livros.size(); j++) {
				if (reservas.get(i).getLivro() == livros.get(j)) {
					System.out.println("Livro de ISBN " + livros.get(j).titulo.isbn + " reservado.");
					System.out.println("Devolução em " + reservas.get(i).getData());
					livros.remove(j);
					j--;
				}
			}
		}
		return livros;
	}

}
