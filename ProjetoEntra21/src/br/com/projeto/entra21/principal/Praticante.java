package br.com.projeto.entra21.principal;

public class Praticante extends Perfil {

	private String modalidadePreferida;

	public Praticante() {
		super();
	}

	public Praticante(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super(name, lastName, birthDate, genre, email, password, graduation);
	}

	public Praticante(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);
	}

	public String getModalidadePreferida() {
		return modalidadePreferida;
	}

	public void setModalidadePreferida(String modalidadePreferida) {
		this.modalidadePreferida = modalidadePreferida;
	}

	
}
