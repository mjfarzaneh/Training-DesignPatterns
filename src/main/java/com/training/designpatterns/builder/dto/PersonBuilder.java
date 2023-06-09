package com.training.designpatterns.builder.dto;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private String phoneNumber;
    private String email;

    //firstName and lastName are mandatory.
    public PersonBuilder(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Person createPerson() {
        return new Person(firstName, lastName, age, address, phoneNumber, email);
    }
}