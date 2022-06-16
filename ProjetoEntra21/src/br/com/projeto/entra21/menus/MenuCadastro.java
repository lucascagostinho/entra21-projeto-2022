package br.com.projeto.entra21.menus;

import java.util.ArrayList;

import br.com.projeto.entra21.crud.CoachCRUD;
import br.com.projeto.entra21.crud.ICrud;

public class MenuCadastro extends Menu{

	public MenuCadastro(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	}

	@Override
	public byte captureOption() {
		byte option = super.captureOption(); 
		
		switch (option) {
		case 1:
			new CoachCRUD("Cadastro de Coachs",ICrud.options).optionsMenu();;
			break;

		case 2:
			break;
		}
		return option;
		
		
	}
	
	
}
