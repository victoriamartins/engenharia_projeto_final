package files;
import java.util.Date;

public class Reserva {
	private Date data;
	private Aluno aluno;
	private Livro livro;
	
	public Reserva(Date data, Aluno aluno, Livro livro) {
		this.setData(data);
		this.setAluno(aluno);
		this.setLivro(livro);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
}
