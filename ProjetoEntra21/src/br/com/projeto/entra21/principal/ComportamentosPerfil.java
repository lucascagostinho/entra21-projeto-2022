package br.com.projeto.entra21.principal;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.entra21.annotations.EmAndamento;
import br.com.projeto.entra21.menus.Menu;

public class ComportamentosPerfil extends Menu {

	private static final ArrayList<Pratica> PRATICAS = new ArrayList<Pratica>();

	static Scanner input = new Scanner(System.in);

	public ComportamentosPerfil(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	@Override
	public byte captureOption() {
		byte option = super.captureOption();

		switch (option) {
		case 1:
			iniciarPratica();
			break;

		}
		return option;
	}

	@EmAndamento // Criar a data que foi iniciada a prática
	public static void iniciarPratica() {

		byte optionPratica;
		byte optionEsporte;

		System.out.println("Informe o esrpote que deseja praticar");
		for (int posicao = 0; posicao < Esportes.values().length; posicao++) {
			System.out.println(posicao + " - " + Esportes.values()[posicao].getValor());

		}
		optionEsporte = input.nextByte();

		Instant inicio = Instant.now();

		do {
			System.out.println("Digite 1 para parar de praticar.");
			optionPratica = input.nextByte();

		} while (optionPratica != 1);

		Instant fim = Instant.now();

		Duration tempo = Duration.between(inicio, fim);
		
		System.out.println(
				"Você Praticou " + Esportes.values()[optionEsporte] + " durante " + tempo.toSeconds() + " segundos");

		PRATICAS.add(new Pratica(LocalDateTime.now(), tempo.toSeconds(), Esportes.values()[optionEsporte]));

		PRATICAS.forEach(pratica -> {
			System.out.println(pratica);
		});

	}

}
