package com.kodilla.testing.collection;

import java.util.*;

public class OddNumberExterminator {

    List<Integer> exterminator(List<Integer> numbers){
        List<Integer> numbers2 = new ArrayList<Integer>();
        for(int i=0;i<numbers.size();i++)
            if(numbers.get(i)%2==0) numbers2.add(numbers.get(i));
        return numbers2;
    }
}
