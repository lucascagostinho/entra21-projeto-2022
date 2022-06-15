package br.com.projeto.entra21.interfaces;

import java.util.ArrayList;

import br.com.projeto.entra21.principal.Perfil;

public interface Dados {

	public ArrayList<Perfil> perfis = new ArrayList<>();

	public static void inicializarListas() {

		perfis.add(new Perfil("Alex", "Matos", "1997-10-29", "masc"));

	}

}