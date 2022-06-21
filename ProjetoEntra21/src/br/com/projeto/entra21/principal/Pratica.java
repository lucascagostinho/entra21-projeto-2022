package br.com.projeto.entra21.principal;

import java.time.LocalDateTime;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Super Classe com os dados obtidos durante a prática.")
public class Pratica { //TODO 02-logica super classe

	private LocalDateTime data;
	private long duracao;
	private Esportes esporte;

	@Override
	public String toString() { //TODO 03-metodo wrapper
		return "Pratica [data=" + data + ", duracao=" + duracao + ", esporte=" + esporte + "]";
	}
 
	public Pratica(LocalDateTime data, long duracao, Esportes esporte) { //TODO 02-metodo construtor
		super();
		this.data = data;
		this.duracao = duracao;
		this.esporte = esporte;
	}

	// TODO 02-logica encapsulamento
	public LocalDateTime getData() { 
		return data;
	}

	public void setData(LocalDateTime data) { 
		this.data = data; 
	}

	public Long getDuracao() { 
		return duracao;
	}

	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}

	public Esportes getEsporte() { 
		return esporte;
	}

	public void setEsporte(Esportes esporte) { 
		this.esporte = esporte;
	}

}
