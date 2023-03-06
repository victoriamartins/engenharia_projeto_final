package files;

import java.util.List;

public class Aluno {
	int matricula;
	String nome, cpf, endereco;
	Debito debito; 
	
	public Aluno (int matricula, String nome, String cpf, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public boolean verificaAluno() {
		if (this.matricula % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean verificaDebito() {
		if (this.debito == null) {
			this.debito = new Debito();
		}
		
		int valor = this.debito.verificaDebito();
		if (valor != 0) {
			return true;
		}
		return false;
	}
	
	public Emprestimo emprestar(List<Livro> livros) {
		Emprestimo e = new Emprestimo();
		e.emprestar(livros);
		return e;
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Debito getDebito() {
		return debito;
	}
	public void setDebito(Debito debito) {
		this.debito = debito;
	}
	
}
