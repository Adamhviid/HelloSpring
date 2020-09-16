package com.example.demo.controllers;

import com.example.demo.services.DayCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class Controllers {

    @GetMapping("/")
    @ResponseBody
    public String IsItFriday() {
        DayCalculator test = new DayCalculator();

        LocalDateTime currentDate = LocalDateTime.now();

        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        int century = currentDate.getYear()%100;

        String result = test.formula(day,month,century,year);

        return result;
    }
}
