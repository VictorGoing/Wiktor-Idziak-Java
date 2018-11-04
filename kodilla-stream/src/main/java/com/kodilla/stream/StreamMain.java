package com.kodilla.stream;

import com.kodilla.stream.beautifler.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

       Processor processor = new Processor();
        Executor codeToExecute =() -> System.out.println("This is example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        String poem = "lalalalalalalalalalalalalalalalalalalalalalalalalalalalalala";

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(poem,(text) -> poem.toUpperCase());
        poemBeautifier.beautify(poem,(text) -> "ABC" + poem + "ABC");
        poemBeautifier.beautify(poem,(text) -> poem + poem.length());
        poemBeautifier.beautify(poem,(text)-> "ABC" + poem.toUpperCase() + poem.length() + "ABC");
    }
}

