package com.github.evandronovais.citiesapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cityModel {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome")
    private String uf;

    @Column(name = "nome")
    private String ibge;

    @Column(name = "nome")
    private String lat_lon;

    @Column(name = "nome")
    private String latitude;

    @Column(name = "nome")
    private String longitude;

    private Long cod_tom;
}
