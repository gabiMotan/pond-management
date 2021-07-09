package com.motanis.pondmanagement.model;

import javax.persistence.Entity;

@Entity
public class Pond {
    private int id;
    private String name;
    private String judet;
    private String location;
    private Integer phone_number;
    private Integer price;
    private String type;
    private Float rating_pond;
    private Float rating_road;
    private Boolean night_camp;
    private Boolean crap;
    private Boolean caras;
    private Boolean rapitor;
    private Boolean fitofag;

    public Pond(int id, String name, String judet, String location, Integer phone_number,
                Integer price, String type, Float rating_pond, Float rating_road, Boolean night_camp, Boolean crap,
                Boolean caras, Boolean rapitor, Boolean fitofag) {
        this.id = id;
        this.name = name;
        this.judet = judet;
        this.location = location;
        this.phone_number = phone_number;
        this.price = price;
        this.type = type;
        this.rating_pond = rating_pond;
        this.rating_road = rating_road;
        this.night_camp = night_camp;
        this.crap = crap;
        this.caras = caras;
        this.rapitor = rapitor;
        this.fitofag = fitofag;
    }



    public String getName() {
        return name;
    }

    public String getJudet() {
        return judet;
    }

    public String getLocation() {
        return location;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public Integer getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Float getRating_pond() {
        return rating_pond;
    }

    public Float getRating_road() {
        return rating_road;
    }

    public Boolean getNight_camp() {
        return night_camp;
    }

    public Boolean getCrap() {
        return crap;
    }

    public Boolean getCaras() {
        return caras;
    }

    public Boolean getRapitor() {
        return rapitor;
    }

    public Boolean getFitofag() {
        return fitofag;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/*
    CREATE TABLE `ponds_managing` (
        `id` int NOT NULL,
        `name` varchar(45) NOT NULL,
        `judet` varchar(45) NOT NULL DEFAULT 'Iasi',
        `location` varchar(45) NOT NULL,
        `phone_number` int NOT NULL,
        `price` varchar(45) NOT NULL,
        `type` varchar(45) NOT NULL,
        `rating_pond` varchar(45) NOT NULL,
        `rating_road` varchar(45) NOT NULL,
        `night_camp` varchar(45) NOT NULL,
        `crap` tinyint(3) unsigned zerofill NOT NULL,
        `caras` tinyint NOT NULL,
        `rapitor` tinyint NOT NULL,
        `fitofag` tinyint NOT NULL,
        PRIMARY KEY (`id`),
        UNIQUE KEY `location_UNIQUE` (`location`)
        )
*/
