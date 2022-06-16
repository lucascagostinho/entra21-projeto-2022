package br.com.projeto.entra21.cadastro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.com.projeto.entra21.crud.ICrud;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Perfil;

public class Register extends Menu {

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
		case 3:
			recoverPassword();
			break;

		}
		return option;

	}

	public Perfil registerPerson() {

		Perfil formulario = new Perfil();
		System.out.println("Name: ");
		formulario.setName(super.getInput().next());

		System.out.println("Email:");
		formulario.setEmail(super.getInput().next());

		System.out.println("BirthDate:");
		formulario.setBirthDate(super.getInput().next());

		System.out.println("Password:");
		formulario.setPassword(super.getInput().next());

		return formulario;

	}

	public Perfil registerCoach() {

		Perfil formulario = new Perfil();
		System.out.println("Name: ");
		formulario.setName(super.getInput().next());

		System.out.println("Email:");
		formulario.setEmail(super.getInput().next());

		System.out.println("BirthDate:");
		formulario.setBirthDate(super.getInput().next());

		System.out.println("Password:");
		formulario.setPassword(super.getInput().next());

		System.out.println("Graduation");
		formulario.setGraduation(super.getInput().next());

		return formulario;

	}

	private void recoverPassword() {

	}

}
