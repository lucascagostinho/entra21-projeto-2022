package br.com.projeto.entra21.crud;

import java.util.ArrayList;

import br.com.projeto.entra21.annotations.Reminder;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Administrador;
import br.com.projeto.entra21.principal.Dados;


public class AdministradorCRUD extends Menu implements ICrud<Administrador> {

	public AdministradorCRUD(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte captureOption() { //TODO 02-logica herança
		byte option = super.captureOption();

		switch (option) {
		case 1:
			list(Dados.administrador);
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

	@Reminder(value = "Acessa a lista de admins")
	@Override
	public void list(ArrayList<Administrador> list) {
		list.forEach(administrador -> {
			System.out.println(administrador.getEmail() + "---" + administrador.getName());
		});

	}

	@Reminder(value = "Adiciona um novo admin")
	@Override
	public void add() {
		Administrador novo = captureValues();
		if (search(novo) != null) {
			System.out.println("Não foi possível adicionar");
		} else {
			Dados.administrador.add(novo);
			System.out.println("Administrador adicionado");
		}
	}

	@Reminder(value = "Busca dentro da lista de admins")
	@Override
	public Administrador search(Administrador key) {
		Administrador encontradoAdmin = null;
		for (Administrador admin : Dados.administrador) {
			if (admin.getEmail().equals(key.getEmail())) {
				return admin;
			}
		}
		return null;
	}

	@Reminder(value = "Edita um admin já existente.")
	@Override
	public void edit(Administrador key) {
		Administrador atual = search(key);
		if (atual != null) {
			System.out.println("Alterando o Coach");
			Administrador editado = captureValues();
			Dados.administrador.set(Dados.administrador.indexOf(atual), editado);
			System.out.println("Administrador editado");
		} else {
			System.out.println("Não foi possivel editar");
		}

	}

	@Reminder(value = "Deleta um admin")
	@Override
	public void delete(Administrador key) {
		Administrador busca = search(key);
		if (busca == null) {
			System.out.println("Não foi possivel deletar");
		} else {
			System.out.println("Administrador deletado");
			Dados.coachs.remove(busca);
		}

	}

	@Reminder(value = "Captura uma chave para admin")
	@Override
	public Administrador captureKey() {
		System.out.println("Informe o email");
		Administrador chave = new Administrador();
		chave.setEmail(super.inputEntrada().next());
		return chave;
	}

	@Reminder(value = "Captura um valor para admin")
	@Override
	public Administrador captureValues() {
		Administrador formulario = new Administrador();
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

	@Reminder(value = "Acessa os detalhes do admin")
	@Override
	public void viewDetails(Administrador complete) {
		if (complete == null) {
			System.out.println("Nenhum Admin localizado");
		} else {
			System.out.println("Admin: " + complete.getName());
			System.out.println("Email " + complete.getEmail());
			System.out.println("Data Nascimento " + complete.getBirthDate());
		}
	}

}
