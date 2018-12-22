package com.kodilla.exception;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge obcject = new SecondChallenge();

        try {
            obcject.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("koniec metody");
        }
    }
}
