package files;

public class Area {
	private String nome, descricao;
	private Titulo titulo;
	
	public Area(String nome, String descricao, Titulo titulo) {
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setTitulo(titulo);
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
