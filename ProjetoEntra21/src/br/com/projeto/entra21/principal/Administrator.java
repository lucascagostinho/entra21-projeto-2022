package br.com.projeto.entra21.principal;

public class Administrator extends Perfil{ //TODO 02-logica heran�a

	public Administrator() {
		super();

	}

	//TODO 02-metodo construtor
	public Administrator(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);

	}
	
	//TODO 02-metodo construtor
	public Administrator(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);

	}

}
