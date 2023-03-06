package files;

import java.util.Date;

public class Debito {
	int valor;
	Date data;
	
	public Debito() {
		this.setValor(0);
	}
	public int verificaDebito() {
		return getValor();
	}
	
	public int getValor() {
		return this.valor;
	}
	public void setValor(int novoValor) {
		if (novoValor < 0) {
			this.valor = 0;
		} else {
			this.valor = novoValor;
		}
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
	