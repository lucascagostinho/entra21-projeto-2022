package br.com.projeto.entra21.menus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.principal.Perfil;

public class Menu {

	private Scanner input = new Scanner(System.in);
	private String title;
	private ArrayList<String> options;

	public Menu(String title, ArrayList<String> subject) {
		super();
		this.title = title;
		this.options = subject;
	}

	@Reminder(value = "Menu logic") // TODO 01-logica menu
	public void optionsMenu() {
		do { // TODO 01-logica do-while
			System.out.println("------------------" + this.title + "------------------");
			System.out.println("-1 = Exit");
			System.out.println(" 0 = Back");
			if (options != null && !options.isEmpty()) { // TODO 01-logica if-else
				for (int counter = 0; counter < options.size(); counter++) { // TODO 01-logica for
					System.out.println(" " + (counter + 1) + " = " + options.get(counter));
				}
			} else {
				System.out.println("There is no such option in the menu.");
			}

		} while (captureOption() != 0);
	}

	@Reminder(value = "Menu Construction")
	public byte captureOption() {

		try {
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

		} catch (InputMismatchException e) {
			System.out.println("Invalid option, try again:");
			input = new Scanner(System.in);
			return captureOption();
		}
	}

	public String getTitle() { // TODO 02-logica encapsulamento
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
