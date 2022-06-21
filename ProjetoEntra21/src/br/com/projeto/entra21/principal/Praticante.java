package br.com.projeto.entra21.principal;

public class Praticante extends Perfil { //TODO 02-logica herança

	private String modalidadePreferida;

	public Praticante() {
		super();
	}

	//TODO 02-metodo construtor
	public Praticante(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);
	}

	//TODO 02-metodo construtor
	public Praticante(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);
	}

	//TODO 02-logica encapsulamento
	public String getModalidadePreferida() {
		return modalidadePreferida;
	}


	public void setModalidadePreferida(String modalidadePreferida) {
		this.modalidadePreferida = modalidadePreferida;
	}

	
}
