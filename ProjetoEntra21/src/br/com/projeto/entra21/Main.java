package br.com.projeto.entra21;

import java.util.Scanner;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.cadastro.Login;
import br.com.projeto.entra21.principal.Dados;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { // TODO 01-logica menu

		byte option = 0;
		Dados.inicializarListas();
		do { // TODO 01-logica do-while
			System.out.println(menu());
			try { // TODO 03-avançado exceptions
				option = input.nextByte();
			} catch (Exception e) {

				System.out.println("Invalid option.");
				option = -2;
				continue;
			}

			switch (option) {

			case 0:
				System.out.println("Going out...");
				break;

			case 1:
				Login.login();
				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0); // TODO 01-logica operador de igualdade
		System.out.println("Thank you and welcome back!");
	}

	@Reminder(value = "Opções do primeiro menu.")
	public static String menu() {

		String menu = "Choose an option:";
		menu += "\n\t0 - Exit"; // TODO 01-logica incremento
		menu += "\n\t1 - Login";

		return menu;

	}

}