package br.com.projeto.entra21.principal;

public class Administrador extends Perfil{ //TODO 02-logica herança

	public Administrador() {
		super();

	}

	//TODO 02-metodo construtor
	public Administrador(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);

	}
	
	//TODO 02-metodo construtor
	public Administrador(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);

	}

}
