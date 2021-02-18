package com.epam.jwd.tasks01.application_context;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SolutionTest {
    private final double DELTA = 0.01;

    @Test
    public void testFirstTask() {
        int expected = 1;
        int actual = Solution.firstTask(9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondTask() {
        int expected = 28;
        int actual = Solution.secondTask(2, 2021);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThirdTask() {
        double expected = 0.2;
        double actual = Solution.thirdTask(0.4);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testFourthTask() {
        boolean actual = Solution.fourthTask(1, 2, 3, 4);
        Assert.assertFalse(actual);
    }

    @Test
    public void testFifthTask() {
        boolean actual = Solution.fifthTask(6);
        Assert.assertFalse(actual);
    }

    @Test
    public void testSixthTask() {
        int expectedHours = 3;
        int expectedMinutes = 27;
        int expectedSeconds = 58;
        Calendar actualCalendar = Solution.sixthTask(1678);
        int actualHours = actualCalendar.get(Calendar.HOUR);
        int actualMinutes = actualCalendar.get(Calendar.MINUTE);
        int actualSeconds = actualCalendar.get(Calendar.SECOND);
        Assert.assertEquals(expectedHours, actualHours);
        Assert.assertEquals(expectedMinutes, actualMinutes);
        Assert.assertEquals(expectedSeconds, actualSeconds);
    }

    @Test
    public void testSeventhTask() {
        int expected = 0;
        int actual = Solution.seventhTask(1, 2, 2, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEightsTask() {
        double expected = 0.048;
        double actual = Solution.eightsTask(2.99);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testNinthTask() {
        double expectedPerimeter = 31.416;
        double expectedArea = 78.54;
        double actualPerimeter = Solution.ninthTask(5)[0];
        double actualArea = Solution.ninthTask(5)[1];
        Assert.assertEquals(expectedPerimeter, actualPerimeter, DELTA);
        Assert.assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void testTenthTask() {
        Map<Double, Double> expectedTableOfArgVal = Map.of(
                0.0,	0.0,
                0.1,	0.10033467208545055,
                0.2,	0.2027100355086725,
                0.30000000000000004,	0.3093362496096233,
                0.4,	0.4227932187381618,
                0.5,	0.5463024898437905,
                0.6000000000000001,	0.6841368083416924,
                0.7000000000000001,	0.8422883804630795,
                0.8,	1.0296385570503641,
                0.9,	1.2601582175503392);
        Map<Double, Double> actualTableOfArgVal = Solution.tenthTask(.0, 1.0, 0.1);
        Assert.assertEquals(expectedTableOfArgVal, actualTableOfArgVal);
    }
}