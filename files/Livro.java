package files;
public class Livro {
	Titulo titulo;
	boolean disponivel, exemplarBiblioteca;
	
	public Livro(int edicao, int ano, String isbn, int prazo, boolean exemplar) {
		this.titulo = new Titulo(
				edicao, 
				ano, 
				isbn, 
				prazo
			);
		this.exemplarBiblioteca = exemplar;
		this.disponivel = this.atbDisponibilidade(this.exemplarBiblioteca); 
		// se for exemplar, nao fica disponivel
	}
	
	public boolean verificarLivro() {
		if (!this.isDisponivel() || this.isExemplarBiblioteca()) {
			return false; // nao pode ser emprestado
		}
		return true;
	}
	
	public int verPrazo() {
		return titulo.getPrazo();
	}
	private boolean atbDisponibilidade(boolean exemplar) {
		if (exemplar) {
			return false;
		}
		return true;
	}
	public Titulo getTitulo() {
		return titulo;
	}
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivel() {
		return this.disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public boolean isExemplarBiblioteca() {
		return this.exemplarBiblioteca;
	}
	public void setExemplarBiblioteca(boolean exemplarBiblioteca) {
		this.exemplarBiblioteca = exemplarBiblioteca;
	}

}