package com.homework;

import java.io.FileNotFoundException;

public class Main {
    /*
Домашнее задание 13

1.1 Написать класс Person, у которого если следующие поля:
    - Фамилия, Имя, Отчество, дата рождения.

Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович", и задает отдельные значения в поля Фамилия, Имя, Отчество.

Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."
- который на основе даты рождения выводит количество полных лет.
     */

    public static void main(String[] args) throws FileNotFoundException {
        PersonList.readFile();

        Person ivanov = new Person("Иванов Иван Иванович");
        System.out.println(ivanov.toStringFullSize());
        System.out.println(ivanov.toStringShortName());
        System.out.println(ivanov.toStringYearsOldAndShortName());

        Person petrov = new Person("Петров", "Петр", "Петрович", "05.05.1985");
        System.out.println(petrov.toStringYearsOldAndShortName() + "\n\r");

        PersonList.createPeopleArray();
        PersonList.printPersonList();

    }
}
