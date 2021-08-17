package com.github.evandronovais.citiesapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class CityModel {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private String ibge;

    private String lat_lon;


    private String latitude;

    private String longitude;

    private Integer cod_tom;

    public CityModel() {
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

    public String getIbge() {
        return ibge;
    }

    public String getLat_lon() {
        return lat_lon;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public Integer getCod_tom() {
        return cod_tom;
    }
}
