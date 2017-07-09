package com.sarp.elk.domain;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

    private final Long id;
    private final String firstname;
    private final String surname;
    private final Calendar dateOfBirth;

    public User(final Long id, final String firstname, final String surname, final Calendar dateOfBirth) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }
}
