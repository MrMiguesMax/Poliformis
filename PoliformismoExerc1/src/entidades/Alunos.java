package entidades;

public class Alunos extends Pessoa1{
	private String mat�ria;

	public Alunos(String nome, int ID) {
		super(nome, ID);
		this.mat�ria = mat�ria;
	}

	@Override
	public String getDados(String nome, int ID) {
		return null;
	}

	public String getMat�ria() {
		return mat�ria;
	}

	public void setMat�ria(String mat�ria) {
		mat�ria = mat�ria;
	}
	
}
