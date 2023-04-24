package entidades;

public class Alunos extends Pessoa1{
	private String matéria;

	public Alunos(String nome, int ID) {
		super(nome, ID);
		this.matéria = matéria;
	}

	@Override
	public String getDados(String nome, int ID) {
		return null;
	}

	public String getMatéria() {
		return matéria;
	}

	public void setMatéria(String matéria) {
		matéria = matéria;
	}
	
}
