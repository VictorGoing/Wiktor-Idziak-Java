package com.kodilla.stream.array;

import java.math.BigDecimal;
import java.util.OptionalDouble;

import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;


public interface ArrayOperations {
   public static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(s -> numbers[s])
                .forEach(System.out::println);
        OptionalDouble result = IntStream.range(0,numbers.length)
                .mapToDouble(s-> numbers[s])
                .average();


        return result.getAsDouble();
    }
}
