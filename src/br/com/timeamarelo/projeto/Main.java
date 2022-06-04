package br.com.timeamarelo.projeto;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(menu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				// cadastro
				break;

			case 2:
				// login
				break;

			default:
				System.out.println("Digite uma opção válida...");
				break;
			}

		} while (option != 0);
		System.out.println("Volte sempre.");
	}

	private static String menu() {

		String menu = "Escolha uma opção do menu\n";
		menu += "\n0 - Sair";
		menu += "\n1 - Criar Cadastro";
		menu += "\n2 - Login";

		return menu;

	}

}
