package files;

import java.util.Date;

public class ItemDevolucao {
	private Date dataDevolucao;
	private float valor, multa;
	private int diasAtraso;
	private Devolucao devolucao;
	private Livro livro;
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
	public int getDiasAtraso() {
		return diasAtraso;
	}
	public void setDiasAtraso(int diasAtraso) {
		this.diasAtraso = diasAtraso;
	}
	public Devolucao getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
}
