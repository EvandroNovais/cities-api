package com.github.evandronovais.citiesapi.repositories;

import com.github.evandronovais.citiesapi.models.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryModel, Long> {
}
