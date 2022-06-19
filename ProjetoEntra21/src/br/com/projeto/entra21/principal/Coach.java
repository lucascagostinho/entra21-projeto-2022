package br.com.projeto.entra21.principal;

public class Coach extends Perfil {

	private String fraseMotivacional;

	public Coach() {
		super();

	}

	public Coach(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);

	}

	public Coach(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);

	}

	public String getFraseMotivacional() {
		return fraseMotivacional;
	}

	public void setFraseMotivacional(String fraseMotivacional) {
		this.fraseMotivacional = fraseMotivacional;
	}

}
