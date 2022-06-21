package br.com.projeto.entra21.principal;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Create and initialize user.")
public class Dados {

	// TODO 01-logica ArrayList
	public static ArrayList<Administrator> administrator = new ArrayList<>(); // TODO 01-logica ArrayList
	public static ArrayList<Coach> coaches = new ArrayList<>();
	public static ArrayList<Practitioner> practitioner = new ArrayList<>();

	@Reminder(value = "Initialize user lists.")
	public static void initializeLists() {

		initializeAdministrator();
		inicializerCoaches();
		inicializerPractitioner();
	}

	@Reminder(value = "Initializes the Coach lists.")
	public static void inicializerCoaches() {

		coaches.add(new Coach("Stephanie", "Dias", "27/11/1993", "F", "stephanie@email.com", "1234", "graduation"));

	}

	@Reminder(value = "Initializes lists of Practitioners.")
	private static void inicializerPractitioner() {

		practitioner
				.add(new Practitioner("Maria", "Souza", "10/09/2000", "F", "maria@email.com", "1234", "graduation"));
	}

	@Reminder(value = "Initialize Admin lists.")
	private static void initializeAdministrator() {
		administrator.add(
				new Administrator("Administrator", "Adm", "10/09/2000", "F", "adm@email.com", "1234", "gratuation"));

	}

}
