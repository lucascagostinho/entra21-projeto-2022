package br.com.projeto.entra21.menus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.principal.ComportamentosPerfil;

public class MenuPrincipal extends ComportamentosPerfil {

	public MenuPrincipal(String title, ArrayList<String> subject) {
		super(title, subject);

	}

	static Scanner input = new Scanner(System.in);

	@Reminder(value = "Go to main menu")
	public static void execute() {
		byte option = 0;

		do { // TODO 01-logica do-while
			System.out.println(menu());
			try { // TODO 03-avançado exceptions
				option = input.nextByte(); // TODO 01-logica interação com o usuário
			} catch (InputMismatchException e) {

				option = -2;
				input = new Scanner(System.in);

			}

			switch (option) { // TODO 01-logica switch-case

			case 0:
				System.out.println("Returning...");
				break;

			case 1:
				new MenuCadastro("Registration menu", new ArrayList<>(Arrays.asList("Coaches", "Practitioners")))
						.optionsMenu();
				break;

			case 2:
				ComportamentosPerfil.startPractice();
				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0);
	}

	@Reminder(value = "Main menu options")
	public static String menu() { // TODO 01-logica menu

		String menu = "Choose an option:";
		menu += "\n\t0 - Back";
		menu += "\n\t1 - Register";
		menu += "\n\t2 - Pratice";

		return menu;

	}

}
