package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.ShapeCollector;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector figures1 = new ShapeCollector();
        //When
        figures1.addFigure(circle);
        //Then
        Assert.assertEquals(1, figures1.figures.size());
    }
    @Test
    public void testRemoveFigure(){
        Shape circle = new Circle();
        ShapeCollector figures1 = new ShapeCollector();
        figures1.addFigure(circle);

        figures1.removeFigure(circle);

        Assert.assertEquals(0, figures1.figures.size());
    }
    @Test
    public void testGetFigure(){
        Shape triangle = new Triangle();
        ShapeCollector figures1 = new ShapeCollector();

        Shape result = figures1.getFigure(0);

        Assert.assertEquals(triangle,result);
    }

    @Test
    public void testShowFigure(){

    }


}
