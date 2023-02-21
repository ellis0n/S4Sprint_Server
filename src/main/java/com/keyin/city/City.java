package com.keyin.city;

import com.keyin.airport.Airport;

import javax.persistence.*;
import java.util.*;

@Entity
public class City {
    @Id
    @GeneratedValue(generator = "city_sequence")
    @SequenceGenerator(name = "city_sequence", sequenceName = "city_sequence", allocationSize = 1, initialValue = 1)
    private Long id;

    private String name;
    private String state;
    private int population;

    @OneToMany(mappedBy = "city")
    private List<Airport> airports;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airport> getAirports() {
        return (List<Airport>) airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
