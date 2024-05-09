package com.example.labtest2;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;


public  class ShapeTest {
    @Test
    public void testCircleArea() {
        Circle circle = new Circle("circle", 5);
        assertEquals(78.53981633974483, circle.area(), 0.0001);
    }

    @Test
    public void testSquareArea() {
        Square square = new Square("Square", 4);
        assertEquals(16.0, square.area(), 0.0001);
    }

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        assertEquals(6.0, triangle.area(), 0.0001);
    }
}

class ColorTest {
    @Test
    public void testRedColor() {
        Red red = new Red("Red");
        assertEquals("Red", red.getName());
    }

    @Test
    public void testBlueColor() {
        blue blue = new blue("Blue");
        assertEquals("Blue", blue.getName());
    }

    @Test
    public void testGreenColor() {
        Green green = new Green("Green");
        assertEquals("Green", green.getName());
    }
}
