package files;

import java.util.Date;

public class Devolucao {
	private Date dataDevolucao;
	private boolean atraso;
	private float valorTotal, multa;
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public boolean isAtraso() {
		return atraso;
	}
	public void setAtraso(boolean atraso) {
		this.atraso = atraso;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public float getMulta() {
		return multa;
	}
	public void setMulta(float multa) {
		this.multa = multa;
	}
	
	
}
