package ru.netology.loopsandburstsTest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class MonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void calculationOfTheNumberOfMonthsPerYear(int expected, int income, int expenses, int threshold) {
        MonthsService service = new MonthsService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }

}
