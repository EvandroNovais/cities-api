package com.github.evandronovais.citiesapi.repositories;

import com.github.evandronovais.citiesapi.models.StateModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<StateModel, Long> {
}
