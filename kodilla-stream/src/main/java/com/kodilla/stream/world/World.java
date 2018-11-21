package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private String name;
   private List<Continent> world = new ArrayList<Continent>();
   public World(String name, List<Continent> world){
       this.name = name;
       this.world = world;
   }

    public List<Continent> getWorld() {
        return world;
    }
    public BigDecimal getPeopleQuantity(){
       BigDecimal quantity = world.stream()
               .flatMap(continent -> continent.getContinent().stream())
               .map(Country:: getPeopleQuantity)
               .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
       return quantity;
    }
}
