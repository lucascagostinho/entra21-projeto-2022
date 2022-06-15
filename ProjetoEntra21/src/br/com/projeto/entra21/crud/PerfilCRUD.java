package br.com.projeto.entra21.crud;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.projeto.entra21.Menu;
import br.com.projeto.entra21.interfaces.Dados;
import br.com.projeto.entra21.principal.Perfil;

// classe que precisa ser ajustada

public class PerfilCRUD extends Menu implements ICrud<Perfil> {

	public PerfilCRUD() {
		super("PERFIL", options);
	}

	public byte captureOptions() {

		byte opcao = super.captureOption();
		switch (opcao) {
		case 1:
			list(Dados.perfis);
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
		default:
			System.out.println("Opção inválida para o menu de " + super.getTitle());
			break;
		}
		return opcao;
	}

	@Override
	public void list(ArrayList<Perfil> list) {
		for (Perfil perfil : list) {
			System.out.println(perfil.getName() + "---" + perfil.getEmail());
		}

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public Perfil search(Perfil key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void edit(Perfil key) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Perfil key) {
		// TODO Auto-generated method stub

	}

	@Override
	public Perfil captureKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil captureValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void viewDetails(Perfil complete) {
		// TODO Auto-generated method stub

	}

}
