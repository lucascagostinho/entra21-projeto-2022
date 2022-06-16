package br.com.projeto.entra21.principal;

import java.util.ArrayList;

public class Esportes {

	ArrayList<String> esporteNome = new ArrayList<>() {
		{

			add("Futebol de campo");
			add("Futebol quadra society");
			add("Futsal");
			add("Futvolei");
			add("Corrida");
			add("Ciclismo");
			add("Beach Tennis");
			add("Escalada");
			add("Surf");
			add("Volei de praia");
			add("Volei de quadra");
			add("Tenis");
			add("Tênis de mesa");
			add("Natação");
			add("Skate");
			add("Academia");
		}
	};

	public Esportes() {
		super();
	}

	public Esportes(ArrayList<String> esporteNome) {
		super();
		this.esporteNome = esporteNome;
	}

	public ArrayList<String> getEsporteNome() {
		return esporteNome;
	}

	public void setEsporteNome(ArrayList<String> esporteNome) {
		this.esporteNome = esporteNome;
	}

}
