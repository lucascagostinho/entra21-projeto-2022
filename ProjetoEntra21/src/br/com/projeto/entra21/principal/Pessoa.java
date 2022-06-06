package br.com.projeto.entra21.principal;

public class Pessoa {

	public String name;
	public String lastName;
	public String birthDate;
	public String genre;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String name, String lastName, String birthDate, String genre) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.genre = genre;
	}

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
	
	
	
	
}
