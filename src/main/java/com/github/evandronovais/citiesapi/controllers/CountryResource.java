package com.github.evandronovais.citiesapi.controllers;

import com.github.evandronovais.citiesapi.models.CountryModel;
import com.github.evandronovais.citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public List<CountryModel> countries(){
        return countryRepository.findAll();

    }

}
