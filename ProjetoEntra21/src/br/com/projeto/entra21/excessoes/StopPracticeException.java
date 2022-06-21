package br.com.projeto.entra21.excessoes;

public class StopPracticeException extends Exception { // TODO 01-logica avançado exceptions personalizadas

	public StopPracticeException() {

		super("Only option 1 to stop code");
				
	}
	
	public StopPracticeException(String mensage) {
		super(mensage);
	}

}