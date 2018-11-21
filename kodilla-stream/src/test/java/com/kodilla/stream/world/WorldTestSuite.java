package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        List<Country> europe = new ArrayList<Country>();
        List<Country> asian = new ArrayList<Country>();
        List<Country> africa = new ArrayList<Country>();
        List<Country> atlantid = new ArrayList<Country>();
        List<Country> america = new ArrayList<Country>();

        europe.add(new Country("Poland",new BigDecimal("100")));
        europe.add(new Country("German",new BigDecimal("100")));
        europe.add(new Country("Spain",new BigDecimal("100")));
        america.add(new Country("USA",new BigDecimal("100")));
        america.add(new Country("Mexico",new BigDecimal("100")));
        asian.add(new Country("Chaina",new BigDecimal("100")));
        asian.add(new Country("Japan",new BigDecimal("100")));
        asian.add(new Country("Korea",new BigDecimal("100")));
        africa.add(new Country("Niggeria",new BigDecimal("100")));
        africa.add(new Country("Egypt",new BigDecimal("100")));
        atlantid.add(new Country("Atlantic City",new BigDecimal("100")));
        atlantid.add(new Country("Fish-Village",new BigDecimal("100")));

        Continent Europa = new Continent("Europa",europe);
        Continent Azja = new Continent("Azja",asian);
        Continent Afryka = new Continent("Afryka",africa);
        Continent Atlantyda = new Continent("Atlantyda",atlantid);
        Continent Ameryka = new Continent("Ameryka",america);

        List<Continent> world = new ArrayList<Continent>();

        world.add(Europa);
        world.add(Azja);
        world.add(Afryka);
        world.add(Atlantyda);
        world.add(Ameryka);

        World earth = new World("Ziemia",world);

        BigDecimal totalPeopleQuantity = earth.getPeopleQuantity();

        Assert.assertEquals(totalPeopleQuantity,new BigDecimal("1200"));


    }
}




























