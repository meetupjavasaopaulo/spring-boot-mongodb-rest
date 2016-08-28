package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeetupRepository  extends MongoRepository<Meetup, String> {

	public Meetup findByTitulo(String titulo);
	
}
