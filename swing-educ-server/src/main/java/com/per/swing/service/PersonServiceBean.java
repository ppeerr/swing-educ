package com.per.swing.service;

import com.per.swing.dao.persons.Person;
import com.per.swing.dto.PersonDto;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Component
public class PersonServiceBean implements PersonService{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Person> getAll() {
        Person person = entityManager.find(Person.class, 1);

        PersonDto personDto = new PersonDto(
                person.getId(),
                person.getName(),
                person.getSurname(),
                person.getPatronymicName(),
                person.getTimeZoneOffset()
        );

        return Collections.singletonList(person);
    }
}
