package br.com.projeto.entra21.menus;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.crud.CoachCRUD;
import br.com.projeto.entra21.crud.ICrud;
import br.com.projeto.entra21.crud.PractitionerCRUD;

@Reminder(value = "Menu that calls the registration logic.")
public class MenuCadastro extends Menu {

	public MenuCadastro(String title, ArrayList<String> subject) {
		super(title, subject);
	}

	@Override
	public byte captureOption() { // TODO 02-logica herança
		byte option = super.captureOption();

		switch (option) { // TODO 01-logica switch-case
		case 1:
			new CoachCRUD("Coach registration", ICrud.options).optionsMenu();
			break;

		case 2:
			new PractitionerCRUD("Registration of Practitioners", ICrud.options).optionsMenu();
			break;
		}
		return option;

	}

}
