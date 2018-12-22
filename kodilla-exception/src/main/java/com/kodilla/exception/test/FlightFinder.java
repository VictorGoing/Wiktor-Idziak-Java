package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> map = new HashMap<String, Boolean>();

        map.put("Warszawa",true);
        map.put("Berlin",true);
        map.put("Tokio",false);
        map.put("Rzym",true);



        Boolean result = map.get(flight.getArrivalAirport());

        if(result == null) {
            throw new RouteNotFoundException();
        }

        System.out.println(result);

    }

    public static void main (String args[]) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Paryż","Nowy York");

        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lotu nie znaleziono");
        }
    }
}
