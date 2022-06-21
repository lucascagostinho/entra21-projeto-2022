package br.com.projeto.entra21.principal;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Cria e inicializa os usuários.")
public class Dados {

	public static ArrayList<Administrador> administrador = new ArrayList<>();
	public static ArrayList<Coach> coachs = new ArrayList<>();
	public static ArrayList<Praticante> praticantes = new ArrayList<>();

	@Reminder(value = "Inicializa as listas de usuários.")
	public static void inicializarListas() {

		inicializarAdministrador();
		inicializarCoachs();
		inicializarPraticantes();
	}

	@Reminder(value = "Inicializa as listas de coachs.")
	public static void inicializarCoachs() {

		Coach coach = new Coach("Stephanie", "Dias", "27/11/1993", "F", "stephanie@email.com", "1234", "graduação");

	}

	@Reminder(value = "Inicializa as listas de praticantes.")
	private static void inicializarPraticantes() {

		praticantes.add(new Praticante("Maria", "Souza", "10/09/2000", "F", "maria@email.com", "1234", "graduação"));
	}

	@Reminder(value = "Inicializa as listas de admins.")
	private static void inicializarAdministrador() {
		administrador.add(new Administrador("Administrador", "Adm", "10/09/2000", "F", "adm@email.com", "1234", "graduação"));

	}

}
