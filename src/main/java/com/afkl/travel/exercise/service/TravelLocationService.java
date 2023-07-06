package com.afkl.travel.exercise.service;

import com.afkl.travel.exercise.dto.TravelLocationDto;
import com.afkl.travel.exercise.entity.TranslationEntity;

import java.util.List;

public interface TravelLocationService {

    List<TranslationEntity> getLocations();

    TravelLocationDto getAirports(String code);
}
