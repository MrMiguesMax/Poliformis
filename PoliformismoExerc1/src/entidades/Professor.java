package entidades;

public class Professor extends Pessoa1{
	
	private String turma;

	public Professor(String nome, int ID) {
		super(nome, ID);
		this.turma = turma;

	}

	@Override
	public String getDados(String nome, int ID) {
		return null;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
}
