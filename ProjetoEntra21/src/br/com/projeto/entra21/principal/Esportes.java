package br.com.projeto.entra21.principal;

import java.util.LinkedList;

public class Esportes {

	LinkedList<String> esportes = new LinkedList<>() {
		{

			add(Esportes2.FUTEBOl.getValor());
			add(Esportes2.CORRIDA.getValor());
			add(Esportes2.CICLISMO.getValor());
			add(Esportes2.TENNIS.getValor());
			add(Esportes2.ESCALADA.getValor());
			add(Esportes2.SURF.getValor());
			add(Esportes2.VOLEI.getValor());
			add(Esportes2.NATACAO.getValor());
			add(Esportes2.SKATE.getValor());
		}
	};

	public Esportes() {
		super();
	}

	public Esportes(LinkedList<String> esporteNome) {
		super();
		this.esportes = esporteNome;
	}

	public LinkedList<String> getEsporteNome() {
		return esportes;
	}

	public void setEsporteNome(LinkedList<String> esporteNome) {
		this.esportes = esporteNome;
	}

}
