package com.dev.race;

import com.dev.tire.Tire;
import com.dev.weather.Weather;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "races")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long raceID;
    @Column(nullable = false)
    LocalDate date;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String location;
    @OneToMany(mappedBy = "race")
    @JsonIgnoreProperties("race")
    @JsonIgnore
    List<Tire> tireProRace;
    @OneToMany(mappedBy = "race")
    @JsonIgnoreProperties("race")
    @JsonIgnore
    List<Weather> weather;

    public Race(Long raceID, LocalDate date,String name, String location) {
        this.raceID = raceID;
        this.date = date;
        this.location = location;
        this.name = name;
    }

    public Race(LocalDate date, String name, String location) {
        this.date = date;
        this.name = name;
        this.location = location;
    }

    public Race() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRaceID() {
        return raceID;
    }

    public void setRaceID(Long raceID) {
        this.raceID = raceID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Tire> getTireProRace() {
        return tireProRace;
    }

    public void setTireProRace(List<Tire> tireProRace) {
        this.tireProRace = tireProRace;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
