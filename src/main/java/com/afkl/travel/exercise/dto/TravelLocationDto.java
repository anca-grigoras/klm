package com.afkl.travel.exercise.dto;

import lombok.Data;

@Data
public class TravelLocationDto {

    private String code;

    private String name;

    private String type;

    private Integer latitude;

    private Integer longitude;

    private String description;

    private String parentCode;

    private String parentType;

}