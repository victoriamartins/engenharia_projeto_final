package files;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

	private Devolucao devolucao;
	Date dataPrevista;
	Date dataEmprestimo;
	float multa;
	public List<Item> itensEmprestimo = new ArrayList<Item>();
	
	public Emprestimo() {
		this.multa = 0;
		this.dataPrevista = Calendar.getInstance().getTime();
		this.dataEmprestimo = Calendar.getInstance().getTime();
		this.setDevolucao(null);
	}
	
	public Calendar calculaDataDevolucao() {   
		Calendar data_aux = Calendar.getInstance();

		for (int i = 0; i < itensEmprestimo.size(); i++) {
			Calendar data_item = itensEmprestimo.get(i).calculaDataDevolucao();
			if (data_item.compareTo(data_aux) == 1) {
				data_aux = data_item; 
			}
		}
		
		int qtd_itens = itensEmprestimo.size();
		if (qtd_itens < 3) {
			return data_aux;
		}
		int adicao = 2 * (qtd_itens - 2);
		data_aux.add(Calendar.DATE, adicao);
		return data_aux;

	}
	public void emprestar(List<Livro> livros) {
		if (this.verificaQtd(livros)) {
			for (int i = 0; i < livros.size(); i++) {
				this.itensEmprestimo.add(new Item(livros.get(i))); //gera item
				livros.get(i).setDisponivel(false); //indisponibiliza o livro
			}
			Date dataDev = this.calculaDataDevolucao().getTime();
			for (int i = 0; i < this.itensEmprestimo.size(); i++) {
				this.itensEmprestimo.get(i).setDataPrevista(dataDev); //seta a data do item
			}
			this.dataPrevista = dataDev; //seta a data do emprestimo
		}
	}
	
	private boolean verificaQtd(List<Livro> livros){
		if (livros.size() < 1) {
			System.out.println("Adicione livros ao empréstimo!");
			System.exit(0);;
		}
		return true;
	}
	
	public Date getDataEmprestimo() {
		return this.dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataPrevista() {
		return this.dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public Devolucao getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}

}