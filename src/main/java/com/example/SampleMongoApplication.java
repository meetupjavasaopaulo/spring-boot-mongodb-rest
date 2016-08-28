package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class SampleMongoApplication implements CommandLineRunner {

	@Autowired
	private MeetupRepository repository;

	@Override
	public void run(String... args) throws Exception {
		this.repository.deleteAll();

		List<String> participantes = new ArrayList<String>();
		participantes.add("Bruno");
		participantes.add("Felipe");
		participantes.add("Fernando");
		
		LocalDate diaDoMeetup = LocalDate.of(2016, Month.SEPTEMBER, 1);
		
		String titulo ="12o Meetup";
		
		// gravando
		System.out.println("Gravando:");
		System.out.println("-------------------------------");
		this.repository.save(new Meetup(titulo, diaDoMeetup, participantes ));

		// buscando
		System.out.println("Busca todos:");
		System.out.println("-------------------------------");
		for (Meetup meetup : this.repository.findAll()) {
			System.out.println(meetup);
		}
		System.out.println();

		// buscando por titulo
		System.out.println("Busca por titulo:");
		System.out.println("--------------------------------");
		System.out.println(this.repository.findByTitulo(titulo));

	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleMongoApplication.class, args);
	}

}