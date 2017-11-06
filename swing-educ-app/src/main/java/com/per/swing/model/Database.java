package com.per.swing.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Database {

    @Getter
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

}
