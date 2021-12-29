package com.techprimers.multistageexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/api/foos")
    @ResponseBody
    public String getFoos(@RequestParam String val) {
        String result = "QueryStringValue: " + val;
        System.out.println(result);
        return result;
    }
}
