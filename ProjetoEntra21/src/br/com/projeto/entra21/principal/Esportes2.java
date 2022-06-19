package br.com.projeto.entra21.principal;

public enum Esportes2 {
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

	private Esportes2(String valor) {

		this.VALOR = valor;

	}

	public String getValor() {

		return this.VALOR;

	}

}
