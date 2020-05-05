package ru.iitdgroup.nir;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.iitdgroup.nir.CoronaStat.StatRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CoronaStatTest {

    private static List<StatRecord> todayData;

    private static List<StatRecord> yesterdayData;

    /**
     * Create demo test data for all tests
     */
    @BeforeClass
    public static void setUp() {
        final String[] cities = {"Delhi", "Washington", "Paris", "Berlin", "London"};
        final int[] yesterday = {2000, 1000, 3000, 2000, 8000};
        final int[] today = {2320, 1711, 3480, 2100, 8475};
        todayData = new ArrayList<>(cities.length);
        yesterdayData = new ArrayList<>(cities.length);
        for (int i = 0; i < cities.length; i++) {
            yesterdayData.add(new StatRecord(cities[i], yesterday[i]));
            todayData.add(new StatRecord(cities[i], today[i]));
        }
        todayData.add(todayData.get(0));
        todayData.add(new StatRecord("Adelaide", 500));
        yesterdayData.add(new StatRecord("Belmont", 20));

    }

    /**
     * Naive test, works only for provided test data
     */
    @Test
    public void testNaive() {
        final List<StatRecord> dailyCases = CoronaStat.calculateStatistics(yesterdayData, todayData);
        assertEquals(dailyCases.get(0).getCity(), "Washington");
        assertEquals(dailyCases.get(1).getCity(), "Paris");
        assertEquals(dailyCases.get(2).getCity(), "London");
        assertEquals(dailyCases.get(3).getCity(), "Delhi");
        assertEquals(dailyCases.get(4).getCity(), "Berlin");
        assertEquals(dailyCases.get(0).getInfected(), 711);
        assertEquals(dailyCases.get(1).getInfected(), 480);
        assertEquals(dailyCases.get(2).getInfected(), 475);
        assertEquals(dailyCases.get(3).getInfected(), 320);
        assertEquals(dailyCases.get(4).getInfected(), 100);
    }

    /**
     * Verify sorting conditions for the list
     */
    @Test
    public void testCalculateStatistics() {
        final List<StatRecord> dailyCases = CoronaStat.calculateStatistics(yesterdayData, todayData);
        assertTrue( dailyCases.size() > 1,"Daily statistics should contain at least 2 cities");
        for (int i = 1; i < dailyCases.size(); i++) {
            StatRecord thisCity = dailyCases.get(i);
            StatRecord prevCity = dailyCases.get(i - 1);
            assertTrue(prevCity.getInfected() > thisCity.getInfected(), "Cities should be sorted from high infection rate to low");
        }
    }

    
    
    /**
     * Verify non-duplicated cities in the list
     */
    @Test
    public void testAllCitiesPresentOnce() {
        final List<StatRecord> dailyCases = CoronaStat.calculateStatistics(yesterdayData, todayData);

        Map<String, Integer> citiesStat = new HashMap<>();

        dailyCases.forEach(statRecord -> citiesStat.compute(
                statRecord.getCity(), (city, count) -> count == null ? 1 : count + 1)
        );

        final boolean containsAllandOnce = citiesStat.values().stream()
                .allMatch(count -> count.equals(1));

        assertTrue(containsAllandOnce, "All cities should present in the list only once");
    }

    /**
     * Just print the list
     */
    @Test
    public void testPrintCities() {
        final List<StatRecord> dailyCases = CoronaStat.calculateStatistics(yesterdayData, todayData);
        System.out.printf("Total len: %d%n------%n", dailyCases.size());
        dailyCases.forEach( sr -> System.out.printf("%s\t%d%n", sr.getCity(), sr.getInfected()));
    }

}