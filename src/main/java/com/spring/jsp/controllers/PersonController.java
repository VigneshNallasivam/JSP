package com.spring.jsp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jsp.models.Person;
import com.spring.jsp.service.PersonService;


@Controller
@RequestMapping("/home")
public class PersonController { 

	@Autowired
	private PersonService personService;

	public int id = 1;

	@GetMapping("/general")
	public String display(Model model) {
		String firstName = "Vignesh";
		model.addAttribute("first_name", firstName);
		return "login";
	}
	
	@PostMapping("/post")
    public String create(@RequestBody Person person)
    {
        Person person1 = personService.create(person);
        return "Posted..!!";
    }

	@GetMapping("/entity")
	public String show(Model model) {
	    Person person = personService.getById(id);
	    if (person != null) {
	    	String name = person.getFirst_name();
	    	//int idValue = person.getId();
	        model.addAttribute("personId", name);
	    } else {
	        model.addAttribute("personId", "Person not found");
	    }
	    return "model";
	}
	
	@GetMapping("/getAll")
	public String findAll(Model model) {
	    List<Person> person = personService.getAll();
	    if (person != null) {
	        model.addAttribute("details",person);
	    } else {
	        model.addAttribute("AllDetails", "Details not found");
	    }
	    return "Details";
	}
}
