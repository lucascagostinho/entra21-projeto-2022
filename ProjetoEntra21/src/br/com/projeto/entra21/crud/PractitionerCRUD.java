package br.com.projeto.entra21.crud;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Dados;
import br.com.projeto.entra21.principal.Practitioner;

public class PractitionerCRUD extends Menu implements ICrud<Practitioner> {

	public PractitionerCRUD(String title, ArrayList<String> subject) {
		super(title, subject);
	}

	@Override
	public byte captureOption() { // TODO 02-logica herança
		byte option = super.captureOption();

		switch (option) {
		case 1:
			list(Dados.practitioner);
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

	@Reminder(value = "Access the list of Practitioners")
	@Override
	public void list(ArrayList<Practitioner> list) {
		list.forEach(practitioner -> {
			System.out.println(practitioner.getEmail() + "---" + practitioner.getName());
		});

	}

	@Reminder(value = "Add a new Practitioner")
	@Override
	public void add() {
		Practitioner addNew = captureValues();
		if (search(addNew) != null) {
			System.out.println("Could not add");
		} else {
			Dados.practitioner.add(addNew);
			System.out.println("Added Practitioner");
		}
	}

	@Reminder(value = "Search within the list of Practitioners")
	@Override
	public Practitioner search(Practitioner key) {
		Practitioner found = null;
		for (Practitioner practitioner : Dados.practitioner) {
			if (practitioner.getEmail().equals(key.getEmail())) {
				return practitioner;
			}
		}
		return null;
	}

	@Reminder(value = "Edit an existing Practitioner.")
	@Override
	public void edit(Practitioner key) {
		Practitioner current = search(key);
		if (current != null) {
			System.out.println("Changing the Practitioner");
			Practitioner edited = captureValues();
			Dados.practitioner.set(Dados.practitioner.indexOf(current), edited);
			System.out.println("Edited Practitioner");
		} else {
			System.out.println("Could not edit");
		}

	}

	@Reminder(value = "Delete a Practitioner")
	@Override
	public void delete(Practitioner key) {
		Practitioner search = search(key);
		if (search == null) {
			System.out.println("Could not delete");
		} else {
			System.out.println("Deleted Practitioner");
			Dados.practitioner.remove(search);
		}

	}

	@Reminder(value = "Capture a Practitioner key")
	@Override
	public Practitioner captureKey() {
		System.out.println("Inform the email");
		Practitioner key = new Practitioner();
		key.setEmail(super.inputEntrada().next());
		return key;
	}

	@Reminder(value = "Capture a value for Practitioner")
	@Override
	public Practitioner captureValues() {
		Practitioner form = new Practitioner();
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

	@Reminder(value = "Access practitioner details")
	@Override
	public void viewDetails(Practitioner complete) {
		if (complete == null) {
			System.out.println("No Practitioner found");
		} else {
			System.out.println("Practitioner: " + complete.getName());
			System.out.println("Email " + complete.getEmail());
			System.out.println("Date of birth " + complete.getBirthDate());
		}
	}

}
