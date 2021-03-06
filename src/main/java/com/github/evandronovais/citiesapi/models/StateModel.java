package com.github.evandronovais.citiesapi.models;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
@TypeDefs(@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class))
public class StateModel {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;


    /*@Column(name = "pais")
    private Integer country;*/

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private CountryModel country;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

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
    /*public Integer getCountry() {return country;}*/

    public CountryModel getCountry() {
        return country;
    }

    public List<Integer> getDdd() {
        return ddd;
    }
}
