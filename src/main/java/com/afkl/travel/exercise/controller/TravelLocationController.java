package com.afkl.travel.exercise.controller;

import com.afkl.travel.exercise.dto.TravelLocationDto;
import com.afkl.travel.exercise.entity.TranslationEntity;
import com.afkl.travel.exercise.service.TravelLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class TravelLocationController {

    @Autowired private  TravelLocationService service;

    @GetMapping("/getAirports/{code}")
    public TravelLocationDto getLocation(@PathVariable String code){
        return service.getAirports(code);
    }
}
