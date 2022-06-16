package br.com.projeto.entra21.crud;

import java.util.ArrayList;

import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;
import br.com.projeto.entra21.principal.Perfil;
import br.com.projeto.entra21.principal.Praticante;

public class PraticanteCRUD extends Menu implements ICrud<Praticante> {

	
	
	public PraticanteCRUD(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte captureOption() {
		byte option = super.captureOption();

		switch (option) {
		case 1:
			list(Dados.praticantes);
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

	@Override
	public void list(ArrayList<Praticante> list) {
		list.forEach(praticante -> {
			System.out.println(praticante.getEmail() + "---" + praticante.getName());
		});

	}

	@Override
	public void add() {
		Praticante novo = captureValues();
		if (search(novo) != null) {
			System.out.println("Não foi possível adicionar");
		} else {
			Dados.praticantes.add(novo);
			System.out.println("Praticante adicionado");
		}
	}

	@Override
	public Praticante search(Praticante key) {
		Praticante encontrado = null;
		for (Praticante praticante : Dados.praticantes) {
			if (praticante.getEmail().equals(key.getEmail())) {
				return praticante;
			}
		}
		return null;
	}

	@Override
	public void edit(Praticante key) {
		Praticante atual = search(key);
		if (atual != null) {
			System.out.println("Alterando o Praticante");
			Praticante editado = captureValues();
			Dados.praticantes.set(Dados.praticantes.indexOf(atual), editado);
			System.out.println("Praticante editado");
		} else {
			System.out.println("Não foi possivel editar");
		}

	}

	@Override
	public void delete(Praticante key) {
		Praticante busca = search(key);
		if (busca == null) {
			System.out.println("Não foi possivel deletar");
		} else {
			System.out.println("Praticante deletado");
			Dados.praticantes.remove(busca);
		}

	}

	@Override
	public Praticante captureKey() {
		System.out.println("Informe o email");
		Praticante chave = new Praticante();
		chave.setEmail(super.inputEntrada().next());
		return chave;
	}

	@Override
	public Praticante captureValues() {
		Praticante formulario = new Praticante();
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

	@Override
	public void viewDetails(Praticante complete) {
		if (complete == null) {
			System.out.println("Nenhum Praticante localizado");
		} else {
			System.out.println("Praticante: " + complete.getName());
			System.out.println("Email " + complete.getEmail());
			System.out.println("Data Nascimento " + complete.getBirthDate());
		}
	}

}
