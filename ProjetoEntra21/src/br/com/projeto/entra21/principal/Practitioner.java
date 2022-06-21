package br.com.projeto.entra21.principal;

public class Practitioner extends Perfil { // TODO 02-poo herança

	private String preferredMode;

	public Practitioner() {
		super();
	}

	// TODO 02-poo metodo construtor
	public Practitioner(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);
	}

	// TODO 02-poo metodo construtor
	public Practitioner(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);
	}

	// TODO 02-poo encapsulamento
	public String getPreferredMode() {
		return preferredMode;
	}

	public void setPreferredMode(String preferredMode) {
		this.preferredMode = preferredMode;
	}

}
