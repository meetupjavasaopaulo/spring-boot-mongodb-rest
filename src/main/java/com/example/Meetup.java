package com.example;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Meetup implements Serializable {
   
	private static final long serialVersionUID = 4381615290131149203L;

	@Id
	private String titulo;

	private LocalDate data;

	private List<String> participantes;

	public Meetup() {
		participantes = new ArrayList<String>();
	}

	public Meetup(String titulo, LocalDate data, List<String> participantes) {
		this.titulo = titulo;
		this.data = data;
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Meetup [titulo=" + titulo + ", data=" + data + ", participantes=" + participantes + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<String> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<String> participantes) {
		this.participantes = participantes;
	}

 
}
