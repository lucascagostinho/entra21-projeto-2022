package br.com.projeto.entra21.menus;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.principal.Perfil;

public class Menu {

	private Scanner input = new Scanner(System.in);
	private String title;
	private ArrayList<String> options;

	public Menu(String titulo, ArrayList<String> assuntos) {
		super();
		this.title = titulo;
		this.options = assuntos;
	}

	@Reminder(value = "Lógica do Menu")
	public void optionsMenu() {
		do {
			System.out.println("------------------" + this.title + "------------------");
			System.out.println("-1 = Exit");
			System.out.println(" 0 = Back");
			if (options != null && !options.isEmpty()) {
				for (int counter = 0; counter < options.size(); counter++) {
					System.out.println(" " + (counter + 1) + " = " + options.get(counter));
				}
			} else {
				System.out.println("There is no such option in the menu.");
			}

		} while (captureOption() != 0);
	}

	@Reminder(value = "Construção do Menu")
	public byte captureOption() {
		byte option;
		option = input.nextByte();

		switch (option) {

		case -1:
			System.exit(-1);
			break;
		case 0:
			System.out.println("Returning...");
			break;
		}
		return option;
	}

	public String getTitle() {
		return title;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public Scanner inputEntrada() {
		return input;
	}

	public Perfil search() {
		
		return null;
	}

}
