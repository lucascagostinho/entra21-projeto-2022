package br.com.projeto.entra21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.projeto.entra21.principal.Register;
import br.com.projeto.entra21.principal.Login;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option = 0;

		do {
			System.out.println(menu());
			try {
				option = input.nextByte();
			} catch (Exception e) {

				System.out.println("Invalid option.");
			}

			switch (option) {

			case 0:
				System.out.println("Going out...");
				break;

			case 1:
				new Register("Register", new ArrayList<>(Arrays.asList("Register Person", "RegisterCoach")))
						.optionsMenu();
				break;

			case 2:
				new Login("Login", new ArrayList<>(Arrays.asList("Login"))).optionsMenu();
				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0);
		System.out.println("Thank you and welcome back!");
	}

	public static String menu() {

		String menu = "Choose an option:";
		menu += "\n\t0 - Exit";
		menu += "\n\t1 - Register";
		menu += "\n\t2 - Login";

		return menu;

	}

}