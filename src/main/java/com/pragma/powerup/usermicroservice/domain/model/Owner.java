package com.pragma.powerup.usermicroservice.domain.model;

import java.time.LocalDate;

public class Owner {

    private String name;
    private String lastName;
    private String documentId;
    private String phone;
    private LocalDate BirthDay;
    private String email;
    private String password;

    public Owner(String name, String lastName, String documentId, String phone, LocalDate birthDay, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.documentId = documentId;
        this.phone = phone;
        BirthDay = birthDay;
        this.email = email;
        this.password = password;
    }

    public Owner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        BirthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
