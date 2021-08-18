package com.github.evandronovais.citiesapi.controllers;

import com.github.evandronovais.citiesapi.models.StateModel;
import com.github.evandronovais.citiesapi.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<StateModel> states(){
        return stateRepository.findAll();
    }
}
