package com.per.swing.gui.components.form;

import lombok.Getter;
import lombok.Setter;

import java.util.EventObject;

@Getter @Setter
public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private String ageCat;
    private String employment;
    private String tax;
    private String gender;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(
            Object source,
            String name,
            String occupation,
            String ageCat,
            String employment,
            String tax,
            String gender
    ) {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCat = ageCat;
        this.employment = employment;
        this.tax = tax;
        this.gender = gender;
    }

}
