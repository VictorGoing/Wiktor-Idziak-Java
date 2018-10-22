package com.kodilla.testing;

import com.kodilla.testing.User.SImpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        SImpleUser simpleUser = new SImpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error");
        }

        //Test jednostkowy------------------------------------------------------------------------
        Calculator calculator = new Calculator();

        int resultadd = calculator.add(5,4);

        if(resultadd==5+4){
            System.out.println("add is OK");
        }else{
            System.out.println("add Error");
        }


        int resultsub=calculator.subtract(5,4);

        if(resultsub==5-4){
            System.out.println("subtract is OK");
        }else{
            System.out.println("subtract Error");
        }

    }
}

