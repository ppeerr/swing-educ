package com.per.swing.rest;

import com.per.swing.dao.persons.Person;
import com.per.swing.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/persons")
public class PersonsController {

//    private final PersonRepository personRepository;
    private final PersonService personService;

    @Autowired
    public PersonsController(PersonService personService) {
//        this.personRepository = personRepository;
        this.personService = personService;
    }

//    @RequestMapping(method = POST)
//    public void add(@RequestBody Person person) {
//        personRepository.save(person);
//    }
//
//    //TODO not good
//    @RequestMapping(method = PUT)
//    public void update(@RequestBody Person person) {
//        personRepository.save(person);
//    }

    @RequestMapping(method = GET, path = "/all")
    public Iterable<Person> getAll() {
//        return personRepository.findAll();
        return personService.getAll();
    }

}
