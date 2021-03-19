package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @DisplayName("Tests for adding figure")
    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(5.0);
        shapeCollector.addFigure(shape1);
        Assertions.assertSame(shapeCollector.getFigure(0), shape1);
    }
    @DisplayName("Tests for removing figure")
    @Test
    public void testRemoveFigure(){
        boolean testOk;
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(5.0);
        shapeCollector.addFigure(shape1);
        testOk = shapeCollector.removeFigure(shape1);
        Assertions.assertTrue(testOk);
    }
    @DisplayName("Tests getting figure")
    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(5.0);
        Shape shape2;
        shapeCollector.addFigure(shape1);
        shape2 = shapeCollector.getFigure(0);
        Assertions.assertSame(shape1,shape2);
    }
    @DisplayName("Tests showing figure")
    @Test
    public void testShowFigures(){
        boolean testOk;
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Triangle(5.0,5.0);
        Shape shape3 = new Square(5.0);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        testOk = shapeCollector.showFigures();
        Assertions.assertEquals(new Circle(5.0).getField(),shapeCollector.getFigure(0).getField());
        Assertions.assertEquals(new Triangle(5.0,5.0).getField(),shapeCollector.getFigure(1).getField());
        Assertions.assertEquals(new Square(5.0).getField(),shapeCollector.getFigure(2).getField());
        Assertions.assertTrue(testOk);
    }
}
