package br.com.projeto.entra21.principal;

public class Administrador extends Perfil{

	public Administrador() {
		super();

	}

	public Administrador(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);

	}

	public Administrador(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);

	}

}
