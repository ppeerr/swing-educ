package com.per.swing.controller;

import com.per.swing.gui.components.form.FormEvent;
import com.per.swing.model.*;

public class Controller {

    private Database db = new Database();

    public void addPerson(FormEvent event) {
        db.addPerson(new Person(
                event.getName(),
                event.getOccupation(),
                AgeCategory.valueOf(event.getAgeCat()),
                EmploymentCategory.valueOf(event.getEmployment()),
                event.getTax(),
                true,
                Gender.valueOf(event.getGender())
        ));
    }

}
