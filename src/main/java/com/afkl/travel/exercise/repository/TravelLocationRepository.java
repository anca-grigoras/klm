package com.afkl.travel.exercise.repository;

import com.afkl.travel.exercise.entity.LocationEntity;
import com.afkl.travel.exercise.entity.TranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelLocationRepository extends JpaRepository<LocationEntity,Long> {

}
