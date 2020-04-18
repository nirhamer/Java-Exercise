package ru.iitdgroup.nir;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeriesValuesTest {

    @Test
    public void testGenerateSeries() {
        assertEquals(SeriesValues.generateSeries(1), "2 2");
        assertEquals(SeriesValues.generateSeries(2), "2 4 4");
        assertEquals(SeriesValues.generateSeries(3), "2 4 6 6");
        assertEquals(SeriesValues.generateSeries(4), "2 4 6 8 8");
        assertEquals(SeriesValues.generateSeries(5), "2 4 6 8 10 10");
    }
}