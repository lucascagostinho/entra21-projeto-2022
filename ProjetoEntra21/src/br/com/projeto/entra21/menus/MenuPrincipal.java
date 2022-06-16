package br.com.projeto.entra21.menus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.projeto.entra21.cadastro.Login;
import br.com.projeto.entra21.cadastro.Register;

public class MenuPrincipal {

	static Scanner input = new Scanner(System.in);
//https://github.com/oliota/entra21-modelo-projeto-backend-2022/blob/agil-logica-poo-avancado/ModeloBackendEntra21-2022/src/br/com/entra21/modelo2022/backend/area/logada/cadastros/crud/ClienteCRUD.java
	// link exemplo prof
	
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
				System.out.println("Going out...");
				break;

			case 1:
				new MenuCadastro("Menu de Cadastros", new ArrayList<>(Arrays.asList("coachs","praticantes"))).optionsMenu();
				break;

			case 2:

				break;

			default:
				System.out.println("Invalid option");
				break;

			}

		} while (option != 0);
	}

	public static String menu() {

		String menu = "Choose an option:";
		menu += "\n\t0 - Exit";
		menu += "\n\t1 - Cadastros";
		menu += "\n\t2 - OP2";

		return menu;

	}

}
