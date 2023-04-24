package entidades;

public class Pessoa1 {
	private String nome;
	private int ID;
	
	//contrutor
	public Pessoa1(String nome, int ID) {
		this.nome = nome;
		this.ID = ID;
	}
	
	//metodos
	public String getDados (String nome, int ID) {
		System.out.println("Seu Nome e "+nome);
		System.out.println("Seu codigo de indentificacao e "+ID);
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}