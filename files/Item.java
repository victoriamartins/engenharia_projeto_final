package files;
import java.util.Calendar;
import java.util.Date;

public class Item {

	Livro livro;
    Date dataDevolucao, dataPrevista;

    public Item(Livro livro) {
		super();
		this.livro = livro;
	}

	public Calendar calculaDataDevolucao() {
		int prazo = this.livro.verPrazo();
		
		Calendar devolucao = Calendar.getInstance();
		devolucao.add(Calendar.DATE, prazo);
		
		return devolucao;
	}
	
	///////// Getters e setters	
	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Date getDataPrevista() {
		return this.dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public Livro getLivro() {
		return this.livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
