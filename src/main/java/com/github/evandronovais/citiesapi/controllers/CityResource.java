package com.github.evandronovais.citiesapi.controllers;

import com.github.evandronovais.citiesapi.models.CityModel;
import com.github.evandronovais.citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public List<CityModel> cities(){
        return cityRepository.findAll();
    }

}
