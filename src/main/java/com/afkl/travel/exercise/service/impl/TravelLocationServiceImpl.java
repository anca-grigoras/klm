package com.afkl.travel.exercise.service.impl;

import com.afkl.travel.exercise.dto.TravelLocationDto;
import com.afkl.travel.exercise.entity.LocationEntity;
import com.afkl.travel.exercise.entity.TranslationEntity;
import com.afkl.travel.exercise.repository.TravelLocationRepository;
import com.afkl.travel.exercise.service.TravelLocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelLocationServiceImpl implements TravelLocationService {

    @Autowired private TravelLocationRepository repository;
    @Override
    public List<TranslationEntity> getLocations() {
             List<LocationEntity> translationEntityList=repository.findAll();

        return null;
    }

    @Override
    public TravelLocationDto getAirports(String code) {
      //  repository.getAllAirPorts(code);
        return null;
    }
}
