package com.per.swing.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

    private int id;
    private String name;
    private String occupation;
    private AgeCategory ageCategory;
    private EmploymentCategory employment;
    private String tax;
    private Gender gender;

}
