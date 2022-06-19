package br.com.projeto.entra21.principal;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Cria e inicializa os usu�rios.")
public class Dados {

	public static ArrayList<Coach> coachs = new ArrayList<>();
	public static ArrayList<Praticante> praticantes = new ArrayList<>();

	@Reminder(value = "Inicializa as listas de usu�rios.")
	public static void inicializarListas() {

		inicializarCoachs();
		inicializarPraticantes();
	}

	@Reminder(value = "Inicializa as listas de coachs.")
	public static void inicializarCoachs() {
	
		Coach coach1 = new Coach("Stephanie", "Dias", "27/11/1993", "F", "stephanie@email.com", "1234", "gradua��o"); //LocalDate ver no Crud cursos Prof
		coach1.setFraseMotivacional("� pra frente que se anda");
		coachs.add(coach1);
		coachs.add(new Coach("Jos�", "Silva", "23/08/1998", "m", "jose@email.com", "1234", "gradua��o"));
		
	}
	@Reminder(value = "Inicializa as listas de praticantes.")
	private static void inicializarPraticantes() {
		praticantes.add(new Praticante("Maria", "Souza", "10/09/2000", "F", "maria@email.com", "1234", "gradua��o"));
		praticantes.add(new Praticante("Fernanda", "Ventura", "02/05/1994", "F", "fernanda@email.com", "1234", "gradua��o"));

		
	}
	
}
