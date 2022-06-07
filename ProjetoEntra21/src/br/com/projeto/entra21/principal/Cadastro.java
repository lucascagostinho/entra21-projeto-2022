package br.com.projeto.entra21.principal;

import java.util.Scanner;

import br.com.projeto.entra21.interfaces.Dados;

public class Cadastro implements Dados {

	static Scanner input = new Scanner(System.in);

	static byte continuar;

	public static void cadastro() {

		System.out.println("Criar um cadastro? 1 - sim, 2 - não ");
		continuar = input.nextByte();

		switch (continuar) {

		case 1:
			continuar = 1;
			break;

		case 2:
			continuar = 2;
			break;

		default:
			System.out.println("Digite uma opção válida...");
			break;

		}

		while (continuar == 1) {

			System.out.println("Digite o seu nome: ");
			nome.add(input.next());

			System.out.println("Digite o seu email:");
			email.add(input.next());

			System.out.println("Digite seu telefone: (opcional)");
			telefone.add(input.next());

			System.out.println("Digite a sua idade:");
			idade.add(input.next());

			System.out.println("Crie uma senha:");
			senha.add(input.next());

			System.out.println("Deseja cria outro cadastro? 1 - sim  /  2 - não");
			continuar = input.nextByte();
		}

	}

}
