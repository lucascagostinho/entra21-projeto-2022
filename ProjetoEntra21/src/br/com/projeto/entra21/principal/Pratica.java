package br.com.projeto.entra21.principal;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pratica {

	private LocalDateTime data;
	private long duracao;
	private Esportes esporte;
	
	

	@Override
	public String toString() {
		return "Pratica [data=" + data + ", duracao=" + duracao + ", esporte=" + esporte + "]";
	}

	public Pratica(LocalDateTime data, long duracao, Esportes esporte) {
		super();
		this.data = data;
		this.duracao = duracao;
		this.esporte = esporte;
	}

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
