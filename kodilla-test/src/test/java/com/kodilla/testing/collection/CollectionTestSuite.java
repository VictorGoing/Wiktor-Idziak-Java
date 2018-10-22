package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void cokolwiek(){
        System.out.println("Test!");
    }
    @After
    public void gdziekolwiek(){
        System.out.println("Test Zakończono!");
    }
    @Test
    public void testOddNumberExterminatorEmptyList(){
        List<Integer> numbers = new ArrayList<Integer>();
        OddNumberExterminator obiekt = new OddNumberExterminator();
        List<Integer> numbers2 =obiekt.exterminator(numbers);
        Assert.assertEquals(0,numbers2.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> numbers = Arrays.asList(0,2,4,56,68,54,34,9,7);
        List<Integer> numbers3 = Arrays.asList(0,2,4,56,68,54,34);
        OddNumberExterminator obiekt = new OddNumberExterminator();
        List<Integer> numbers2 =obiekt.exterminator(numbers);
        Assert.assertEquals(7,numbers2.size());
        Assert.assertEquals(numbers3,numbers2);
    }
}
