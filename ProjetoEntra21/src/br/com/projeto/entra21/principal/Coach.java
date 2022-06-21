package br.com.projeto.entra21.principal;

public class Coach extends Perfil { //TODO 02-poo herança

	public Coach() {
		super();

	}
	
	//TODO 02-poo metodo construtor
	public Coach(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);

	}

	//TODO 02-poo metodo construtor
	public Coach(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);

	}

}
