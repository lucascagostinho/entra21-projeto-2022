package br.com.projeto.entra21.principal;

import java.util.ArrayList;

public class Esportes {

	ArrayList<String> esporteNome = new ArrayList<>() {
		{

			add("Corrida");
			add("Escalada");

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
