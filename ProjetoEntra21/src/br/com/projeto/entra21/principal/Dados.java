package br.com.projeto.entra21.principal;

import java.util.ArrayList;

public class Dados {

	public static ArrayList<Coach> coachs = new ArrayList<>();
	public static ArrayList<Praticante> praticantes = new ArrayList<>();

	public static void inicializarListas() {

		inicializarCoachs();
		inicializarPraticantes();
	}


	public static void inicializarCoachs() {
	
		Coach coach1 = new Coach("Stephanie", "Dias", "27/11/1993", "F", "stephanie@email.com", "1234", "graduação"); //LocalDate ver no Crud cursos Prof
		coach1.setFraseMotivacional("é pra frente que se anda");
		coachs.add(coach1);
		coachs.add(new Coach("José", "Silva", "23/08/1998", "m", "josé@email.com", "1234", "graduação"));
		
	}
	
	private static void inicializarPraticantes() {
		praticantes.add(new Praticante("Maria", "Souza", "10/09/2000", "F", "maria@email.com", "1234", "graduação"));
		praticantes.add(new Praticante("Fernanda", "Ventura", "02/05/1994", "F", "fernanda@email.com", "1234", "graduação"));

		
	}
	
}
