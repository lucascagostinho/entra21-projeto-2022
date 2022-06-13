package br.com.projeto.entra21.principal;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.entra21.Menu;
import br.com.projeto.entra21.interfaces.Dados;

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
			if (usuarioEmail.equals(email.get(email.indexOf(usuarioEmail)))) {
				System.out.println("Cheguei aqui");
				// retornar um método listando o perfil dele,e dentro vai ter um método
				// praticar();

			}
		} catch (Exception e) {

			System.out.println("User doesn't exist.");
		}

	}

}
