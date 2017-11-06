package com.per.swing.dto;

public class PersonDto {

    int id;
    String name;
    String surname;
    String patronymicName;
    short timezoneOffset;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public short getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(short timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }
}
