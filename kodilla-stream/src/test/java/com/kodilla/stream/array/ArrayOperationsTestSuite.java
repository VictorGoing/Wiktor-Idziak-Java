package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
   @Test
    public void testGerAverage(){
        int[] numbers={99,1,50,50,50,50,50};

        double result = ArrayOperations.getAverage(numbers);

        System.out.println(result);
        Assert.assertEquals(50,result,0);
    }
}
