package br.com.projeto.entra21.principal;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.projeto.entra21.excessoes.PararPraticaException;
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

	public static void iniciarPratica() { //TODO 01-logica praticar

		byte optionPratica = 0;
		byte optionEsporte = 0;

		System.out.println("Informe o esporte que deseja praticar");
		for (int posicao = 0; posicao < Esportes.values().length; posicao++) {
			System.out.println(posicao + " - " + Esportes.values()[posicao].getValor());

		}
		try { //TODO 03-avançado exceptions
			optionEsporte = input.nextByte(); 

			if (optionEsporte > Esportes.values().length - 1 || optionEsporte <= -1) { 
				
				System.out.println("Invalid option:");
				input = new Scanner(System.in);
				ComportamentosPerfil.iniciarPratica();

			}

		} catch (InputMismatchException e) { //TODO 03-avançado exceptions

			System.out.println("Invalid option:");
			input = new Scanner(System.in);
			ComportamentosPerfil.iniciarPratica();

		}

		Instant inicio = Instant.now(); //TODO 01-logica duração inicio

		do {

			try { //TODO 03-avançado exceptions
				System.out.println("Digite 1 para parar de praticar.");
				optionPratica = input.nextByte();
				
				if(optionPratica != +1) {
					throw new PararPraticaException(); //TODO 04-logica throw e exception
				}
				
			} catch (InputMismatchException e) { //TODO 03-avançado exceptions
				
				input = new Scanner(System.in);
				
			}catch(PararPraticaException e) { //TODO 03-avançado exceptions personalizada
				
				input = new Scanner(System.in);
			}

		} while (optionPratica != 1);

		Instant fim = Instant.now(); //TODO 01-logica duração fim

		Duration tempo = Duration.between(inicio, fim); //TODO 01-logica duração total 

		System.out.println(
				"Você Praticou " + Esportes.values()[optionEsporte] + " durante " + tempo.toSeconds() + " segundos");

		PRATICAS.add(new Pratica(LocalDateTime.now(), tempo.toSeconds(), Esportes.values()[optionEsporte])); //TODO 01-logica data + tempo

		PRATICAS.forEach(pratica -> {
			System.out.println(pratica);
		});

	}

}
