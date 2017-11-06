package com.per.swing.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private static int count = 0;

    private int id;
    private String name;
    private String occupation;
    private AgeCategory ageCategory;
    private EmploymentCategory employment;
    private String tax;
    private boolean ruCitizen;
    private Gender gender;

    public Person(){

    }

    public Person(
            String name,
            String occupation,
            AgeCategory ageCategory,
            EmploymentCategory empCategory,
            String tax,
            boolean ruCitizen,
            Gender gender
    ) {
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.employment = empCategory;
        this.tax = tax;
        this.ruCitizen = ruCitizen;
        this.gender = gender;

        this.id = count++;
    }

    public static void checkPersons(Person... ps) {
        for (Person person : ps) {
            System.out.print(person.getId() + ",");
        }
    }

}
