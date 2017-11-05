package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    @RequestMapping("/")
    @ResponseBody
    public String dateTime() {
        Date date = new Date();

        DateFormat sdf = SimpleDateFormat.getDateInstance();

        return sdf.format(date);
    }

}
