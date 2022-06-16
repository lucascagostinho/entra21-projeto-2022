package br.com.projeto.entra21.cadastro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.projeto.entra21.crud.ICrud;
import br.com.projeto.entra21.crud.PraticanteCRUD;
import br.com.projeto.entra21.menus.Menu;
import br.com.projeto.entra21.menus.MenuCadastro;
import br.com.projeto.entra21.menus.MenuPrincipal;
import br.com.projeto.entra21.principal.Coach;
import br.com.projeto.entra21.principal.Dados;
import br.com.projeto.entra21.principal.Perfil;
import br.com.projeto.entra21.principal.Praticante;

// Precisa ser ajustado

public class Login extends PraticanteCRUD{

	
	public Login(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		// TODO Auto-generated constructor stub
	}

	static Scanner input = new Scanner(System.in);

	public static void login() {
		System.out.println("Informe o email");
		String email = input.next();
		boolean localizado = false;
		for (Coach coach : Dados.coachs) {
			if (coach.getEmail().equals(email)) {
				localizado = true;
				if (verificarSenha(coach.getPassword())) {
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o coach");

				}
				return;
			}
		}
		for (Praticante praticante : Dados.praticantes) {
			if (praticante.getEmail().equals(email)) {
				localizado = true;
				if (verificarSenha(praticante.getPassword())) {
					MenuPrincipal.executar();
				} else {
					System.out.println("Senha incorreta para o praticante");

				}
				return;
			}

		}
		if (!localizado) {
			System.out.println("Não existe ninguém com esse e-mail");
			System.out.println("Faça seu cadastro.");
			
			System.out.println("1 - Cadastrar Praticante");
			System.out.println("2 - Cadastrar Coach");
			
			byte option;
			option= input.nextByte();
			
			switch (option) {
					
			case 1:
				
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
		}
	}

	private static boolean verificarSenha(String password) {
		System.out.println("Informe a senha");

		return password.equals(input.next());
	}

	
}
