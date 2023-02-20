package com.keyin.aircraft;

import java.util.List;
import javax.persistence.*;

@Entity
public class Aircraft {

    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "aircraft_sequence")
    private Long id;

    private String type;
    private String airlineName;
    private int numberOfPassengers;

    @OneToMany(mappedBy = "aircraft")
    private List<Passenger> passengers;

    @ManyToOne
    private Airport airport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
