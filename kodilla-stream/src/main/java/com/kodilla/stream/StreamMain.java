package com.kodilla.stream;

import com.kodilla.stream.person.People;

import java.util.ArrayList;

public class StreamMain {
 public static void main(String[] args) {
  System.out.println("Welcome to module 7 - Stream");
  People.getList().stream()
          .map(s -> s.toUpperCase())
          .filter(s -> s.length() > 11)
          .filter(s-> s.charAt(0)=='M')
          .map(s -> s.substring(0,s.indexOf(" ")+2) + ".")
          .forEach(System.out::println);

 }

}

