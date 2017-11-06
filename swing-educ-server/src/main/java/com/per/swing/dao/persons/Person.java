package com.per.swing.dao.persons;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name = "persons")
public class Person {

    @SequenceGenerator(name="person_seq", sequenceName="persons_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="person_seq")
    @Id
    Integer id;

    String name;

    String surname;

    String patronymicName;

    short timeZoneOffset;

    Date createDate;

    Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public short getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(short timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
