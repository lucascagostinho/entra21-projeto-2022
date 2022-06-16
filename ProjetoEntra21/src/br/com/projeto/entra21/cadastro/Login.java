package br.com.projeto.entra21.cadastro;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.menus.MenuPrincipal;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;
import br.com.projeto.entra21.principal.Perfil;
import br.com.projeto.entra21.principal.Praticante;

// Precisa ser ajustado

public class Login extends Menu {

	public Login(String title, ArrayList<String> options) {
		super(title, options);

	}

	@Override
	public byte captureOption() {

		byte option = 0;

		try {
			option = super.captureOption();
		} catch (Exception e) {

			System.out.println("Invalid option.");
		}

		switch (option) {

		case 1:
			login();
			break;

		}
		return option;

	}

	static Scanner input = new Scanner(System.in);

	public static void login() {
		System.out.println("Informe o email");
		String email = input.next();
		boolean localizado = false;
		for (Coach coach : Dados.coachs) {
			if (coach.getEmail().equals(email)) {
				localizado = true;
				if (verificarSenha(coach.getPassword())) {
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o coach");

				}
				return;
			}
		}
		for (Praticante praticante : Dados.praticantes) {
			if (praticante.getEmail().equals(email)) {
				localizado = true;
				if (verificarSenha(praticante.getPassword())) {
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o praticante");

				}
				return;
			}

		}
		if (!localizado) {
			System.out.println("Não existe ninguém com esse e-mail");
		}
	}

	private static boolean verificarSenha(String password) {
		System.out.println("Informe a senha");

		return password.equals(input.next());
	}

}
