package com.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PersonList {
    private static List<String> firstNameList = new ArrayList<>();
    private static List<String> lastNameList = new ArrayList<>();
    private static List<String> patronymicList = new ArrayList<>();
    private static List<Person> personList = new ArrayList<>();

    public static void readFile() throws FileNotFoundException {
        FileInputStream fileIn = new FileInputStream("peopleList.txt");
        Scanner scan = new Scanner(fileIn);
        String line = null;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            if (line.contains(" ")) {
                lastNameList.add(line.substring(0, line.indexOf(" ")));
                firstNameList.add(line.substring(line.indexOf(" ") + 1, line.lastIndexOf(" ")));
                patronymicList.add(line.substring(line.lastIndexOf(" ") + 1));
            }
        }
    }

    public static void printFirstNameList() {
        for (int i = 0; i < firstNameList.size(); i++) {
            if ((firstNameList.size() - 1) == i) {
                System.out.print(firstNameList.get(i) + "\n\r");
            } else {
                System.out.print(firstNameList.get(i) + ", ");
            }
        }
    }

    public static void printLastNameList() {
        for (int i = 0; i < lastNameList.size(); i++) {
            if ((lastNameList.size() - 1) == i) {
                System.out.print(lastNameList.get(i) + "\n\r");
            } else {
                System.out.print(lastNameList.get(i) + ", ");
            }
        }
    }

    public static void printPatronymicList() {
        for (int i = 0; i < patronymicList.size(); i++) {
            if ((patronymicList.size() - 1) == i) {
                System.out.print(patronymicList.get(i) + "\n\r");
            } else {
                System.out.print(patronymicList.get(i) + ", ");
            }
        }
    }

    public static void printPersonList() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).toStringYearsOldAndFullName());
        }
    }

    public static void createPeopleArray() {
        int count = 0;
        while (true) {
            if (count == firstNameList.size()) {
                break;
            }
            personList.add(new Person(lastNameList.get(count),
                    firstNameList.get(count),
                    patronymicList.get(count),
                    randomBirthDay()));
            count++;
        }
    }

    private static String randomBirthDay() {
        Random rnd = new Random();
        String birthDay = null;
        String day = null;
        String month = null;
        String year = null;
        String format = "%02d";

        day = String.format(format, rnd.nextInt(31) + 1);
        month = String.format(format, rnd.nextInt(12) + 1);
        year = String.format(format, rnd.nextInt(60) + 1950);
        birthDay = day + "." + month + "." + year;
        return birthDay;
    }
}