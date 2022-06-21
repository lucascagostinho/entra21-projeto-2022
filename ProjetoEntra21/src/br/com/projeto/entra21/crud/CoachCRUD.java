package br.com.projeto.entra21.crud;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;

public class CoachCRUD extends Menu implements ICrud<Coach> {

	public CoachCRUD(String title, ArrayList<String> subject) {
		super(title, subject);
	}

	@Override
	public byte captureOption() { // TODO 02-poo herança
		byte option = super.captureOption();

		switch (option) {
		case 1:
			list(Dados.coaches);
			break;
		case 2:
			add();
			break;
		case 3:
			viewDetails(search(captureKey()));
			break;
		case 4:
			edit(captureKey());
			break;
		case 5:
			delete(captureKey());
			break;

		}
		return option;
	}

	@Reminder(value = "Access the list of Coaches")
	@Override
	public void list(ArrayList<Coach> list) {
		list.forEach(coach -> {
			System.out.println(coach.getEmail() + "---" + coach.getName());
		});

	}

	@Reminder(value = "Add a new Coach")
	@Override
	public void add() {
		Coach addNew = captureValues();
		if (search(addNew) != null) {
			System.out.println("Could not add");
		} else {
			Dados.coaches.add(addNew);
			System.out.println("Added Coach");
		}
	}

	@Reminder(value = "Search within the Coaches list")
	@Override
	public Coach search(Coach key) {
		Coach foundCoach = null;
		for (Coach coach : Dados.coaches) {
			if (coach.getEmail().equals(key.getEmail())) {
				return coach;
			}
		}
		return null;
	}

	@Reminder(value = "Edit an existing Coach.")
	@Override
	public void edit(Coach key) {
		Coach atual = search(key);
		if (atual != null) {
			System.out.println("Changing the Coach");
			Coach editado = captureValues();
			Dados.coaches.set(Dados.coaches.indexOf(atual), editado);
			System.out.println("Edited Coach");
		} else {
			System.out.println("Could not edit");
		}

	}

	@Reminder(value = "Delete a Coach")
	@Override
	public void delete(Coach key) {
		Coach search = search(key);
		if (search == null) {
			System.out.println("Could not delete");
		} else {
			System.out.println("Coach deleted");
			Dados.coaches.remove(search);
		}

	}

	@Reminder(value = "Capture a key for coach")
	@Override
	public Coach captureKey() {
		System.out.println("Inform the email");
		Coach key = new Coach();
		key.setEmail(super.inputEntrada().next());
		return key;
	}

	@Reminder(value = "Capture a value for coach")
	@Override
	public Coach captureValues() {
		Coach form = new Coach();
		System.out.println("Name: ");
		form.setName(super.getInput().next());

		System.out.println("Email:");
		form.setEmail(super.getInput().next());

		System.out.println("BirthDate:");
		form.setBirthDate(super.getInput().next());

		System.out.println("Password:");
		form.setPassword(super.getInput().next());
		return form;
	}

	@Reminder(value = "Access coach details")
	@Override
	public void viewDetails(Coach complete) {
		if (complete == null) {
			System.out.println("No coach found");
		} else {
			System.out.println("Coach: " + complete.getName());
			System.out.println("Email " + complete.getEmail());
			System.out.println("Date of birth " + complete.getBirthDate());
		}
	}

}
