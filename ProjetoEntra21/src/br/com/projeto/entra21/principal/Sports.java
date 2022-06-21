package br.com.projeto.entra21.principal;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Lista de ENUMs com os esportes que podem ser praticados.")
public enum Sports { //TODO 03-classe ENUM
	
	FUTEBOl("Futebol"),

	CORRIDA("Corrida"),

	CICLISMO("Ciclismo"),

	TENNIS("Tennis"),

	ESCALADA("Escalada"),

	SURF("Surf"),

	VOLEI("Vôlei"),

	NATACAO("Natação"),

	SKATE("Skate");

	private final String VALOR;

	private Sports(String valor) {

		this.VALOR = valor;

	}

	public String getValor() {

		return this.VALOR;

	}

}
