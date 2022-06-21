package br.com.projeto.entra21.principal;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Super Class with user data.")
public class Perfil { // TODO 02-poo super classe

	private String name;
	private String lastName;
	private String birthDate;
	private String genre;
	private String email;
	private String password;
	private String graduation;

	public Perfil() {
		super();
	}

	// TODO 02-poo metodo construtor
	public Perfil(String name, String lastName, String birthDate, String genre, String email, String password,
			String graduation) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.genre = genre;
		this.email = email;
		this.password = password;
		this.graduation = graduation;
	}

	// TODO 02-poo metodo construtor
	public Perfil(String name, String lastName, String birthDate, String genre) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.genre = genre;
	}

	// TODO 02-poo encapsulamento
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getGraduation(String graduation) {
		this.graduation = graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

}
