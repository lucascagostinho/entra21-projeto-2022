package br.com.projeto.entra21.crud;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;


public class CoachCRUD extends Menu implements ICrud<Coach> {

	public CoachCRUD(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte captureOption() { //TODO 02-logica-herança
		byte option = super.captureOption();

		switch (option) {
		case 1:
			list(Dados.coachs);
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

	@Reminder(value = "Acessa a lista de coachs")
	@Override
	public void list(ArrayList<Coach> list) {
		list.forEach(coach -> {
			System.out.println(coach.getEmail() + "---" + coach.getName());
		});

	}

	@Reminder(value = "Adiciona um novo coach")
	@Override
	public void add() {
		Coach novo = captureValues();
		if (search(novo) != null) {
			System.out.println("Não foi possível adicionar");
		} else {
			Dados.coachs.add(novo);
			System.out.println("Coach adicionado");
		}
	}

	@Reminder(value = "Busca dentro da lista de coachs")
	@Override
	public Coach search(Coach key) {
		Coach encontradoCoach = null;
		for (Coach coach : Dados.coachs) {
			if (coach.getEmail().equals(key.getEmail())) {
				return coach;
			}
		}
		return null;
	}

	@Reminder(value = "Edita um coach já existente.")
	@Override
	public void edit(Coach key) {
		Coach atual = search(key);
		if (atual != null) {
			System.out.println("Alterando o Coach");
			Coach editado = captureValues();
			Dados.coachs.set(Dados.coachs.indexOf(atual), editado);
			System.out.println("Coach editado");
		} else {
			System.out.println("Não foi possivel editar");
		}

	}

	@Reminder(value = "Deleta um coach")
	@Override
	public void delete(Coach key) {
		Coach busca = search(key);
		if (busca == null) {
			System.out.println("Não foi possivel deletar");
		} else {
			System.out.println("Coach deletado");
			Dados.coachs.remove(busca);
		}

	}

	@Reminder(value = "Captura uma chave para coach")
	@Override
	public Coach captureKey() {
		System.out.println("Informe o email");
		Coach chave = new Coach();
		chave.setEmail(super.inputEntrada().next());
		return chave;
	}

	@Reminder(value = "Captura um valor para coach")
	@Override
	public Coach captureValues() {
		Coach formulario = new Coach();
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

	@Reminder(value = "Acessa os detalhes do coach")
	@Override
	public void viewDetails(Coach complete) {
		if (complete == null) {
			System.out.println("Nenhum Coach localizado");
		} else {
			System.out.println("Coach: " + complete.getName());
			System.out.println("Email " + complete.getEmail());
			System.out.println("Frase Motivacional " + complete.getFraseMotivacional());
			System.out.println("Data Nascimento " + complete.getBirthDate());
		}
	}

}
