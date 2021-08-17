package com.github.evandronovais.citiesapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StateModel {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

    @Column(name = "pais")
    private Integer country;

    private String ddd;

    public StateModel() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public Integer getCountry() {
        return country;
    }

    public String getDdd() {
        return ddd;
    }
}
