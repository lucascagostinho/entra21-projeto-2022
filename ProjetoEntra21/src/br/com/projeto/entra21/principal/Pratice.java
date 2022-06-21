package br.com.projeto.entra21.principal;

import java.time.LocalDateTime;

import br.com.projeto.entra21.annotations.Reminder;

@Reminder(value = "Super Class with the data obtained during practice.")
public class Pratice { // TODO 02-logica super classe

	private LocalDateTime date;
	private long duration;
	private Sports sport;

	@Override
	public String toString() { // TODO 03-metodo wrapper
		return "Pratice [date=" + date + ", duration=" + duration + ", sport=" + sport + "]";
	}

	public Pratice(LocalDateTime date, long duration, Sports sport) { // TODO 02-metodo construtor
		super();
		this.date = date;
		this.duration = duration;
		this.sport = sport;
	}

	// TODO 02-logica encapsulamento
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Sports getSport() {
		return sport;
	}

	public void setSport(Sports sport) {
		this.sport = sport;
	}

}
