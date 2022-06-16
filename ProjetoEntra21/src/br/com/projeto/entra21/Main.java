package br.com.projeto.entra21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.projeto.entra21.cadastro.Login;
import br.com.projeto.entra21.cadastro.Register;
import br.com.projeto.entra21.principal.Dados;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option = 0;
		Dados.inicializarListas();
		do {
			System.out.println(menu());
			try {
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

		} while (option != 0);
		System.out.println("Thank you and welcome back!");
	}

	public static String menu() {

		String menu = "Choose an option:";
		menu += "\n\t0 - Exit";
		menu += "\n\t1 - Login";
		

		return menu;

	}

}