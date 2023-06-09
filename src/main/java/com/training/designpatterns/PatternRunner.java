package com.training.designpatterns;

import com.training.designpatterns.builder.dto.Person;
import com.training.designpatterns.builder.dto.PersonBuilder;

public class PatternRunner {

    public static void main(String[] args) {
        Person person = new PersonBuilder("Mj","Farzaneh")
                .setEmail("mjfarzaneh7@gmail.com")
                .createPerson();
        System.out.println(person);

    }
}
