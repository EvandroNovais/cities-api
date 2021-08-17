package com.github.evandronovais.citiesapi.repositories;

import com.github.evandronovais.citiesapi.models.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityModel, Long> {
}
