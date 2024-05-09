package com.example.labtest2;

import junit.framework.TestCase;

import org.junit.Test;

public class colorTest extends TestCase {

    @Test
    public void testRed() {
        Red r = new Red("Red");
        assertEquals("The color is Red\n", r.showColor());
    }

    @Test
    public void testGreen() {
        Green g = new Green("Green");
        assertEquals("The color is Green\n", g.showColor());
    }

    @Test
    public void testBlue() {
        blue b = new blue("Blue");
        assertEquals("The color is Blue\n", b.showColor());
    }
}