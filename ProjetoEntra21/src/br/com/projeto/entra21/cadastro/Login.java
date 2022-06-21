package br.com.projeto.entra21.cadastro;

import java.util.Scanner;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.MenuPrincipal;
import br.com.projeto.entra21.principal.Administrador;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;

import br.com.projeto.entra21.principal.Praticante;

public class Login {

	static Scanner input = new Scanner(System.in);

	@Reminder(value = "L�gica do login")
	public static void login() { // TODO 01-logica login
		System.out.println("Informe o email");
		String email = input.next(); // TODO 01-logica intera��o com o usu�rio
		boolean localizado = false; // TODO 01-logica boolean
		for (Coach coach : Dados.coachs) { // TODO 01-logica for
			if (coach.getEmail().equals(email)) { // TODO 01-logica if
				localizado = true;
				if (verificarSenha(coach.getPassword())) { // TODO 01-logica if-else
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o coach");

				}
				return;
			}
		}
		for (Praticante praticante : Dados.praticantes) { // TODO 01-logica for
			if (praticante.getEmail().equals(email)) { // TODO 01-logica if
				localizado = true;
				if (verificarSenha(praticante.getPassword())) { // TODO 01-logica if-else
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o praticante");

				}
				return;
			}

		}
		
		for (Administrador administrador : Dados.administrador) { // TODO 01-logica for
			if (administrador.getEmail().equals(email)) { // TODO 01-logica if
				localizado = true;
				if (verificarSenha(administrador.getPassword())) { // TODO 01-logica if-else
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o praticante");

				}
				return;
			}

		}

	}

	@Reminder(value = "Captura e retorna a senha")
	private static boolean verificarSenha(String password) { // TODO 01-logica metodo com retorno e par�metro
		System.out.println("Informe a senha");

		return password.equals(input.next()); // TODO 01-logica intera��o com o usu�rio
	}

}
