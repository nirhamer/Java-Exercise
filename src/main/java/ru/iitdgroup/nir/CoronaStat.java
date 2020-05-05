package ru.iitdgroup.nir;


import java.util.*;


/**
 * An exercise to work with lists, sets and maps
s */
public class CoronaStat {

    private CoronaStat() {
    }

    /**
     * Сreate the function to calculate coronavirus statistics
     * <p>Input: two sets with data: for yesterday and for today</p>
     * <p>Dataset may differ in size</p>
     * <p>Dataset the data set may contain the city 2 times (due clerc's errors)</p>
     * <p>Output: a list of changes increase / decrease cases for each city, which presents in both datasets</p>
     * <p>The list should be sorted: from highest increase (top) to highest decrease (bottom)</p>
     */
    public static List<StatRecord > calculateStatistics(List<StatRecord > yesterday, List<StatRecord > today) {
        final ArrayList<StatRecord> changes = new ArrayList<>();


        Map<String, Integer> cityToInfectedBefore = new HashMap<>();
        Map<String, Integer> cityToInfectedAfter = new HashMap<>();
        for (int i = 0; i < yesterday.size(); i++) {
            StatRecord statRecord = yesterday.get(i);
            cityToInfectedBefore.put(statRecord.getCity(), statRecord.getInfected());
        }
        for (int i = 0; i < today.size(); i++) {
            StatRecord statRecord = today.get(i);
            cityToInfectedAfter.put(statRecord.getCity(), statRecord.getInfected());
        }

        for (String city : cityToInfectedAfter.keySet()) {
            Integer  infectedToday = cityToInfectedAfter.get(city);
            Integer  infectedYesterday = cityToInfectedBefore.get(city);

            int change;
            if (infectedToday == null || infectedYesterday == null) {
                change = 0;

            }
            else { change = infectedToday - infectedYesterday;
            }

            StatRecord statRecord = new StatRecord(city, change);
            changes.add(statRecord);
        }
        changes.sort( StatRecord::compareTo);
        return changes;
    }

        /**
         * A utility class to hold city's statistics
         */
    public static class StatRecord implements Comparable<StatRecord>  {

        /**
         * The name of city
         */
        private final String city;

        /**
         * Infected persons count
         */
        private final int infected;

        public StatRecord (String city, int infected) {
            this.city = city;
            this.infected = infected;
        }

        @Override
        public String toString() {
            return "StatRecord {" +
                    "city='" + city + '\'' +
                    ", infected=" + infected +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatRecord  that = (StatRecord ) o;

            if (infected != that.infected) return false;
            return city != null ? city.equals(that.city) : that.city == null;
        }

        @Override
        public int hashCode() {
            int result = city != null ? city.hashCode() : 0;
            result = 31 * result + infected;
            return result;
        }

        public String getCity() {
            return city;
        }


        public int getInfected() {
            return infected;
        }

            @Override
            public int compareTo(StatRecord other) {
                if (infected > other.infected) {
                    return -1;
                }
                if (infected < other.infected) {
                    return 1;
                }
                return 0;
            }
        }
}
