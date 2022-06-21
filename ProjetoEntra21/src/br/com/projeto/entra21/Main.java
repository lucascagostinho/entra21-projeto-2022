package br.com.projeto.entra21;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.cadastro.Login;
import br.com.projeto.entra21.principal.Dados;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { // TODO 01-logica menu

		byte option; // TODO 01-logica variavel

		Dados.inicializarListas();

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
				System.out.println("Going out...");
				break;

			case 1:
				Login.login(); // Retornar mensagem de usuário não existe quando digitar um e email não
								// existente
				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0); // TODO 01-logica operador de igualdade
		System.out.println("Thank you and welcome back!");
	}

	@Reminder(value = "Opções do primeiro menu.")
	public static String menu() { // TODO 01-logica metodo com retorno

		String menu = "Choose an option:";
		menu += "\n\t0 - Exit"; // TODO 01-logica incremento
		menu += "\n\t1 - Login";

		return menu;

	}

}