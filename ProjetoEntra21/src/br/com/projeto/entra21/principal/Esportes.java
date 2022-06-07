package br.com.projeto.entra21.principal;

import java.util.ArrayList;

public class Esportes {

	ArrayList<String> esporteNome = new ArrayList<>() {
		{

			add("Corrida");
			add("Escalada");
			add("Futebol");
			add("Skate");
			add("Futvolei");
			add("Basquete");
			add("Trilha");
			add("Natação");
			add("Futsal");
			add("Tênis");
			add("Tênis de mesa");
			add("Judô");
			add("Jiu-Jitsu");
			add("Boxe");
			add("Handball");
			add("Surfe");

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
