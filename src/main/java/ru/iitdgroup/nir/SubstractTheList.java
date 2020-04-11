package ru.iitdgroup.nir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The exercise: Remove all items,which are present in list B from the list A
 */
@SuppressWarnings({"squid:S106"})
public class SubstractTheList {
    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 28, 15, 3, 14, 5, 12, -42, 31, 15));
        List<Integer> listB = new ArrayList<>(Arrays.asList(15, 6, 8, 12, 31));


        System.out.println(" Original: " + listA.toString());
        System.out.println("To remove: " + listB.toString());
        removeBFromA(listA, listB);
        System.out.println("    Final: " + listA.toString());
    }

    /**
     * Remove all items,which are present in list B from the list A
     *
     * @param listA a list to work with
     * @param listB number to compare with
     */
    static void removeBFromA(List<Integer> listA, List<Integer> listB) {
        /*
         ===== CREATE CODE HERE =====
         */
    }
}
