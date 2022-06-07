package br.com.projeto.entra21.principal;

import java.util.Scanner;

import br.com.projeto.entra21.interfaces.Dados;

public class Login implements Dados {

	static Scanner input = new Scanner(System.in);

	public static void login() {

		email();

	}

	public static void email() {
		String usuarioEmail;
		boolean confirmacao = true;

		System.out.println("Informe o seu email:");
		usuarioEmail = input.next();

		do {
			if (usuarioEmail.equals(email.get(email.indexOf(usuarioEmail)))) {
				System.out.println("Cheguei aqui");
				// retornar um método listando o perfil dele,e dentro vai ter um método
				// praticar();

				confirmacao = true;
				
				System.out.println("Informe o seu email:");
				usuarioEmail = input.next();
				
			} else {
				confirmacao = false;
			}

		} while (confirmacao);

		System.out.println("Falso");

	}

}

