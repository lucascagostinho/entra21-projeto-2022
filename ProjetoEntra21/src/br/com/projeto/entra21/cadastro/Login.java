package br.com.projeto.entra21.cadastro;

import java.util.Scanner;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.MenuPrincipal;
import br.com.projeto.entra21.principal.Administrator;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;

import br.com.projeto.entra21.principal.Practitioner;

public class Login {

	static Scanner input = new Scanner(System.in);

	@Reminder(value = "Login logic")
	public static void login() { // TODO 01-logica login
		System.out.println("Inform the email");
		String email = input.next(); // TODO 01-logica interação com o usuário
		boolean located = false; // TODO 01-logica boolean
		for (Coach coach : Dados.coaches) { // TODO 01-logica for
			if (coach.getEmail().equals(email)) { // TODO 01-logica if
				located = true;
				if (checkPassword(coach.getPassword())) { // TODO 01-logica if-else
					MenuPrincipal.execute();
				} else {
					System.out.println("Senha incorreta para o coach");

				}
				return;
			}
		}
		for (Practitioner practitioner : Dados.practitioner) { // TODO 01-logica for
			if (practitioner.getEmail().equals(email)) { // TODO 01-logica if
				located = true;
				if (checkPassword(practitioner.getPassword())) { // TODO 01-logica if-else
					MenuPrincipal.execute();
				} else {
					System.out.println("Incorrect password for practitioner");

				}
				return;
			}

		}

		for (Administrator administrator : Dados.administrator) { // TODO 01-logica for
			if (administrator.getEmail().equals(email)) { // TODO 01-logica if
				located = true;
				if (checkPassword(administrator.getPassword())) { // TODO 01-logica if-else
					MenuPrincipal.execute();
				} else {
					System.out.println("Incorrect password for practitioner");

				}
				return;
			}

		}

	}

	@Reminder(value = "Capture and return password")
	private static boolean checkPassword(String password) { // TODO 01-logica metodo com retorno e parâmetro
		System.out.println("Inform the password");

		return password.equals(input.next()); // TODO 01-logica interação com o usuário
	}

}
