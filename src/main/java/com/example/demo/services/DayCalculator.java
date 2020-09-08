package com.example.demo.services;

public class DayCalculator {

    public int formula(int dayOfMonth, int month, int century, int year) {

        int j = year / 100; //century
        int k = year % 100; //year

        double h = (dayOfMonth + Math.floor(13* (month +1) /5) + k + Math.floor(k/4) + Math.floor(j/4) -2*j) %7;
        //double h = (dayOfMonth + ((26* (month +1)) / 10 ) + year + (k /4) + (j /4) + (5*j)) %7;

        double d = ((h +5) %7) +1;

        int result = (int)d;

        return result;
    }
}
