package br.com.projeto.entra21.principal;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.projeto.entra21.excessoes.StopPracticeException;
import br.com.projeto.entra21.menus.Menu;

public class ComportamentosPerfil extends Menu {

	private static final ArrayList<Pratice> PRATICAS = new ArrayList<Pratice>();

	static Scanner input = new Scanner(System.in);

	public ComportamentosPerfil(String title, ArrayList<String> subject) {
		super(title, subject);

	}

	@Override
	public byte captureOption() {
		byte option = super.captureOption();

		switch (option) {
		case 1:
			startPractice();
			break;

		}
		return option;
	}

	public static void startPractice() { // TODO 01-logica praticar

		byte optionPratice = 0;
		byte optionSport = 0;

		System.out.println("Informe o esporte que deseja praticar");
		for (int position = 0; position < Sports.values().length; position++) {
			System.out.println(position + " - " + Sports.values()[position].getValor());

		}
		try { // TODO 03-avançado exceptions
			optionSport = input.nextByte();

			if (optionSport > Sports.values().length - 1 || optionSport <= -1) {

				System.out.println("Invalid option:");
				input = new Scanner(System.in);
				ComportamentosPerfil.startPractice();

			}

		} catch (InputMismatchException e) { // TODO 03-avançado exceptions

			System.out.println("Invalid option:");
			input = new Scanner(System.in);
			ComportamentosPerfil.startPractice();

		}

		Instant start = Instant.now(); // TODO 01-logica duração inicio

		do {

			try { // TODO 03-avançado exceptions
				System.out.println("Enter 1 to practice.");
				optionPratice = input.nextByte();

				if (optionPratice != +1) {
					throw new StopPracticeException(); // TODO 04-logica throw e exception
				}

			} catch (InputMismatchException e) { // TODO 03-avançado exceptions

				input = new Scanner(System.in);

			} catch (StopPracticeException e) { // TODO 03-avançado exceptions personalizada

				input = new Scanner(System.in);
			}

		} while (optionPratice != 1);

		Instant end = Instant.now(); // TODO 01-logica duração fim

		Duration time = Duration.between(start, end); // TODO 01-logica duração total

		System.out
				.println("You practiced " + Sports.values()[optionSport] + " during " + time.toSeconds() + " seconds");

		PRATICAS.add(new Pratice(LocalDateTime.now(), time.toSeconds(), Sports.values()[optionSport])); // TODO
																										// 01-logica
																										// data + tempo

		PRATICAS.forEach(pratice -> {
			System.out.println(pratice);
		});

	}

}
