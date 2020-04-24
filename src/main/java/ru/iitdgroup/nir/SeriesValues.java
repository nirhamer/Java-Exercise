package ru.iitdgroup.nir;

/**
 * not use utility array/collation
 * Series values exercise
 */
public class SeriesValues {

    /**
     * Create a function which will generate series of numbers like:
     *  1 --> 2 2
     *  2 --> 2 4 4
     *  3 --> 2 4 6 6
     *  4 --> 2 4 6 8 8
     *  5 --> 2 4 6 8 10 10
     *  ...
     * @param seriesLen series number
     * @return A list of values in a series, separated by single space
     */
    public static String generateSeries( int seriesLen){
        String text = "";
        for (int i = 1; i <= seriesLen; i++)  {
            text += i * 2 + " ";
        }

        text += seriesLen * 2;

        return text;
    }
}