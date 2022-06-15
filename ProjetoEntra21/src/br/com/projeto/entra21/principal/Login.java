package br.com.projeto.entra21.principal;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.entra21.Menu;
import br.com.projeto.entra21.interfaces.Dados;
import br.com.projeto.entra21.menus.MenuPrincipal;

// Precisa ser ajustado

public class Login extends Menu implements Dados {

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
		String usuarioEmail;

		System.out.println("Your email:");
		usuarioEmail = input.next();

		try {
			for (Perfil perfil : perfis) {
				if (perfil.getEmail().equals(usuarioEmail)) {
					System.out.println("Cheguei aqui");
					MenuPrincipal.executar();
				}

			}

		} catch (Exception e) {

			System.out.println("User doesn't exist.");
		}

	}

}
