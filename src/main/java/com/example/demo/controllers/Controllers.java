package com.example.demo.controllers;

import com.example.demo.services.DayCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {

    @GetMapping("/friday")
    @ResponseBody
    public String IsItFriday() {
        DayCalculator test = new DayCalculator();
        String result = test.formula(11,9,21,20);
        
        return result;
    }
}
