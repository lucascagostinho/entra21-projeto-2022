package br.com.projeto.entra21.principal;

public class Cadastro extends  Pessoa{

	public String email;
	public String password;
	public String numberPhone;
	
	public Cadastro() {
		super();
	}

	public Cadastro(String email, String password, String numberPhone) {
		super();
		this.email = email;
		this.password = password;
		this.numberPhone = numberPhone;
	}
	
	

	public Cadastro(String name, String lastName, String birthDate, String genre) {
		super(name, lastName, birthDate, genre);
		
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

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	
	
	
	
}
