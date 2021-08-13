package com.github.evandronovais.citiesapi.repositories;

import com.github.evandronovais.citiesapi.models.cityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cityRepository extends JpaRepository<cityModel, Long> {
}
