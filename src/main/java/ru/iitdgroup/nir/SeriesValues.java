package ru.iitdgroup.nir;

import java.util.ArrayList;

/**
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
     * @param args series number
     * @return A list of values in a series, separated by single space
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            numbers.add(i+1);
        }
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++)
        {
            numbers2.add(i+1);
        }
        System.out.println(numbers2);

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++)
        {
            numbers3.add(i+1);
        }
        System.out.println(numbers3);

        ArrayList<Integer> numbers4 = new ArrayList<>();
        for(int i = 0; i < 40; i++)
        {
            numbers4.add(i+1);
        }
        System.out.println(numbers4);

        ArrayList<Integer> numbers5 = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++)
        {
            numbers5.add(i+1);
        }
        System.out.println(numbers5);


    }
}


