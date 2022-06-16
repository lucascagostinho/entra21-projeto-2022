package br.com.projeto.entra21.interfaces;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Dados;

public class ComportamentosPerfil extends Menu {

	static Scanner input = new Scanner(System.in);

	
	
	public ComportamentosPerfil(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte captureOption() {
		byte option = super.captureOption();

		switch (option) {
		case 1:
			iniciarPratica();
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:
			;
			break;

		}
		return option;
	}

	public static Duration iniciarPratica() {

		byte option;

		Instant inicio = Instant.now();

		do {

			System.out.println("Digite 1 para parar de praticar.");
			option = input.nextByte();

		} while (option != 1);

		Instant fim = Instant.now();

		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Voc� demorou " + tempo.toSeconds());
		return tempo;
		
		
	}

}
