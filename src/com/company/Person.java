package com.company;

public class Person {
    public  String firstName;
    public String lastName;
    public String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person: " + firstName  + " " +
                (lastName != null && !lastName.trim().isEmpty()?lastName:"")  + " " +
                (patronymic != null && !patronymic.trim().isEmpty()?patronymic:"");
    }
}
