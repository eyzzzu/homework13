package com.homework;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthDay; //format "day.month.year", пример "05.04.1990", день и месяц писать с нуля, если меньше 10

    public Person(String lastName, String firstName, String patronymic, String birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
    }

    public Person(String lastName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Person(String fullNameinOneString) {
        String[] tmp = fullNameinOneString.split(" ");
        this.lastName = tmp[0];
        this.firstName = tmp[1];
        this.patronymic = tmp[2];
    }

    public String toStringFullSize() {
        return lastName
                + " " + firstName
                + " " + patronymic;
    }

    public String toStringShortName() {
        return lastName
                + " " + firstName.substring(0, 1)
                + ". " + patronymic.substring(0, 1)
                + ".";
    }

    public String toStringYearsOldAndShortName() {
        if (birthDay != null) {
            return lastName
                    + " " + firstName.substring(0, 1)
                    + ". " + patronymic.substring(0, 1)
                    + ". - дата его рождения "
                    + birthDay + ", и сейчас ему "
                    + YearsOld.yearsOld(birthDay)
                    + " полных лет.";
        } else {
            return lastName
                    + " " + firstName.substring(0, 1)
                    + ". " + patronymic.substring(0, 1)
                    + ". - чтоб узнать сколько полных лет, нужно задать дату рождения!";
        }
    }

    public String toStringYearsOldAndFullName() {
        if (birthDay != null) {
            return lastName
                    + " " + firstName
                    + " " + patronymic
                    + " - дата его рождения "
                    + birthDay + ", и сейчас ему "
                    + YearsOld.yearsOld(birthDay)
                    + " полных лет.";
        } else {
            return lastName
                    + " " + firstName
                    + " " + patronymic
                    + " - чтоб узнать сколько полных лет, нужно задать дату рождения!";
        }
    }

}
