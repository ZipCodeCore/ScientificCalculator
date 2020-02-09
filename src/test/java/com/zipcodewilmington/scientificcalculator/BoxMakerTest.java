package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxMakerTest {

    @Test
    public void TestGetWidthGeneric()
    {
        int expected = 30;
        BoxMaker TestBoxMaker = new BoxMaker();
        int actual = TestBoxMaker.getWidth();

        assertEquals(expected, actual);
    }

    @Test
    public void TestGetWidthSizeTwelve()
    {
        int expected = 12;
        BoxMaker TestBoxMaker = new BoxMaker(12);
        int actual = TestBoxMaker.getWidth();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetWidth()
    {
        int expected = 55;
        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(55);
        int actual = TestBoxMaker.getWidth();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetWidthTooSmall()
    {
        int expected = 30;
        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(-9);
        int actual = TestBoxMaker.getWidth();

        assertEquals(expected, actual);
    }

    @Test
    public void TestSetWidthTooBig()
    {
        int expected = 30;
        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(4000);
        int actual = TestBoxMaker.getWidth();

        assertEquals(expected, actual);
    }

    @Test
    public void TestDraw()
    {
        String expected =
                                "╔════════╗\n" +
                                "║   hello║\n" +
                                "╚════════╝\n";

        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(10);
        String actual = TestBoxMaker.draw("Hello");
    }

    @Test
    public void TestDrawTwoLines()
    {
        String expected =
                                 "╔═════╗\n" +
                                 "║hello║\n" +
                                 "║James║\n" +
                                 "╚═════╝\n";


        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(7);
        String actual = TestBoxMaker.draw("Hello", "James");
    }

    @Test
    public void TestDrawTooLong()
    {
        String expected =
                        "╔═════╗\n" +
                        "║hello║\n" +
                        "║     ║\n" +
                        "╚═════╝\n";


        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(7);
        String actual = TestBoxMaker.draw("Hello James");
    }

    @Test
    public void TestDrawNothing()
    {
        String expected =
                        "╔═════╗\n" +
                        "║     ║\n" +
                        "║     ║\n" +
                        "╚═════╝\n";


        BoxMaker TestBoxMaker = new BoxMaker();
        TestBoxMaker.setWidth(7);
        String actual = TestBoxMaker.draw("");
    }
}