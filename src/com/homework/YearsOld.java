package com.homework;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class YearsOld {

    public static String yearsOld(String birthDayInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(birthDayInput, formatter);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        return "" + period.getYears();
    }
}
