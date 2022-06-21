package br.com.projeto.entra21.crud;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Administrator;
import br.com.projeto.entra21.principal.Dados;

public class AdministratorCRUD extends Menu implements ICrud<Administrator> {

	public AdministratorCRUD(String title, ArrayList<String> subject) {
		super(title, subject);
	}

	@Override
	public byte captureOption() { // TODO 02-poo herança
		byte option = super.captureOption();

		switch (option) {
		case 1:
			list(Dados.administrator);
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

	@Reminder(value = "Access the admin list")
	@Override
	public void list(ArrayList<Administrator> list) {
		list.forEach(administrador -> {
			System.out.println(administrador.getEmail() + "---" + administrador.getName());
		});

	}

	@Reminder(value = "Add a new admin")
	@Override
	public void add() {
		Administrator addNew = captureValues();
		if (search(addNew) != null) {
			System.out.println("Could not add");
		} else {
			Dados.administrator.add(addNew);
			System.out.println("Admin added");
		}
	}

	@Reminder(value = "Search within the admin list")
	@Override
	public Administrator search(Administrator key) {
		Administrator foundAdm = null;
		for (Administrator admin : Dados.administrator) {
			if (admin.getEmail().equals(key.getEmail())) {
				return admin;
			}
		}
		return null;
	}

	@Reminder(value = "edit an existing admin.")
	@Override
	public void edit(Administrator key) {
		Administrator current = search(key);
		if (current != null) {
			System.out.println("Changing the admin");
			Administrator edited = captureValues();
			Dados.administrator.set(Dados.administrator.indexOf(current), edited);
			System.out.println("Admin edited");
		} else {
			System.out.println("Could not edit");
		}

	}

	@Reminder(value = "Delete admin")
	@Override
	public void delete(Administrator key) {
		Administrator search = search(key);
		if (search == null) {
			System.out.println("Could not delete");
		} else {
			System.out.println("Admin deleted");
			Dados.coaches.remove(search);
		}

	}

	@Reminder(value = "Capture a key for admin")
	@Override
	public Administrator captureKey() {
		System.out.println("Inform the email");
		Administrator key = new Administrator();
		key.setEmail(super.inputEntrada().next());
		return key;
	}

	@Reminder(value = "Capture a value for admin")
	@Override
	public Administrator captureValues() {
		Administrator form = new Administrator();
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

	@Reminder(value = "Access admin details")
	@Override
	public void viewDetails(Administrator complete) {
		if (complete == null) {
			System.out.println("No admin found");
		} else {
			System.out.println("Admin: " + complete.getName());
			System.out.println("Email " + complete.getEmail());
			System.out.println("Date of birth " + complete.getBirthDate());
		}
	}

}
