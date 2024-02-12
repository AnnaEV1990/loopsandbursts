package ru.netology.loopsandburstsTest.services;

public class MonthsService {
    public int calculate(int income, int expenses, int threshold) {
        int months = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                months++; // увеличиваем счётчик месяцев отдыха

                money = (income - expenses) / 3;

            } else {
                money += income;
                money -= expenses;

            }
        }
        return months;
    }


}
