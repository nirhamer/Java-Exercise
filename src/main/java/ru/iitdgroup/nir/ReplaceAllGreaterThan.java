package ru.iitdgroup.nir;

import java.util.ArrayList;
import java.util.List;

/**
 * The exercise: Replace all numbers in the array which are greater than 15 by 0
 */


public class ReplaceAllGreaterThan {

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 28, 15, 399, 14, 5, 12, -42, 31, 15,};

        List<Integer> list = new ArrayList<Integer>();


        for (int i : data){
            list.add(i);
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i) > 15){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);

    }
}

/**
 * Replace all numbers in the array which are greater than 15 by zeros
 *
 * @param data  array to work with
 * @param limit number to compare with
 */