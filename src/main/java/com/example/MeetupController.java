package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/meetup")
public class MeetupController {

	@Autowired
	private MeetupRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public	List<Meetup> findAll() {
		return repository.findAll();
	}

	@RequestMapping(value = "{titulo}", method = RequestMethod.GET)
	Meetup findById(@PathVariable("titulo") String titulo) {
		return repository.findByTitulo(titulo);
	}
}
