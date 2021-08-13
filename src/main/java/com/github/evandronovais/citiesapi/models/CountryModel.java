package com.github.evandronovais.citiesapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class CountryModel {

    @Id
    private Long id;

    @Column(name="nome")
    private String name;

    @Column(name="nome_pt")
    private String name_pt;

    @Column(name="sigla")
    private String code;

    private Integer bacen;

    public CountryModel() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getName_pt() {
        return name_pt;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
