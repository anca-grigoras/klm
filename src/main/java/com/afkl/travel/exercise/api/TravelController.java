package com.afkl.travel.exercise.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/airports/")
public class TravelController {

    @GetMapping
    public String getAllAirports() {
         return "all airports";
    }
    
}
