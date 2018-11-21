package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private List<Country> continent = new ArrayList<Country>();
    public Continent (String name, List<Country> continent){
        this.name = name;
        this.continent = continent;
    }

    public List<Country> getContinent() {
        return continent;
    }
}
