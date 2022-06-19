package br.com.projeto.entra21.menus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.principal.ComportamentosPerfil;

public class MenuPrincipal extends ComportamentosPerfil {

	public MenuPrincipal(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);

	}

	static Scanner input = new Scanner(System.in);

	@Reminder(value = "Vai para o menu principal")
	public static void executar() {
		byte option = 0;

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
				System.out.println("Returning...");
				break;

			case 1:
				new MenuCadastro("Menu de Cadastros", new ArrayList<>(Arrays.asList("Coachs", "Praticantes")))
						.optionsMenu();
				break;

			case 2:
				ComportamentosPerfil.iniciarPratica();
				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0);
	}

	@Reminder(value = "Opções do menu principal")
	public static String menu() {

		String menu = "Choose an option:";
		menu += "\n\t0 - Exit";
		menu += "\n\t1 - Cadastros";
		menu += "\n\t2 - Praticar";

		return menu;

	}

}
