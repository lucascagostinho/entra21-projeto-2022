package br.com.projeto.entra21.principal;

public class Coach extends Perfil{

	private String fraseMotivacional;

	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Coach(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);
		// TODO Auto-generated constructor stub
	}


	public Coach(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);
		// TODO Auto-generated constructor stub
	}


	public String getFraseMotivacional() {
		return fraseMotivacional;
	}

	public void setFraseMotivacional(String fraseMotivacional) {
		this.fraseMotivacional = fraseMotivacional;
	}
	
}
