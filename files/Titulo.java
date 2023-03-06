package files;
public class Titulo {
	public int prazo, edicao, ano;
	public String isbn;
	
	public Titulo(int edicao, int ano, String isbn, int prazo)
	{
		this.edicao = edicao;
		this.ano = ano;
		this.isbn = isbn;
	 	this.setPrazo(prazo);
	}
	
	public int getPrazo() {
		return prazo;
	}
	
	public void setPrazo(int prazo) {
		if (prazo > 0) {
			this.prazo = prazo;
		} else {
			this.prazo = 7;
		}
	}
	public String getISBN() {
		return this.isbn;
	}
}