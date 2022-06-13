package br.com.projeto.entra21.principal;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.entra21.Menu;
import br.com.projeto.entra21.interfaces.Dados;

public class Register extends Menu implements Dados {

	static Scanner input = new Scanner(System.in);

	public Register(String title, ArrayList<String> options) {
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
			registerPerson();
			break;

		case 2:
			registerCoach();
			break;

		}
		return option;

	}

	public static void registerPerson() {

		System.out.println("Name: ");
		name.add(input.next());

		System.out.println("Email:");
		email.add(input.next());

		System.out.println("Phone");
		phone.add(input.next());

		System.out.println("Age:");
		age.add(input.next());

		System.out.println("Password:");
		password.add(input.next());

	}
	
	public static void registerCoach() {
		
	}

}
