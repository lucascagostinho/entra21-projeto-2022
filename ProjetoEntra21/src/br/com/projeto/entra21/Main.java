package br.com.projeto.entra21;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.cadastro.Login;
import br.com.projeto.entra21.principal.About;
import br.com.projeto.entra21.principal.Dados;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { // TODO 01-logica menu

		byte option; // TODO 01-logica variavel

		Dados.initializeLists();

		do { // TODO 01-logica do-while
			System.out.println(menu());
			try { // TODO 03-avan�ado exceptions
				option = input.nextByte(); // TODO 01-logica intera��o com o usu�rio
			} catch (InputMismatchException e) {

				option = -3;
				input = new Scanner(System.in);
			}

			switch (option) { // TODO 01-logica switch-case

			case 0:
				System.out.println("Going out...");
				break;

			case 1:
				Login.login(); 
				break;
				
			case 2:
				System.out.println(About.projectAbout());
				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0); // TODO 01-logica operador de igualdade
		System.out.println("Thank you and welcome back!");
	}

	@Reminder(value = "First menu options.")
	public static String menu() { // TODO 01-logica metodo com retorno
		
		String menu = "Entra21 Project Yellow Team\n\n";
		menu += "Choose an option:";
		menu += "\n\t0 - Exit"; // TODO 01-logica incremento
		menu += "\n\t1 - Login";
		menu += "\n\t2 - About";

		return menu;

	}

}