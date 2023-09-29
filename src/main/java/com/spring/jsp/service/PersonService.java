package com.spring.jsp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jsp.models.Person;
import com.spring.jsp.repositories.PersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class PersonService {
	
	private final Logger logger = LoggerFactory.getLogger(PersonService.class);
	@Autowired
	private PersonRepository personRepository;

	public Person getById(int id) {
	    Optional<Person> optionalPerson = personRepository.findById(id);

	    if (optionalPerson.isPresent()) {
	        Person person = optionalPerson.get();
	        return person;
	    } else {
	        System.out.println("Person not found with id: " + id);
	        return null;
	    }
	}

	public Person create(Person person) {
		return personRepository.save(person);
	}
	
	public List<Person> getAll(){
		logger.info("Fetching all person records from the database...");
        List<Person> persons = personRepository.findAll();
        logger.info("Fetched {} person records.", persons.size());
		return personRepository.findAll();
	}
}
